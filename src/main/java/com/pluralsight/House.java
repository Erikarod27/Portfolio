package com.pluralsight;

public class House extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(int year, int squareFeet, int bedrooms) {
        this.yearBuilt = year;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }
    public int getYearBuilt() {
        return yearBuilt;
    }
    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
    public int getSquareFeet() {
        return squareFeet;
    }
    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }
    public int getBedrooms() {
        return bedrooms;
    }
    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }
    @Override
    public double getValue(){
        return 180.0*squareFeet;
    }

    @Override
    public String toString() {
        return "House" +
                "\nDYear Built: " + getYearBuilt() +
                "\nSquare Feet: " + getSquareFeet() +
                "\nBedrooms: " + getBedrooms() +
                "\nValue: $" + getValue() + "\n";
    }
}
