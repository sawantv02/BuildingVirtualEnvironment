package Question2;

import javafx.animation.AnimationTimer;
import javafx.animation.FadeTransition;
import javafx.animation.FillTransition;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.ParallelTransition;
import javafx.animation.PathTransition;
import javafx.animation.PathTransition.OrientationType;
import javafx.animation.PauseTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.StrokeTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.beans.property.SimpleLongProperty;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Camera;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.*;
import javafx.scene.transform.Rotate;

public class Main extends Application {

	Double translatex = 0.0;
	Double translatey = 0.0;
	Double a = 0.0;

	@Override
	public void start(Stage primaryStage) {
		try {

			int x = 300;
			int y = 300;
			AnimationTimer timer;
			Circle c1 = new Circle(x, y, 5, Color.GREENYELLOW);
			Circle c2 = new Circle(300, 270, 10, Color.GREENYELLOW);
			Circle c3 = new Circle(300, 240, 15, Color.GREENYELLOW);
			Circle c4 = new Circle(300, 200, 20, Color.GREENYELLOW);
			Circle c5 = new Circle(300, 150, 25, Color.GREENYELLOW);

			double cx = 450, cy = 450, r = 5;

			translatex = cx;
			translatey = cy;

			timer = new AnimationTimer() {

				@Override
				public void handle(long arg0) {
					// TODO Auto-generated method stub
					System.out.println(a);

					a += 30;
					a = a % 360;

					translatex += (r * Math.cos(a));

					translatey += (r * Math.sin(a));
				}

			};
			Group root = new Group();

			ObservableList list = root.getChildren();
			list.add(c1);
			list.add(c2);
			list.add(c3);
			list.add(c4);
			list.add(c5);

			Scene scene = new Scene(root, 1000, 1000);

			final Duration SEC_2 = Duration.millis(100);
			final Duration SEC_3 = Duration.millis(3000);

			final Timeline timeline = new Timeline();
			timeline.setCycleCount(Timeline.INDEFINITE);
			
			Rotate rotate = new Rotate(a, cx, cy, 0, Rotate.Z_AXIS);
			for (Node circle : root.getChildren()) {

				circle.getTransforms().add(rotate);
//				timeline.getKeyFrames()
//						.addAll(new KeyFrame(Duration.millis(5000), new KeyValue(circle.translateXProperty(), translatex),
//								new KeyValue(circle.translateYProperty(), translatey)),new KeyFrame(Duration.seconds(2), new KeyValue(rotate.angleProperty(), 360)));
				timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(2), new KeyValue(rotate.angleProperty(),360)));

			}

			timeline.play();
			timer.start();

			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Question2 Demo");
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
