package vaccinemanagement;
import java.io.IOException;
import java.net.URL;
import java.util.Observer;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class ViewReportsController implements Initializable {
    @FXML
    Button  Back_button;
        @FXML
    private TableColumn<Vaccine, String> NID;

    @FXML
    private TableColumn<Vaccine, String> doses;

    @FXML
    private TableColumn<Vaccine, String> name;

    @FXML
    private TableColumn<Vaccine, String> vaccine_name;

    ObservableList<Vaccine>list=FXCollections.observableArrayList(VaccineManagement.Vaccines);
    
    public void initialize(URL url, ResourceBundle rb) {
        NID.setCellValueFactory(new PropertyValueFactory<Vaccine,String>("id"));
        doses.setCellValueFactory(new PropertyValueFactory<Vaccine,String>("dose"));
         name.setCellValueFactory(new PropertyValueFactory<Vaccine,String>("name"));
          vaccine_name.setCellValueFactory(new PropertyValueFactory<Vaccine,String>("vaccineName"));
    }    
    public void back_button(ActionEvent event ) throws IOException{
     Parent root = FXMLLoader.load(getClass().getResource("Homepage_FXML.fxml"));
            Stage window= (Stage) Back_button.getScene().getWindow();
            window.setScene(new Scene(root));   
    }
}
