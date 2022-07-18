package Controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;

public class SplashScreenController {
    public Label lblsplash;

    public void initialize(){
        System.out.println("Working ");
        KeyFrame keyFrame1 = new KeyFrame(Duration.millis(500), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblsplash.setText("Initializing the UI...");
            }
        });

        KeyFrame keyFrame2 = new KeyFrame(Duration.millis(1000), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblsplash.setText("Loading plugins....");
            }
        });

        KeyFrame keyFrame3 = new KeyFrame(Duration.millis(2000), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblsplash.setText("Loading resources....");
            }
        });

        KeyFrame keyFrame4 = new KeyFrame(Duration.millis(3000), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblsplash.setText("Finalizing....");

                URL resource = this.getClass().getResource("/view/MainForm.fxml");
                Parent container = null;
                try {
                    container = FXMLLoader.load(resource);
                    Scene scene = new Scene(container);
                    Stage primaryStage = new Stage();
                    primaryStage.setScene(scene);
                    primaryStage.setTitle("Dep 09 Text Editor");
                    primaryStage.show();
                    primaryStage.centerOnScreen();
                    lblsplash.getScene().getWindow().hide();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        });

        Timeline timeline = new Timeline(keyFrame1, keyFrame2, keyFrame3, keyFrame4);
//        Timeline timeline = new Timeline()
//        timeline.getKeyFrames().addAll(keyFrame1, keyFrame2, keyFrame3, keyFrame4)
        timeline.playFromStart();



    }
}
