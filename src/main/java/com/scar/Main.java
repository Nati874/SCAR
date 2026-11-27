package main.java.com.scar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("SCAR Application Running");
        Scene scene = new Scene(new StackPane(label), 600, 400);

        primaryStage.setTitle("SCAR");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
