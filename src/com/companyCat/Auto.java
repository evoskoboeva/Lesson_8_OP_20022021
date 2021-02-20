package com.companyCat;

import java.util.Calendar;
import java.util.Objects;

public class Auto {
    private String carBrand;
    private int year;
    private String color;
    private double volume;
    private String fuel;
    private  long mileage;
    private String comment;
    private final long MILEAGEMIN = 1000;
    private final int YEARBIG = 10;

    public String IsSuspicious(String comment){
        if ((year <= (Calendar.getInstance().get(Calendar.YEAR)-YEARBIG))&&(mileage <= MILEAGEMIN)){
            return comment = "car is suspicious";
        }
        else {
            return comment = "ok";
        }

    }


    @Override
    public String toString() {
        return "Auto{" +
                "carBrand='" + carBrand + '\'' +
                ", year=" + (this.year<0? "This car has not yet been produced)))))": this.year) +
                ", color='" + color + '\'' +
                ", volume=" + (this.volume<0? "not correct volume": this.volume) +
                ", fuel='" + fuel + '\'' +
                ", mileage=" + (this.mileage<0? "not correct milleage": this.mileage) +
                ", comment=" +IsSuspicious(comment)+
                '}';
    }

    public Auto(String carBrand, int year, String color, double volume, String fuel, long mileage) {
        this.carBrand = carBrand;
        this.setYear(year);
        this.color = color;
        this.setVolume(volume);
        this.fuel = fuel;
        this.setMileage(mileage);
        //this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auto)) return false;
        Auto auto = (Auto) o;
        return getYear() == auto.getYear() && Double.compare(auto.getVolume(), getVolume()) == 0 && getMileage() == auto.getMileage() && Objects.equals(getCarBrand(), auto.getCarBrand()) && Objects.equals(getColor(), auto.getColor()) && Objects.equals(getFuel(), auto.getFuel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCarBrand(), getYear(), getColor(), getVolume(), getFuel(), getMileage());
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setYear(int year) {
        if (year> Calendar.getInstance().get(Calendar.YEAR)){
            this.year = -1;
        }
        else this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVolume(double volume) {
        if (volume < 0 || volume > 20) {
            this.volume = -1;
        } else {
            this.volume = volume;
        }
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void setMileage(long mileage) {
        if (mileage < 0 || mileage > 10000000) {
            this.mileage = -1;
        } else {
            this.mileage = mileage;
        }
    }
    public String getCarBrand() {
        return carBrand;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getVolume() {
        return volume;
    }

    public String getFuel() {
        return fuel;
    }

    public long getMileage() {
        return mileage;
    }

}
