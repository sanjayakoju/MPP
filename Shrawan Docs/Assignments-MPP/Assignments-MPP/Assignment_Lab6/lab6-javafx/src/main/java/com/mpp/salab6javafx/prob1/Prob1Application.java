package com.mpp.salab6javafx.prob1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Prob1Application extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Prob1Application.class.getResource("prob1-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 520, 540);
        stage.setTitle("Address Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}