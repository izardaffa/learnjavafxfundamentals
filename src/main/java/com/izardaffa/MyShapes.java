package com.izardaffa;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MyShapes extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Stop[] stops = new Stop[] {
            new Stop(0, Color.LIGHTGREEN),
            new Stop(0.5, Color.LIGHTBLUE),
            new Stop(1.0, Color.DODGERBLUE),
        };

        LinearGradient gradient = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE, stops);

        Ellipse ellipse = new Ellipse(110, 70);
        ellipse.setFill(gradient);
        ellipse.setEffect(new DropShadow(30, 10, 10, Color.GRAY));

        Text text = new Text("My Shapes");
        text.setFont(new Font("Arial Bold", 24));

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(ellipse, text);

        // stackPane.setAlignment(text, Pos.CENTER_LEFT);
        // stackPane.setAlignment(Pos.TOP_CENTER);

        // Group group = new Group(ellipse, text);

        // ellipse.setCenterX(175);
        // ellipse.setCenterY(115);

        // text.setX(175 - (text.getLayoutBounds().getWidth() / 2));
        // text.setY(115 + (text.getLayoutBounds().getHeight() / 2));

        Reflection r = new Reflection();
        r.setFraction(.8);
        r.setTopOffset(1.0);
        text.setEffect(r);

        text.setOnMouseClicked(mouseEvent -> {
            System.out.println(mouseEvent.getSource().getClass() + " clicked.");
        });

        RotateTransition rotate = new RotateTransition(Duration.millis(2500), stackPane);
        rotate.setToAngle(360);
        rotate.setFromAngle(0);
        rotate.setInterpolator(Interpolator.LINEAR);

        stackPane.setOnMouseClicked(mouseEvent -> {
            if (rotate.getStatus().equals(Animation.Status.RUNNING)) {
                rotate.pause();
            } else {
                rotate.play();
            }
        });

        Scene scene = new Scene(stackPane, 350, 230, Color.LIGHTYELLOW);

        stage.setTitle("MyShapes with JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
