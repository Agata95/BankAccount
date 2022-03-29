package com.java.projects.Ticket;

public enum Ticket {
    HALF_PRICE_HOURLY(1.5d, 60),
    HALF_PRICE_DAILY(6d, 720),
    NORMAL_HOURLY(3d, 60),
    NORMAL_DAILY(12d, 720),
    NO_TICKET(0d, 0);

    private double price;
    private int drivingTime;

    public void aboutTicket() {
        int duration = changeMinToHouers(this.drivingTime);
        System.out.println(this.name() + " driving time is " + duration + "h, cost: " + this.getPrice() + "$.");
    }

    private int changeMinToHouers(int drivingTime) {
        return (drivingTime/60);
    }

    public double getPrice() {
        return price;
    }

    public int getDrivingTime() {
        return drivingTime;
    }

    Ticket(double price, int drivingTime) {
        this.price = price;
        this.drivingTime = drivingTime;
    }
}
