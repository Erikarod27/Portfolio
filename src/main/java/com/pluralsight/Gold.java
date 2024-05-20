package com.pluralsight;

public class Gold extends FixedAsset {
    private double weight;
    public Gold(double weight) {
        super();
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public double getValue() {
        return 78 * weight;
    }
    @Override
    public String toString() {
        return "Gold" +
                "\nWeight: " + getWeight() +
                "\nValue: " + getValue();
    }
}
