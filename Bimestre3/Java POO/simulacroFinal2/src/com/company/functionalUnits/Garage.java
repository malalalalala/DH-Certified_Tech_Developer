package com.company.functionalUnits;

public class Garage extends FunctionalUnit {
    public Garage(String address, String ownerName, double m2, double tax, double amountM2) {
        super(address, ownerName, m2, tax, amountM2);
    }

    @Override
    public double calculatePrice() {
        double subtotal = super.getAmountM2() * super.getM2();
        double discount = (subtotal * super.getTax()) / 100;
        return subtotal - discount;
    }
}
