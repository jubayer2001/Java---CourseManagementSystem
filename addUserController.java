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

public class addUserController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML TextField nameTf;

	@FXML TextField ageTf;

	@FXML TextField roleTf;
	
	 @FXML
	    private Label uniqueIdLabel;
	
	public void addUser(ActionEvent event) throws FileNotFoundException,IOException{
		
		String name = nameTf.getText();
		String aa= ageTf.getText();
		int age = Integer.parseInt(aa);
		
		String role = roleTf.getText();
		if(role.equalsIgnoreCase("admin"))
		{
			String adminId = Main.cms.addAdmin(name, age);
			DataHandler.saveData(Main.cms);
			 uniqueIdLabel.setText("Generated Admin ID: " + adminId);
		        DataHandler.saveData(Main.cms);
		        nameTf.setText("");
		        ageTf.setText("");
		        roleTf.setText("");
		        
		}
		else if(role.equalsIgnoreCase("instructor"))
		{
			String instructorId = Main.cms.addInstructor(name, age);
			DataHandler.saveData(Main.cms);
			 uniqueIdLabel.setText("Generated Admin ID: " + instructorId);
		        DataHandler.saveData(Main.cms);
		        nameTf.setText("");
		        ageTf.setText("");
		        roleTf.setText("");
		}
		else if(role.equalsIgnoreCase("student"))
		{
			String studentId = Main.cms.addStudent(name, age);
			DataHandler.saveData(Main.cms);
			 uniqueIdLabel.setText("Generated Admin ID: " + studentId);
		        DataHandler.saveData(Main.cms);
		        nameTf.setText("");
		        ageTf.setText("");
		        roleTf.setText("");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Not a valid role");
		}
	}
	
	  @FXML
	    private void menuPageMethod() throws IOException {
	    	
	            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("admin.fxml"));
	            Parent root = fxmlLoader.load();
	            Stage stage = new Stage();
	            stage.setScene(new Scene(root));
	            stage.show();
	        
	    }
	

				

}
