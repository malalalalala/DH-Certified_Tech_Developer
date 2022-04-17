package com.company.gans;

import com.company.Cap;

public class Short extends Gan {
    private boolean isAutomatic;

    public Short(Cap cap, int ammunitionAmount, int rangeInMeters, String brand, double caliber, String condition, boolean isAutomatic) {
        super(ammunitionAmount, rangeInMeters, brand, caliber, condition, cap);
        this.isAutomatic = isAutomatic;
    }

    public boolean haveLongShot() {
        final int MIN_METERS_LONG_SHOT = 200;
        return super.getRangeInMeters() > MIN_METERS_LONG_SHOT;
    }
}
