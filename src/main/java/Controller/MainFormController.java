package Controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class MainFormController {
    public HTMLEditor txtEditor;
    public MenuBar mnu;
    public MenuItem mnuOpen;
    public MenuItem mnuNew;
    public MenuItem mnuPrint;
    public MenuItem mnuAbout;
    public MenuItem mnuClose;

    public void initialize(){
        mnuAbout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                URL resource = this.getClass().getResource("/view/AboutPage.fxml");
                try {
                    Parent load = FXMLLoader.load(resource);
                    Scene aboutscene = new Scene(load);
                    Stage aboutstage = new Stage();
                    aboutstage.setScene(aboutscene);
                    aboutstage.initModality(Modality.APPLICATION_MODAL);
                    aboutstage.show();
                    aboutstage.sizeToScene();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        });

        mnuNew.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                txtEditor.setHtmlText("");
                txtEditor.requestFocus();
            }
        });

        mnuClose.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
//                System.exit(1);  // remove jvm
                Platform.exit(); // only removing jre
            }
        });




    }
}
