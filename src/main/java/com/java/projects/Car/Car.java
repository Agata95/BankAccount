package com.java.projects.Car;

public class Car {
    private int speed;
    private boolean light;
    private String colour;
    private String mark;
    private int year;

    public void speedUp() {
        if (speed < 120) {
            speed += 10;
            System.out.println("Speed up to " + speed + " km/h.");
        }
    }

    public void turnOnTheLights(){
        light = true;
    }

    public boolean areTheLightsOn(){
        return light;
    }

    public Car(int speed, boolean light) {
        this.speed = speed;
        this.light = light;
    }

    public Car(String colour, String mark, int year) {
        this.colour = colour;
        this.mark = mark;
        this.year = year;
    }

    public Car(int speed, boolean light, String colour, String mark, int year) {
        this.speed = speed;
        this.light = light;
        this.colour = colour;
        this.mark = mark;
        this.year = year;
    }

    public Car() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isLight() {
        return light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", mark='" + mark + '\'' +
                ", year=" + year +
                '}';
    }
}
