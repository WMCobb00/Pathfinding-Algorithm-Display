package com.company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Parent root = null;
        var loc = getClass().getResource("Main.fxml");
        try
        {
            root = FXMLLoader.load(loc);
        }
        catch (IOException e)
        {
            System.out.println("FXML file not found");
        }
        Scene scene = new Scene(root, 1200, 700);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Pathfinding Algorithm Display");
        primaryStage.setMaximized(false);
        primaryStage.setResizable(true);
        primaryStage.show();
    }
}
