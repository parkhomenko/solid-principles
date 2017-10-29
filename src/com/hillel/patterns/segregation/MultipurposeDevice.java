package com.hillel.patterns.segregation;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class MultipurposeDevice implements Device {

    @Override
    public void print(List<String> items) {
        items.forEach(System.out::println);
    }

    @Override
    public void scan(List<String> items) {
        throw new NotImplementedException();
    }

    @Override
    public void staple(List<String> items) {
        throw new NotImplementedException();
    }
}
