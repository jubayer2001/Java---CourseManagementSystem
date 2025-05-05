package application;




import java.io.IOException;

import javax.swing.JOptionPane;
import uap.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class loginController {
	private Stage stage;
	private Scene scene;
	private Parent root;

    @FXML
    private TextField idTextField;

    @FXML
    private void handleLoginButtonAction() throws IOException {
    	  String userId = idTextField.getText().trim();
    	  if (userId.equals("a-1234")) {
    	        // Load admin interface directly
    	        Parent root = FXMLLoader.load(getClass().getResource("admin.fxml"));
    	        Scene scene = new Scene(root);            
    	        Main.stage.setScene(scene);
    	        Main.stage.show();
    	        return; // Exit method
    	    }

          
      
          
          try {
              User user = Main.cms.findUser(userId);
              
              
              if (user != null) {
                  if (user instanceof Admin ) {
                	  
                      
                      Parent root = FXMLLoader.load(getClass().getResource("admin.fxml"));
                      Scene scene = new Scene(root);            
                      Main.stage.setScene(scene);
                      Main.stage.show();
                      
                  } else if (user instanceof Instructor) {
                      
                      Parent root = FXMLLoader.load(getClass().getResource("instructor.fxml"));
                      Scene scene = new Scene(root);            
                      Main.stage.setScene(scene);
                      Main.stage.show();
                      
                  } else if (user instanceof Student) {
                     
                      Parent root = FXMLLoader.load(getClass().getResource("student.fxml"));
                      Scene scene = new Scene(root);            
                      Main.stage.setScene(scene);
                      Main.stage.show();
                  }
              } else {
                  
              	JOptionPane.showMessageDialog(null, "Not Found");
              }
          } catch (InvalidUserException e) {
             
          	JOptionPane.showMessageDialog(null, "Not Found");
          }
         
      }

    
    @FXML
    private void handleSignupButtonAction() throws IOException {
    	
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("signup.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        
    }
}
