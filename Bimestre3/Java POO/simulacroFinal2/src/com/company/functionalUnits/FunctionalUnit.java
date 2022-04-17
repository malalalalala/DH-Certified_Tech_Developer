package com.company.functionalUnits;

public abstract class FunctionalUnit {
    private String address;
    private String ownerName;
    private double m2;
    private double tax;
    private double amountM2;

    public FunctionalUnit(String address, String ownerName, double m2, double tax, double amountM2) {
        this.address = address;
        this.ownerName = ownerName;
        this.m2 = m2;
        this.tax = tax;
        this.amountM2 = amountM2;
    }

    public abstract double calculatePrice();

    protected double getAmountM2() {
        return amountM2;
    }

    protected double getM2() {
        return this.m2;
    }

    protected double getTax() {
        return this.tax;
    }

    @Override
    public String toString() {
        return "FunctionalUnit{Dueño: " + this.ownerName + "; Tipo: " + this.getClass().getSimpleName() + "; Precio: " + this.calculatePrice() + "}";
    }
}
