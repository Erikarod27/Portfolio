package com.pluralsight;

public class Jewelry extends FixedAsset {
    private double karat;
    public Jewelry(String name, double karat) {
        super(name);
        this.karat = karat;
    }
    public double getKarat() {
        return karat;
    }
    public void setKarat(double karat) {
        this.karat = karat;
    }
    @Override
    public double getValue() {
        return 2000 * karat;
    }

    @Override
    public String toString() {
        return "Jewelry" +
                "\nName: " + getName() +
                "\nKarat: " + getKarat() +
                "\nValue: " + getValue() + "\n";
    }
}
