package com.company.gans;

import com.company.Cap;

public abstract class Gan {
    private int ammunitionAmount;//
    private int rangeInMeters;//
    private String brand;//
    private double caliber;//
    private String condition;//
    private Cap cap;//
    protected final String NEW_CONDITION = "NUEVA";
    protected final String IN_USE_CONDITION = "EN USO";
    protected final String IN_MAINTENANCE_CONDITION = "EN MANTENIMIENTO";

    public Gan(int ammunitionAmount, int rangeInMeters, String brand, double caliber, String condition, Cap cap) {
        this.ammunitionAmount = ammunitionAmount;
        this.rangeInMeters = rangeInMeters;
        this.brand = brand;
        this.caliber = caliber;
        this.cap = cap;
        setCondition(condition);
    }

    public void setCondition(String condition) {
        if (condition.equals(NEW_CONDITION) || condition.equals(IN_MAINTENANCE_CONDITION) || condition.equals(IN_USE_CONDITION)) {
            this.condition = condition;
        } else {
            System.out.println("La condición ingresada no es válida.");
        }
    }

    public boolean isEnabled() {
        final int MIN_CALIBER = 9;
        return this.condition.equals(IN_USE_CONDITION) && this.caliber >= MIN_CALIBER;
    }

    protected int getRangeInMeters() {
        return this.rangeInMeters;
    }
}
