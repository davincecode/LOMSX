/*
 * Copyright (C) Vincent Ybanez 2024-Present
 * All Rights Reserved 2024
 */
package client;

import controller.ClientFormController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ClientLauncher extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/ClientForm.fxml"));
        ClientFormController controller = new ClientFormController();
        fxmlLoader.setController(controller);
        primaryStage.setScene(new Scene(fxmlLoader.load()));

        Stage cstage = new Stage();
        cstage.initModality(Modality.WINDOW_MODAL);
        cstage.initOwner(primaryStage.getScene().getWindow());
        cstage.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/LoginForm.fxml")))));
        cstage.setTitle("OnLimeChat");
        cstage.centerOnScreen();
        cstage.setResizable(false);
        cstage.show();
    }
}
