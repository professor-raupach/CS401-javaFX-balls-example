package edu.csueastbay.cs401.balls;

import javafx.geometry.Bounds;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.util.Random;

public class Ball extends Circle {

    private Double deltaX;
    private Double deltaY;

    public Ball(){
        super();

        Random random = new Random();
        setCenterX(random.nextInt(540) + 50);
        setCenterY(random.nextInt(380) + 50);
        setRadius(random.nextInt(45) + 5);
        setFill(Color.color(random.nextFloat(), random.nextFloat(), random.nextFloat()));
        deltaX = random.nextDouble() * 5;
        deltaY = random.nextDouble() * 5;

    }

    public void move(Region field) {

        Bounds bounds = field.getLayoutBounds();

        if (getCenterX() + getRadius() > bounds.getMaxX() ||
                getCenterX() - getRadius() < 0) {
            deltaX = deltaX * -1;
        }

        if (getCenterY() + getRadius() > bounds.getMaxY() ||
                getCenterY() - getRadius() < 0) {
            deltaY = deltaY * -1;
        }

        setCenterX(getCenterX() + deltaX);
        setCenterY(getCenterY() + deltaY);


    }
}
