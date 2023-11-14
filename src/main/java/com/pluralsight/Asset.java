package com.pluralsight;

import com.pluralsight.finance.Valuable;

public abstract class Asset implements Valuable {
    protected String name;
    protected double marketValue;

    public Asset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }
    @Override
    public double getValue() {
        return marketValue;
    }
}
