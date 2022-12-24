package hellofx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class VaccineManagementSystem extends Application {

    private List<Vaccine> vaccines;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        vaccines = new ArrayList<>();

        primaryStage.setTitle("Vaccine Management System");

        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        
        Text sceneTitle = new Text("Welcome");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0, 2, 1);


        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

    
        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

  
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

       
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                
                String userName = userTextField.getText();
                String password = pwBox.getText();
                
                if (userName.equals("admin") && password.equals("123")) {
                   
                    showHomePage(primaryStage);
                } else {
                   
                    actiontarget.setFill(Color.FIREBRICK);
                    actiontarget.setText("Invalid user name or password");
                }
            }
        });

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private void showHomePage(Stage primaryStage) {
       
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        
        Text sceneTitle = new Text("Home Page");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0, 2, 1);

        
        Button registerButton = new Button("Register Vaccine");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(registerButton);
        grid.add(hbBtn, 1, 1);

        
        registerButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showRegistrationPage(primaryStage);
            }
        });

       
        Button updateButton = new Button("Update Vaccine Information");
        hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(updateButton);
        grid.add(hbBtn, 1, 2);

       
        updateButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               
            }
        });

       
        Button reportsButton = new Button("View Reports");
        hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(reportsButton);
        grid.add(hbBtn, 1, 3);

        
        reportsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               
            }
        });

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
    }

    private void showRegistrationPage(Stage primaryStage) {
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));


        Text sceneTitle = new Text("Registration");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0, 2, 1);

       
        Label nameLabel = new Label("Name:");
        grid.add(nameLabel, 0, 1);
        TextField nameField = new TextField();
        grid.add(nameField, 1, 1);

        
        Label idLabel = new Label("ID:");
        grid.add(idLabel, 0, 2);
        TextField idField = new TextField();
        grid.add(idField, 1, 2);

       
        Label vaccineNameLabel = new Label("Vaccine Name:");
        grid.add(vaccineNameLabel, 0, 3);
        TextField vaccineNameField = new TextField();
        grid.add(vaccineNameField, 1, 3);

        
        Label doseLabel = new Label("Dose:");
        grid.add(doseLabel, 0, 4);
        TextField doseField = new TextField();
        grid.add(doseField, 1, 4);

        
        Button registerButton = new Button("Register");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(registerButton);
        grid.add(hbBtn, 1, 6);

        
        registerButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                String name = nameField.getText();
                String id = idField.getText();
                String vaccineName = vaccineNameField.getText();
                String dose = doseField.getText();

               
                Vaccine vaccine = new Vaccine(name, id, vaccineName, dose);

                
                vaccines.add(vaccine);

                
                showHomePage(primaryStage);
            }
        });

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
    }

    private static class Vaccine {
        private String name;
        private String id;
        private String vaccineName;
        private String dose;

        public Vaccine(String name, String id, String vaccineName, String dose) {
            this.name = name;
            this.id = id;
            this.vaccineName = vaccineName;
            this.dose = dose;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public String getVaccineName() {
            return vaccineName;
        }

        public String getDose() {
            return dose;
        }
    }
}

