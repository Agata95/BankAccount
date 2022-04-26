package com.java.projects.Car;

public class Main {

//    ToDo: toString to modify
//     equals() to modify


    public static void main(String[] args) {
        Car car = new Car(90, false, "red", "Opel", 2004);
        System.out.println(car.areTheLightsOn());
        car.speedUp();
        car.speedUp();
        car.speedUp();
        car.turnOnTheLights();
        System.out.println(car.areTheLightsOn());
        System.out.println(car.toString());

        Cabriolet cabriolet = new Cabriolet(120, false, "black", "BMW", 2014, true);
        cabriolet.speedUp();
        cabriolet.speedUp();
        cabriolet.speedUp();
        cabriolet.speedUp();
        cabriolet.speedUp();
        cabriolet.speedUp();
        cabriolet.speedUp();
        cabriolet.speedUp();
        cabriolet.hideTheRoof();
        System.out.println(cabriolet.toString());
    }
}
