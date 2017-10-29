package com.hillel.patterns.segregation;

import java.util.List;

public class StaplerDevice implements Stapler {

    @Override
    public void staple(List<String> items) {
        items.forEach(System.out::println);
    }

}
