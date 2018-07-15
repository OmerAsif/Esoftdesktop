package com.mycompany.esoftdesktop;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {

    Alert Msg;
    @FXML
    private Label Err;

    @FXML
    private void login(ActionEvent event) {
        System.out.println("You clicked me!");

    }

    @FXML
    private void Exit(ActionEvent event) {
        Msg = new Alert(Alert.AlertType.CONFIRMATION);
        Msg.setTitle("Exit");
        Msg.setContentText("Do you really want to exit?");
       
        Optional<ButtonType> result = Msg.showAndWait();
        if (result.get() == ButtonType.OK) {
            System.exit(0);
        } else{
           
        }
        
       

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
