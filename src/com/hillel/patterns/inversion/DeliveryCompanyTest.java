package com.hillel.patterns.inversion;

public class DeliveryCompanyTest {

    public static void main(String[] args) {

        MailPackage mailPackage = new MailPackage("Lamp", "Lots of lamps");

        DeliveryService deliveryService = new SlowDeliveryService();

        DeliveryCompany deliveryCompany = new DeliveryCompany(deliveryService);

        deliveryCompany.manageDelivery(mailPackage);
    }
}
