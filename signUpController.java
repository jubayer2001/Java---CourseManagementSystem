package application;

import java.io.IOException;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import uap.*;

public class signUpController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML private TextField nameTextField;
	@FXML private TextField ageTextField;
	 
	
	@FXML
	public void signUpMethod(ActionEvent event) throws IOException {
		
		  String name = nameTextField.getText().trim();
		    String ageStr = ageTextField.getText().trim();

		   
		    if (name.isEmpty() || ageStr.isEmpty()) {
		        showErrorAlert("Please enter name and age.");
		        return;
		    }
		    

		    try {
		    	 int age = Integer.parseInt(ageStr);       
		            String loginId = Main.cms.addStudent(name, age); 
		            DataHandler.saveData(Main.cms);        
		            JOptionPane.showMessageDialog(null, "Student information saved successfully.\nGenerated ID: " + loginId);
		        } catch (NumberFormatException e) {
		        showErrorAlert("Age must be a number.");
		    }
		}

		private void showErrorAlert(String message) {
		    JOptionPane.showMessageDialog(null, message);
		}
	}


