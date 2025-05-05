package application;

import java.io.IOException;
import  java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import uap.*;

public class viewController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	 @FXML
	 private ListView<String> listView;
	
	  @FXML
	  private void initialize() {
	        
	    }
	
	@FXML
	public void instructorButton(ActionEvent event) throws IOException {
		
		  ObservableList<String> studentList = FXCollections.observableArrayList();
	        for (User user : Main.cms.getUsers()) {
	            if (user instanceof Student) {
	                studentList.add(user.getId() + " - " + user.getName());
	            }
	        }
	        listView.setItems(studentList);
		
		
	}
		
				
	
	
	@FXML
	public void studentButton(ActionEvent event) throws IOException {
		
		 ObservableList<String> instructorList = FXCollections.observableArrayList();
	        for (User user : Main.cms.getUsers()) {
	            if (user instanceof Instructor) {
	                instructorList.add(user.getId() + " - " + user.getName());
	            }
	        }
	        listView.setItems(instructorList);
	}
	
	@FXML
	public void menuPageMethod(ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("admin.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void coursesListButton(ActionEvent event) throws IOException {
		 ObservableList<String> courseList = FXCollections.observableArrayList();
	        for (Course course : Main.cms.getCourses()) {
	            courseList.add(course.getId() + " - " + course.getTitle());
	        }
	        listView.setItems(courseList);
		
	}
	
	
	
	
}
