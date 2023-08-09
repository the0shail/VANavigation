package com.example.demo;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private static Navigation navigation;
    public static Navigation getNavigation() {
        return navigation;
    }

    @Override
    public void start(Stage primatyStage) throws IOException {
        navigation = new Navigation(primatyStage);

        primatyStage.setTitle("VA Navigation");
        primatyStage.show();

        // Navigate to first view
        Main.getNavigation().load(HelloController.URL_FXML).Show();

    }

    public static void main(String[] args) {
        launch();
    }
}