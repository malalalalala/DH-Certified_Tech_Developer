package com.company.gans;

import com.company.Cap;

public class Long extends Gan implements Comparable {
    private boolean haveStamp;
    private String description;
    private int level;

    public Long(Cap cap, int ammunitionAmount, int rangeInMeters, String brand, double caliber, String condition, boolean haveStamp, String description, int level) {
        super(ammunitionAmount, rangeInMeters, brand, caliber, condition, cap);
        this.haveStamp = haveStamp;
        this.description = description;
        this.level = level;
    }

    private int getLevel() {
        return this.level;
    }

    @Override
    public int compareTo(Object o) {
        return this.level - ((Long) o).getLevel();
    }
}
