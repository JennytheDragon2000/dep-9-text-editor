import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {


        URL resource = this.getClass().getResource("/view/SplashScreen.fxml");
        Parent splashparent = FXMLLoader.load(resource);
        Scene splashscene = new Scene(splashparent);
        splashscene.setFill(Color.TRANSPARENT);
        Stage splashstage = new Stage(StageStyle.TRANSPARENT);
        splashstage.setScene(splashscene);
        splashstage.show();


//        URL resource = this.getClass().getResource("/view/MainForm.fxml");
//        Parent container = FXMLLoader.load(resource);
//        Scene scene = new Scene(container);
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("Dep 09 Text Editor");
//        primaryStage.show();


    }
}
