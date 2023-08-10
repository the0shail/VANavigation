package com.example.demo;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class SearchController extends BaseController{
    public static final String URL_FXML = "Search-view.fxml";
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonSearch;

    @FXML
    private TextField inputDateOfBirth;

    @FXML
    private TextField inputFifaId;

    @FXML
    private TextField inputId;

    @FXML
    private ListView<String> playersList;

    @FXML
    private Label redirect;

    @FXML
    void initialize() {
        ArrayList<String> listPlayers = new ArrayList<>();
        listPlayers.add("Steve");
        listPlayers.add("Alex");

        playersList.getItems().addAll(listPlayers);

        playersList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                System.out.println(t1);
                Main.getNavigation().load(PlayerCard.URL_FXML).Show();
                PlayerCard playerCard = (PlayerCard)Main.getNavigation().load(PlayerCard.URL_FXML);
                playerCard.setParameterFromSearchController(t1);
                playerCard.Show();
            }
        });
    }


}
