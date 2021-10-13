package edu.csueastbay.cs401.balls;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Bounds;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class FieldController implements Initializable {

    private Ball ball;

    private Timeline timeline = new Timeline(new KeyFrame(Duration.millis(10), new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            ball.move(field);

        }
    }));

    @FXML
    private AnchorPane field;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ball = new Ball();

        // Adding to the scene
        field.getChildren().add(ball);

        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();


    }
}
