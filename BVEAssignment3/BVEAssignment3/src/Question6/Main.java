package Question6;
	

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
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
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
			
	        final CategoryAxis xAxis = new CategoryAxis();
	        final NumberAxis yAxis = new NumberAxis();
	         xAxis.setLabel("Month");
	        final LineChart<String,Number> lineChart = 
	                new LineChart<String,Number>(xAxis,yAxis);
	       
	        lineChart.setTitle("Sale");
	        lineChart.setCreateSymbols(false);                                
	        XYChart.Series series1 = new XYChart.Series();
	        series1.setName("Shop 1");
	        
	        series1.getData().add(new XYChart.Data("Jan", 23));
	        series1.getData().add(new XYChart.Data("Feb", 14));
	        series1.getData().add(new XYChart.Data("Mar", 15));
	        series1.getData().add(new XYChart.Data("Apr", 24));
	        series1.getData().add(new XYChart.Data("May", 34));
	        series1.getData().add(new XYChart.Data("Jun", 36));
	        series1.getData().add(new XYChart.Data("Jul", 22));
	        series1.getData().add(new XYChart.Data("Aug", 45));
	        series1.getData().add(new XYChart.Data("Sep", 43));
	        series1.getData().add(new XYChart.Data("Oct", 17));
	        series1.getData().add(new XYChart.Data("Nov", 29));
	        series1.getData().add(new XYChart.Data("Dec", 25));
			
	        lineChart.getData().addAll(series1);
	        
			Group root=new Group(lineChart);
			
			Scene scene = new Scene(root,600,600);

			primaryStage.setScene(scene);
			primaryStage.setTitle("Question6-XY Chart Demo");
			primaryStage.show();
			

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
