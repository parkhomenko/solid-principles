package com.hillel.patterns.segregation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SegregationTest {

    public static void main(String[] args) {

        List<String> items = new ArrayList<>(
                Arrays.asList(
                        "WishCard", "Document", "Bill"
                )
        );

        Printer device = new PrinterDevice();
        device.print(items);
    }
}
