package com.company;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.MenuBar;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public SplitPane splitPane;
    public MenuBar menuBar;
    public ChoiceBox algorithms, mazesAndPatterns, speed;
    public Button drive, addPOI, clearBoard, clearWallsAndPOIs, clearPath;
    public GridPane gridPane;


    @Override
    public void initialize(URL idkYet, ResourceBundle stillDk){

    }
}
