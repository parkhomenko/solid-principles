package com.hillel.patterns.inversion;

public class FastDeliveryService implements DeliveryService {

    public void deliver(MailPackage mailPackage) {
        System.out.println(mailPackage + " fast");
    }

}
