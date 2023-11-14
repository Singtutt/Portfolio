package com.pluralsight.finance;
import java.util.*;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = assets;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void addAsset(Valuable asset) {
        assets.add(asset);
    }
    public double getValue() {
        double totalValue = 0;
        for (Valuable asset : assets) {
            totalValue += asset.getValue();
        }
        return  totalValue;
    }
    public Valuable getMostValuable() {
        if ( assets.isEmpty()) {
            return null;
        }
        Valuable mostValuable = assets.get(0);
        for (Valuable asset : assets) {
            if (asset.getValue() > mostValuable.getValue()) {
                mostValuable = asset;
            }
        }
        return mostValuable;
    }
    public Valuable getLeastValuable() {
        if (assets.isEmpty()) {
            return null;
        }
        Valuable leastValuable = assets.get(0);
        for (Valuable asset : assets) {
            if (asset.getValue() < leastValuable.getValue()) {
                leastValuable = asset;
            }
        }
        return leastValuable;
    }



}
