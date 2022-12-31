package vaccinemanagement;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainFxmlController{

    @FXML
    Button login_button;
    @FXML
     TextField Username;
    @FXML
    TextField Password;
    @FXML
    Label Invalid_pass;
    
    String  username_given;
    String  password_given;

    public void Login(ActionEvent event) throws IOException {
        username_given = Username.getText();
        password_given = Password.getText();
        if ("a".equals(username_given) && "1".equals(password_given)) {
        
            Parent root = FXMLLoader.load(getClass().getResource("Homepage_FXML.fxml"));
            Stage window= (Stage) login_button.getScene().getWindow();
            window.setScene(new Scene(root,750,750));
//            Scene scene = new Scene(root);
//            stage.setScene(scene);
//            stage.show();
        }else{
            Invalid_pass.setText("Pass invalid!Try Again");
        }
    }

}
