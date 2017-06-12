package Question4;

import javafx.animation.RotateTransition;
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
import javafx.scene.paint.Material;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {

			int x = 200, y = 200, z = 0;

			PhongMaterial material = new PhongMaterial();

			material.setDiffuseColor(Color.BLUE);

			// first row
			Box bx1 = new Box();
			bx1.setHeight(50);
			bx1.setWidth(50);
			bx1.setDepth(50);

			bx1.setTranslateX(x);
			bx1.setTranslateY(y);
			bx1.setTranslateZ(z);

			bx1.setMaterial(material);

			Box bx2 = new Box();
			bx2.setHeight(50);
			bx2.setWidth(50);
			bx2.setDepth(50);

			bx2.setTranslateX(x + 55);
			bx2.setTranslateY(y);
			bx2.setTranslateZ(z);

			bx2.setMaterial(material);

			Box bx3 = new Box();
			bx3.setHeight(50);
			bx3.setWidth(50);
			bx3.setDepth(50);

			bx3.setTranslateX(x + 110);
			bx3.setTranslateY(y);
			bx3.setTranslateZ(z);

			bx3.setMaterial(material);

			Box bx4 = new Box();
			bx4.setHeight(50);
			bx4.setWidth(50);
			bx4.setDepth(50);

			bx4.setTranslateX(x);
			bx4.setTranslateY(y + 55);
			bx4.setTranslateZ(z);

			bx4.setMaterial(material);

			Box bx5 = new Box();
			bx5.setHeight(50);
			bx5.setWidth(50);
			bx5.setDepth(50);

			bx5.setTranslateX(x + 55);
			bx5.setTranslateY(y + 55);
			bx5.setTranslateZ(z);

			bx5.setMaterial(material);

			Box bx6 = new Box();
			bx6.setHeight(50);
			bx6.setWidth(50);
			bx6.setDepth(50);

			bx6.setTranslateX(x + 110);
			bx6.setTranslateY(y + 55);
			bx6.setTranslateZ(z);

			bx6.setMaterial(material);

			Box bx7 = new Box();
			bx7.setHeight(50);
			bx7.setWidth(50);
			bx7.setDepth(50);

			bx7.setTranslateX(x);
			bx7.setTranslateY(y + 110);
			bx7.setTranslateZ(z);

			bx7.setMaterial(material);

			Box bx8 = new Box();
			bx8.setHeight(50);
			bx8.setWidth(50);
			bx8.setDepth(50);

			bx8.setTranslateX(x + 55);
			bx8.setTranslateY(y + 110);
			bx8.setTranslateZ(z);

			bx8.setMaterial(material);

			Box bx9 = new Box();
			bx9.setHeight(50);
			bx9.setWidth(50);
			bx9.setDepth(50);

			bx9.setTranslateX(x + 110);
			bx9.setTranslateY(y + 110);
			bx9.setTranslateZ(z);

			bx9.setMaterial(material);

			// second row
			Box by1 = new Box();
			by1.setHeight(50);
			by1.setWidth(50);
			by1.setDepth(50);

			by1.setTranslateX(x);
			by1.setTranslateY(y);
			by1.setTranslateZ(z - 55);

			by1.setMaterial(material);

			Box by2 = new Box();
			by2.setHeight(50);
			by2.setWidth(50);
			by2.setDepth(50);

			by2.setTranslateX(x + 55);
			by2.setTranslateY(y);
			by2.setTranslateZ(z - 55);

			by2.setMaterial(material);

			Box by3 = new Box();
			by3.setHeight(50);
			by3.setWidth(50);
			by3.setDepth(50);

			by3.setTranslateX(x + 110);
			by3.setTranslateY(y);
			by3.setTranslateZ(z - 55);

			by3.setMaterial(material);

			Box by4 = new Box();
			by4.setHeight(50);
			by4.setWidth(50);
			by4.setDepth(50);

			by4.setTranslateX(x);
			by4.setTranslateY(y + 55);
			by4.setTranslateZ(z - 55);

			by4.setMaterial(material);

			Box by5 = new Box();
			by5.setHeight(50);
			by5.setWidth(50);
			by5.setDepth(50);

			by5.setTranslateX(x + 55);
			by5.setTranslateY(y + 55);
			by5.setTranslateZ(z - 55);

			by5.setMaterial(material);

			Box by6 = new Box();
			by6.setHeight(50);
			by6.setWidth(50);
			by6.setDepth(50);

			by6.setTranslateX(x + 110);
			by6.setTranslateY(y + 55);
			by6.setTranslateZ(z - 55);

			by6.setMaterial(material);

			Box by7 = new Box();
			by7.setHeight(50);
			by7.setWidth(50);
			by7.setDepth(50);

			by7.setTranslateX(x);
			by7.setTranslateY(y + 110);
			by7.setTranslateZ(z - 55);

			by7.setMaterial(material);

			Box by8 = new Box();
			by8.setHeight(50);
			by8.setWidth(50);
			by8.setDepth(50);

			by8.setTranslateX(x + 55);
			by8.setTranslateY(y + 110);
			by8.setTranslateZ(z - 55);

			by8.setMaterial(material);

			Box by9 = new Box();
			by9.setHeight(50);
			by9.setWidth(50);
			by9.setDepth(50);

			by9.setTranslateX(x + 110);
			by9.setTranslateY(y + 110);
			by9.setTranslateZ(z - 55);

			by9.setMaterial(material);

			// Third row
			Box bz1 = new Box();
			bz1.setHeight(50);
			bz1.setWidth(50);
			bz1.setDepth(50);

			bz1.setTranslateX(x);
			bz1.setTranslateY(y);
			bz1.setTranslateZ(z - 110);

			bz1.setMaterial(material);

			Box bz2 = new Box();
			bz2.setHeight(50);
			bz2.setWidth(50);
			bz2.setDepth(50);

			bz2.setTranslateX(x + 55);
			bz2.setTranslateY(y);
			bz2.setTranslateZ(z - 110);

			bz2.setMaterial(material);

			Box bz3 = new Box();
			bz3.setHeight(50);
			bz3.setWidth(50);
			bz3.setDepth(50);

			bz3.setTranslateX(x + 110);
			bz3.setTranslateY(y);
			bz3.setTranslateZ(z - 110);

			bz3.setMaterial(material);

			Box bz4 = new Box();
			bz4.setHeight(50);
			bz4.setWidth(50);
			bz4.setDepth(50);

			bz4.setTranslateX(x);
			bz4.setTranslateY(y + 55);
			bz4.setTranslateZ(z - 110);

			bz4.setMaterial(material);

			Box bz5 = new Box();
			bz5.setHeight(50);
			bz5.setWidth(50);
			bz5.setDepth(50);

			bz5.setTranslateX(x + 55);
			bz5.setTranslateY(y + 55);
			bz5.setTranslateZ(z - 110);

			bz5.setMaterial(material);

			Box bz6 = new Box();
			bz6.setHeight(50);
			bz6.setWidth(50);
			bz6.setDepth(50);

			bz6.setTranslateX(x + 110);
			bz6.setTranslateY(y + 55);
			bz6.setTranslateZ(z - 110);

			bz6.setMaterial(material);

			Box bz7 = new Box();
			bz7.setHeight(50);
			bz7.setWidth(50);
			bz7.setDepth(50);

			bz7.setTranslateX(x);
			bz7.setTranslateY(y + 110);
			bz7.setTranslateZ(z - 110);

			bz7.setMaterial(material);

			Box bz8 = new Box();
			bz8.setHeight(50);
			bz8.setWidth(50);
			bz8.setDepth(50);

			bz8.setTranslateX(x + 55);
			bz8.setTranslateY(y + 110);
			bz8.setTranslateZ(z - 110);

			bz8.setMaterial(material);

			Box bz9 = new Box();
			bz9.setHeight(50);
			bz9.setWidth(50);
			bz9.setDepth(50);

			bz9.setTranslateX(x + 110);
			bz9.setTranslateY(y + 110);
			bz9.setTranslateZ(z - 110);

			bz9.setMaterial(material);

			Group root = new Group();
			ObservableList list = root.getChildren();
			// first row
			list.add(bx1);
			list.add(bx2);
			list.add(bx3);
			list.add(bx4);
			list.add(bx5);
			list.add(bx6);
			list.add(bx7);
			list.add(bx8);
			list.add(bx9);

			// second row
			list.add(by1);
			list.add(by2);
			list.add(by3);
			list.add(by4);
			list.add(by5);
			list.add(by6);
			list.add(by7);
			list.add(by8);
			list.add(by9);

			// third row

			list.add(bz1);
			list.add(bz2);
			list.add(bz3);
			list.add(bz4);
			list.add(bz5);
			list.add(bz6);
			list.add(bz7);
			list.add(bz8);
			list.add(bz9);

			Scene scene = new Scene(root, 600, 600);

			Camera cam = new PerspectiveCamera();
			cam.setTranslateX(10);
			cam.setTranslateY(10);
			cam.setTranslateZ(50);
			cam.setRotationAxis(Rotate.Y_AXIS);
			cam.setRotate(15);
			scene.setCamera(cam);

			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Question4-Rubics cube Demo");
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
