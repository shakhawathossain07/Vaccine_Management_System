package vaccinemanagement;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import static vaccinemanagement.VaccineManagement.Vaccines;
import static vaccinemanagement.VaccineManagement.numerofVaccines;
public class Update_FXMLController{
        @FXML
        TextField NID_update;
        @FXML
        Button Search;
        @FXML
        Button Save;
        @FXML
        TextField ChangeNUmberOFDose;
        @FXML
        Label Warning_nid;
        @FXML
        Label warningsave;
        String nid;
        String numberdose;
        int index=-1;
        public void search(ActionEvent event){
            nid=NID_update.getText();
            for(int i=0;i<numerofVaccines;i++){
                if(nid.equals(Vaccines.get(i).getId())){
                index=i;
                Warning_nid.setText("User Found");
                break;
                }
                else {
                    Warning_nid.setText("User Not Found");
                }
            }
            
        }
        public void SAVE(ActionEvent event) throws IOException{
            if(index!=-1){
                numberdose=ChangeNUmberOFDose.getText();
            Vaccines.get(index).setDose(numberdose);
            Parent root = FXMLLoader.load(getClass().getResource("Homepage_FXML.fxml"));
            Stage window= (Stage) Save.getScene().getWindow();
            window.setScene(new Scene(root));
            }
            else{
                warningsave.setText("Search For User First");
            }
        }
        
}
