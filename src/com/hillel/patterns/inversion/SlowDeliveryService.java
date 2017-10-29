package com.hillel.patterns.inversion;

public class SlowDeliveryService implements DeliveryService {

    @Override
    public void deliver(MailPackage mailPackage) {
        System.out.println(mailPackage + " - slow");
    }
}
