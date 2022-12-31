
package vaccinemanagement;

import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VaccineManagement extends Application {
    public static ArrayList<Vaccine> Vaccines = new ArrayList<Vaccine>();
    public static int numerofVaccines=0;
    public static void main(String[] args) {
//        System.out.println(Vaccines[numerofVaccines].getname());
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("MainFxml.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}