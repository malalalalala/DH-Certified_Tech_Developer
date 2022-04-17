package com.company.functionalUnits;

public class FunctionalUnitFactory {
    public static final String GARAGE_CODE = "COCH";
    public static final double GARAGE_TAX = 10;
    public static final String MALL_CODE = "SHOP";
    public static final double MALL_TAX = 35;
    public static final String SHOP_CODE = "LOCAL";
    public static final double SHOP_TAX = 15;
    public static final String APARTMENT_CODE = "DEPTO";
    public static final double APARTMENT_TAX = 5;

    public static FunctionalUnit create(String code, String address, String ownerName, double m2, double amountM2) {
        if (code.equals(GARAGE_CODE)) return new Garage(address, ownerName, m2, GARAGE_TAX, amountM2);
        if (code.equals(MALL_CODE)) return new Mall(address, ownerName, m2, MALL_TAX, amountM2);
        if (code.equals(SHOP_CODE)) return new Shop(address, ownerName, m2, SHOP_TAX, amountM2);
        if (code.equals(APARTMENT_CODE)) return new Apartment(address, ownerName, m2, APARTMENT_TAX, amountM2);
    }
}
