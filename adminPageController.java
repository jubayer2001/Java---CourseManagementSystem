package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class adminPageController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
	public void logOut(ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
		Scene scene = new Scene(root);			
		Main.stage.setScene(scene);
		Main.stage.show();
	}
	
	
	
		@FXML
		public void addCourseMethod(ActionEvent event) throws IOException {
			
			Parent root = FXMLLoader.load(getClass().getResource("addCourses.fxml"));
			Scene scene = new Scene(root);			
			Main.stage.setScene(scene);
			Main.stage.show();
		
	}
		@FXML
		public void searchMethod(ActionEvent event) throws IOException {
			
			Parent root = FXMLLoader.load(getClass().getResource("search.fxml"));
			Scene scene = new Scene(root);			
			Main.stage.setScene(scene);
			Main.stage.show();
		
	}
		@FXML
		public void addUserMethod(ActionEvent event) throws IOException {
			
			  FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addUserUI.fxml"));
	            Parent root = fxmlLoader.load();
	            Stage stage = new Stage();
	            stage.setScene(new Scene(root));
	            stage.show();
		
	}
		@FXML
		public void viewMethod(ActionEvent event) throws IOException {
			
			Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));
			Scene scene = new Scene(root);			
			Main.stage.setScene(scene);
			Main.stage.show();
		
	}
		@FXML
		public void viewDetailsMethod(ActionEvent event) throws IOException {
			
			Parent root = FXMLLoader.load(getClass().getResource("view Details.fxml"));
			Scene scene = new Scene(root);			
			Main.stage.setScene(scene);
			Main.stage.show();
		
	}
	
		@FXML
		public void registerForCourseMethod(ActionEvent event) throws IOException {
			
			Parent root = FXMLLoader.load(getClass().getResource("registerForCourse.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		
	}
	
		@FXML
		public void offerCourseMethod(ActionEvent event) throws IOException {
			
			Parent root = FXMLLoader.load(getClass().getResource("offerCourse.fxml"));
			Scene scene = new Scene(root);			
			Main.stage.setScene(scene);
			Main.stage.show();
		
	}

}
