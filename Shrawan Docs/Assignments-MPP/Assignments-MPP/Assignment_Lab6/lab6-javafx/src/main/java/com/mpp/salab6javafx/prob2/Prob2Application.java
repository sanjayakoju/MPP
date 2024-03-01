package com.mpp.salab6javafx.prob2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Prob2Application extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Prob2Application.class.getResource("prob2-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 520, 540);
        primaryStage.setTitle("String Utility");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
