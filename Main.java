package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import uap.CourseManagementSystem;
import uap.DataHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	public static Stage stage;
	public static CourseManagementSystem cms = new CourseManagementSystem("Uap Management");
	  @Override
	    public void start(Stage primaryStage) throws Exception {
	        stage = primaryStage;
	        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
	        Scene scene = new Scene(root);
	        primaryStage.setTitle("Course Management System");
	        stage.setScene(scene);
	        stage.show();
	    }
	
	public static void main(String[] args) {
		try {
			cms = DataHandler.loadData();
			System.out.println("Load");
			
		} catch (ClassNotFoundException | IOException e) {
			System.out.println("New Data");
			cms = new CourseManagementSystem("UAP");
			cms.addAdmin("Jubayer", 22);
			
			try {
				DataHandler.saveData(cms);
			}catch(IOException e1) {
			e1.printStackTrace();
			}
		}
		
		launch(args);
	}
}



