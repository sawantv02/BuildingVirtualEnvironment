package Question1;

import javafx.animation.FadeTransition;
import javafx.animation.FillTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.PathTransition;
import javafx.animation.PathTransition.OrientationType;
import javafx.animation.PauseTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.StrokeTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Camera;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.*;
import javafx.scene.transform.Rotate;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			Rectangle rect = new Rectangle(100, 40, 100, 100);
			rect.setArcHeight(50);
			rect.setArcWidth(50);
			rect.setFill(Color.VIOLET);

			Circle c = new Circle(260, 90, 50, Color.ALICEBLUE);

			CubicCurve cc = new CubicCurve(150, 200, 100, 90, 100, 90, 50, 50);

			Rectangle re = new Rectangle(150, 40, 100, 100);
			re.setFill(Color.AQUAMARINE);
			
			Ellipse el=new Ellipse(350,250,50,100);
			el.setFill(Color.BLANCHEDALMOND);
			
			Polygon p=new Polygon(100,200,150,260,320,120,142,350);
			p.setFill(Color.AZURE);

			Group root = new Group();

			ObservableList list = root.getChildren();
			list.add(rect);
			list.add(c);
			list.add(cc);
			list.add(re);
			list.add(el);
			list.add(p);

			Scene scene = new Scene(root, 600, 600);

			// FADE TRANSITION
			FadeTransition ft = new FadeTransition(Duration.millis(3000), rect);
			ft.setFromValue(1.0);
			ft.setToValue(0.3);
			ft.setCycleCount(4);
			ft.setAutoReverse(true);
			ft.play();

			// FILL TRANSITION
			FillTransition ftc = new FillTransition(Duration.millis(3000), c, Color.RED, Color.BLUE);
			ftc.setCycleCount(4);
			ftc.setAutoReverse(true);
			ftc.play();

			// PARALLEL TRANSITION
			final Duration SEC_2 = Duration.millis(2000);
			final Duration SEC_3 = Duration.millis(3000);

			FadeTransition ft1 = new FadeTransition(SEC_3);
			ft1.setFromValue(1.0f);
			ft1.setToValue(0.3f);
			ft1.setCycleCount(2);
			ft1.setAutoReverse(true);
			TranslateTransition tt = new TranslateTransition(SEC_2);
			tt.setFromX(-100f);
			tt.setToX(100f);
			tt.setCycleCount(2);
			tt.setAutoReverse(true);
			RotateTransition rt = new RotateTransition(SEC_3);
			rt.setByAngle(180f);
			rt.setCycleCount(4);
			rt.setAutoReverse(true);
			ScaleTransition st = new ScaleTransition(SEC_2);
			st.setByX(1.5f);
			st.setByY(1.5f);
			st.setCycleCount(2);
			st.setAutoReverse(true);

			ParallelTransition pt = new ParallelTransition(cc, ft, tt, rt, st);
			pt.play();

			// PATH TRANSITION
			Path path = new Path();
			path.getElements().add(new MoveTo(0f, 50f));
			path.getElements().add(new CubicCurveTo(40f, 10f, 390f, 240f, 1904, 50f));
			
			PathTransition pathTransition=new PathTransition();

			pathTransition.setDuration(Duration.millis(10000));
			pathTransition.setNode(re);
			pathTransition.setPath(path);
			pathTransition.setOrientation(OrientationType.ORTHOGONAL_TO_TANGENT);
			pathTransition.setCycleCount(4);
			pathTransition.setAutoReverse(true);

			pathTransition.play();
			
			//PAUSE TRANSITION
		     RotateTransition rt1 = new RotateTransition(Duration.millis(3000), el);
		     rt1.setByAngle(180);
		     rt1.setCycleCount(4);
		     rt1.setAutoReverse(true);
		     SequentialTransition seqTransition = new SequentialTransition (
		         new PauseTransition(Duration.millis(1000)), // wait a second
		         rt1
		     );
		     seqTransition.play();
		     
		     //STROKE TRANSITION
		     StrokeTransition st1 = new StrokeTransition(Duration.millis(3000), p, Color.RED, Color.GREEN);
		     st1.setCycleCount(4);
		     st1.setAutoReverse(true);
		 
		     st1.play();

			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Question1 Demo");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
