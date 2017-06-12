package Question3;
	

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Camera;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Material;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Sphere s=new Sphere(150);
			
			s.setTranslateX(250);
			s.setTranslateY(250);
			s.setTranslateZ(100);
			
			PhongMaterial mat=new PhongMaterial();
			System.out.println(getClass().getResource("/images/earth.jpg"));
			mat.setDiffuseMap(new Image(getClass().getResourceAsStream("/images/earth.jpg")));

			
			s.setMaterial(mat);
			
			
			Group root=new Group(s);
			
			Scene scene = new Scene(root,600,600);
			
			Camera cam=new PerspectiveCamera();
			cam.setTranslateX(10);
			cam.setTranslateY(10);
			cam.setTranslateZ(10);
			cam.setRotate(0);
			scene.setCamera(cam);
			
		
			

//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Question3-Sphere Demo");
			primaryStage.show();
			

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
