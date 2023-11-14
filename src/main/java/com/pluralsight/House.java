package com.pluralsight;

public class House extends Asset {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super("House", marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }
    @Override
    public double getValue() {
        return (yearBuilt) + (squareFeet) + (bedrooms);
    }
}
