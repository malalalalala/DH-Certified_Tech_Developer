package com.company.administration;

import com.company.functionalUnits.FunctionalUnit;
import com.company.functionalUnits.FunctionalUnitFactory;

import java.util.HashSet;
import java.util.Set;

public class Administration {
    private Set<FunctionalUnit> units;

    public Administration() {
        this.units = new HashSet<>();
    }

    public void addFunctionalUnit(String code, String address, String ownerName, double m2, double amountM2) {
        FunctionalUnit unit = FunctionalUnitFactory.create(code, address, ownerName, m2, amountM2);
        this.units.add(unit);
    }

    public void showFunctionalUnits() {
        for (FunctionalUnit unit : this.units) {
            System.out.println(unit);
        }
    }
}
