package com.hillel.patterns.liskov;

public class Square extends Rectangle {

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        this.setWidth(height);
    }
}
