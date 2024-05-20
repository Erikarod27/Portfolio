package com.pluralsight;

public abstract class FixedAsset implements Valuable {
    private String name;
    private double marketValue;

    public FixedAsset() {}

    public FixedAsset(String name) {
        this.name = name;
    }

    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getMarketValue() {
        return marketValue;
    }
}
