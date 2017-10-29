package com.hillel.patterns.segregation;

import java.util.List;

public class ScannerDevice implements Scanner {

    @Override
    public void scan(List<String> items) {
        items.forEach(System.out::println);
    }

}
