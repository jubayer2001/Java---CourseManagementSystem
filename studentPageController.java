package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class studentPageController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
	public void logOut(ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void registerCoursesMethod(ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("registerStudentPage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void searchForCourseMethod(ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("searchStudent.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	

}
