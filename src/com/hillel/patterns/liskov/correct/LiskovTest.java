package com.hillel.patterns.liskov.correct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LiskovTest {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>(
                Arrays.asList(
                        new Square(5),
                        new Rectangle(3, 4),
                        new Triangle(8, 9)
                )
        );

        shapes.forEach(e -> System.out.println(e.calculateArea()));

    }
}
