package com.pluralsight;

import com.pluralsight.finance.Asset;

public class Jewelry extends Asset {
    private double karat;

    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }
    @Override
    public double getValue() {
        return karat;
    }
}
