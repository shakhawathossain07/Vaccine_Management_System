
package vaccinemanagement;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import static vaccinemanagement.VaccineManagement.Vaccines;
import static vaccinemanagement.VaccineManagement.numerofVaccines;


public class Regsister_FXMLController{
        @FXML
        TextField name_patient;
        @FXML
        TextField NID_patient;
        @FXML
        TextField vaccine_name;
        @FXML
        TextField Vaccine_dose;
        @FXML
        Button Register;
        
        
        String name;
        String NID;
        String vac_name;
        String vac_dose;
//        ArrayList<Vaccine> ArrList2;
//
//    public Regsister_FXMLController() {
//        this.ArrList2 = (ArrayList)VaccineManagement.Vaccines.clone();
//    }
        public void Register_Back_to_Homepage(ActionEvent event) throws IOException{
            name=name_patient.getText();
            NID=NID_patient.getText();
            vac_name=vaccine_name.getText();
            vac_dose=Vaccine_dose.getText();
//            if(name.eq)
            
            VaccineManagement.Vaccines.add(new Vaccine(this.name, this.NID,this.vac_name,this.vac_dose));
            System.out.println(Vaccines.get(numerofVaccines).getName());
            VaccineManagement.numerofVaccines++;
            Parent root = FXMLLoader.load(getClass().getResource("Homepage_FXML.fxml"));
            Stage window= (Stage) Register.getScene().getWindow();
            window.setScene(new Scene(root,750,750));
        }
}
