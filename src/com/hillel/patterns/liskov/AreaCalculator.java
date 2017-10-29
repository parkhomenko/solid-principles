package com.hillel.patterns.liskov;

public class AreaCalculator {

    public int calculate(Rectangle rectangle) {
        return rectangle.getHeight() * rectangle.getWidth();
    }

    public int calculate(Square square) {
        return square.getWidth() * square.getWidth();
    }
}
