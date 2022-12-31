package vaccinemanagement;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Homepage_FXMLController{

    @FXML
    Button Register_button;
    @FXML
    Button Update_Information;
    @FXML
    Button Reports;
    public void Registers(ActionEvent event) throws IOException{
         Parent root = FXMLLoader.load(getClass().getResource("Regsister_FXML.fxml"));
            Stage window= (Stage) Register_button.getScene().getWindow();
            window.setScene(new Scene(root));
    }
    public void Update_Information(ActionEvent event) throws IOException{
    Parent root = FXMLLoader.load(getClass().getResource("Update_FXML.fxml"));
            Stage window= (Stage) Update_Information.getScene().getWindow();
            window.setScene(new Scene(root));
    }
    public void Reports(ActionEvent event) throws IOException{
      Parent root = FXMLLoader.load(getClass().getResource("ViewReports.fxml"));
            Stage window= (Stage) Reports.getScene().getWindow();
            window.setScene(new Scene(root));
    }
}
