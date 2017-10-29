package com.hillel.patterns.segregation;

import java.util.List;

public class PrinterDevice implements Printer {

    @Override
    public void print(List<String> items) {
        items.forEach(System.out::println);
    }
}
