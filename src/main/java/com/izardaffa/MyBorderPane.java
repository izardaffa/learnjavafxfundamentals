package com.izardaffa;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MyBorderPane extends Application {

    @Override
    public void start(Stage arg0) throws Exception {
        BorderPane borderPane = new BorderPane();
        Label colorLabel = new Label("Color: Lightblue");
        
        colorLabel.setFont(new Font("Verdana", 18));
        borderPane.setTop(colorLabel);

        Rectangle rectangle = new Rectangle(100, 50, Color.LIGHTBLUE);

        borderPane.setCenter(rectangle);

        BorderPane.setAlignment(colorLabel, Pos.CENTER);
        BorderPane.setMargin(colorLabel, new Insets(20, 10, 5, 10));

        Scene scene = new Scene(borderPane, 350, 230);

        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
