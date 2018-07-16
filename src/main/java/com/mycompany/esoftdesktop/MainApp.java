package com.mycompany.esoftdesktop;

import java.util.Optional;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;

@SpringBootConfiguration
public class MainApp extends Application {

    Alert msg;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));

        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");

        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

            @Override
            public void handle(WindowEvent windowEvent) {
                msg = new Alert(Alert.AlertType.CONFIRMATION);
                msg.setTitle("Exit");
                msg.setContentText("Do you really want to exit?");
                
                Optional<ButtonType> result = msg.showAndWait();
                if (result.get() == ButtonType.OK) {
                    System.exit(0);
                } else {

                }
                 System.exit(0);
            }
        });
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        SpringApplication.run(MainApp.class, args);

    }

}
