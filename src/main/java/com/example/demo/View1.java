package com.example.demo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class View1 extends BaseController{
    public static final String URL_FXML = "view1.fxml";
    @FXML
    private ResourceBundle resources;

    @FXML
    private Button GoBack;

    @FXML
    private URL location;

    @FXML
    private Button goToView2;

    @FXML
    void initialize() {
        goToView2.setOnAction(actionEvent -> {
            Main.getNavigation().load(SearchController.URL_FXML).Show();
        });

        GoBack.setOnAction(actionEvent -> {
            Main.getNavigation().GoBack();
        });
    }

}
