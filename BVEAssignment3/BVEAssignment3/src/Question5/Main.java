package Question5;
	

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Camera;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
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
			
			PieChart pieChart=new PieChart();
			
			ObservableList<PieChart.Data> dl=FXCollections.observableArrayList();
			dl.add(new PieChart.Data("A",25.30));
			dl.add(new PieChart.Data("B",45.70));
			dl.add(new PieChart.Data("C",55.52));
			pieChart.setData(dl);
			
			Group root=new Group(pieChart);
			
			Scene scene = new Scene(root,600,600);

			primaryStage.setScene(scene);
			primaryStage.setTitle("Question5-Pie Chart Demo");
			primaryStage.show();
			

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
