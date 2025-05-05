package application;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import uap.*;

public class addCourseController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	  @FXML
	    private TextField nameTextField;
	 
	    @FXML
	    private Label idLabel;
	
	@FXML
	public void addCourseMethod(ActionEvent event) throws  InvalidCourseException, InvalidUserException, FileNotFoundException,IOException {
		
		String name = nameTextField.getText().trim();
		String courseId = Main.cms.addCourse(name);
	    
	   idLabel.setText("Generated Course ID: " + courseId); 
       DataHandler.saveData(Main.cms);
       JOptionPane.showMessageDialog(null, "Course Added");
       
        nameTextField.setText("");

    }
		
	
	
	@FXML
	public void menuPageMethod(ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("admin.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	

}
