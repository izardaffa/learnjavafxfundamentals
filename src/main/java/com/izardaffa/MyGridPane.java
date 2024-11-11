package com.izardaffa;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MyGridPane extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.add(new Label("Label1"), 0, 0);
        gridPane.add(new Label("Label2 panjang banget"), 1, 0, 2, 1);

        Scene scene = new Scene(gridPane, 350, 230, Color.LIGHTBLUE);
        
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}
