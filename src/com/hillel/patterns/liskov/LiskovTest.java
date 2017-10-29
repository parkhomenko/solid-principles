package com.hillel.patterns.liskov;

public class LiskovTest {

    public static void main(String[] args) {

        AreaCalculator areaCalculator = new AreaCalculator();

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(8);
        rectangle.setWidth(5);

        int area = areaCalculator.calculate(rectangle);

        System.out.println(area);

        Rectangle rectangle2 = new Square();
        rectangle2.setHeight(8);
        rectangle2.setWidth(5);

        area = areaCalculator.calculate(rectangle2);

        System.out.println(area);
    }
}
