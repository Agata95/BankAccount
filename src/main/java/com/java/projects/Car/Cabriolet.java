package com.java.projects.Car;

public class Cabriolet extends Car {
    private boolean roofIsHide;


    public void hideTheRoof(){
        roofIsHide = true;
        System.out.println("The roof is hide.");
    }

    public boolean isTheRoofIsHide(){
        return roofIsHide;
    }


    @Override
    public void speedUp(){
        if (getSpeed() < 180) {
//            int speed = getSpeed() + 50;
            setSpeed(getSpeed() + 10);
            System.out.println("Speed up to " + getSpeed() + " km/h.");
        }
    }

    public Cabriolet(int speed, boolean light, boolean roofIsHide) {
        super(speed, light);
        this.roofIsHide = roofIsHide;
    }

    public Cabriolet(String colour, String mark, int year, boolean roofIsHide) {
        super(colour, mark, year);
        this.roofIsHide = roofIsHide;
    }

    public Cabriolet(boolean roofIsHide) {
        this.roofIsHide = roofIsHide;
    }

    public boolean isRoofIsHide() {
        return roofIsHide;
    }

    public void setRoofIsHide(boolean roofIsHide) {
        this.roofIsHide = roofIsHide;
    }

    public Cabriolet(int speed, boolean light, String colour, String mark, int year, boolean roofIsHide) {
        super(speed, light, colour, mark, year);
        this.roofIsHide = roofIsHide;
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + getColour() + '\'' +
                ", mark='" + getMark() + '\'' +
                ", year=" + getYear() +
                " with sliding roof }";
    }
}
