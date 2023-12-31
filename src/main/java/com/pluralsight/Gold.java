package com.pluralsight;

import com.pluralsight.finance.Asset;

public class Gold extends Asset {
    private double weight;

    public Gold(String name, double marketValue, double weight) {
        super("Gold", marketValue);
        this.weight = weight;
    }
    @Override
    public double getValue() {
        return weight;
    }
}
