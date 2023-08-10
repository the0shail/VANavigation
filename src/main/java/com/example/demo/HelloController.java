package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController extends BaseController {
    public static final String URL_FXML = "hello-view.fxml";
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

    }


}