package com.hillel.patterns.inversion;

public class DeliveryCompany {

    private DeliveryService deliveryService;

    public DeliveryCompany(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public void manageDelivery(MailPackage mailPackage) {
        deliveryService.deliver(mailPackage);
    }
}
