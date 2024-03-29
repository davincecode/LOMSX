/*
 * Copyright (C) Vincent Ybanez 2024-Present
 * All Rights Reserved 2024
 */

package server;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ServerLauncher extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        primaryStage.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/ServerForm.fxml")))));
        primaryStage.setTitle("Server");
        primaryStage.centerOnScreen();
        primaryStage.setResizable(false);
        primaryStage.show();

        Stage xstage = new Stage();
        xstage.initModality(Modality.WINDOW_MODAL);
        xstage.initOwner(primaryStage.getScene().getWindow());
        xstage.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/LoginForm.fxml")))));
        xstage.setTitle("OnLimeChat");
        xstage.centerOnScreen();
        xstage.setResizable(false);
        xstage.show();

    }
}
