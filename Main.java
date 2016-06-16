package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Poker Tournament Director");


        VBox vBox = new VBox();
        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }



}
