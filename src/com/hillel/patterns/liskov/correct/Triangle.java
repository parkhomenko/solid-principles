package com.hillel.patterns.liskov.correct;

public class Triangle implements Shape {

    private int height;
    private int base;

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }


    @Override
    public int calculateArea() {
        return height * base;
    }
}
