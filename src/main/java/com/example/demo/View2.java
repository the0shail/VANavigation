package com.example.demo;

        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;

public class View2 extends BaseController {
    public static final String URL_FXML = "view2.fxml";

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button GoBack;

    @FXML
    private Button goToView1;

    @FXML
    void initialize() {
        goToView1.setOnAction(actionEvent -> {
            Main.getNavigation().load(View1.URL_FXML).Show();
        });

        GoBack.setOnAction(actionEvent -> {
            Main.getNavigation().GoBack();
        });
    }

}

