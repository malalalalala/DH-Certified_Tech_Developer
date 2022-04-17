package com.company.functionalUnits;

import java.util.Set;

public class Mall extends FunctionalUnit {
    private Set<Shop> shops;

    public Mall(String address, String ownerName, double m2, double tax, double amountM2, Set<Shop> shops) {
        super(address, ownerName, m2, tax, amountM2);
        this.shops = shops;
    }

    @Override
    public double calculatePrice() {
        double subtotal = 0;
        for (Shop shop : this.shops) {
            subtotal += shop.calculatePrice();
        }
        double discount = (subtotal * super.getTax()) / 100;
        return subtotal - discount;
    }
}
