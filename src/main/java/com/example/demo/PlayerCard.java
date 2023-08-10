package com.example.demo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PlayerCard extends BaseController{
    public static final String URL_FXML = "PlayerCard-view.fxml";

    @FXML
    private ResourceBundle resources;

    @FXML
    private TextField Name;

    @FXML
    private URL location;

    private String parameterFromSearchController;

    public String getParameterFromSearchController(){
        return parameterFromSearchController;
    }
    public void setParameterFromSearchController(String parameterFromSearchController){
        this.parameterFromSearchController = parameterFromSearchController;
    }

    @FXML
    void initialize() {

    }

    @Override
    public void PreShowing() {
        super.PreShowing();
        Name.setText(getParameterFromSearchController());
    }

}
