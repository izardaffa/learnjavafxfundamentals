package com.izardaffa;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MyAnchorPane extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane anchorPane = new AnchorPane();
        Label label = new Label("My Label");

        anchorPane.getChildren().add(label);

        AnchorPane.setLeftAnchor(label, 10.0);
        AnchorPane.setBottomAnchor(label, 10.0);

        Scene scene = new Scene(anchorPane, 350, 230, Color.LIGHTYELLOW);

        stage.setTitle("MyAnchorPane with JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    
}
