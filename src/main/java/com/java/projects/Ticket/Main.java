package com.java.projects.Ticket;

public class Main {
    public static void main(String[] args) {
        Ticket.HALF_PRICE_HOURLY.aboutTicket();
        Ticket.HALF_PRICE_DAILY.aboutTicket();

        getTicket(18, 100,5).aboutTicket();
        getTicket(12, 35,6).aboutTicket();
        getTicket(35, 300,20).aboutTicket();
    }

    private static Ticket getTicket(int age, int drivingTime, double price) {
        if (age < 15) {
            if ((drivingTime <= Ticket.HALF_PRICE_HOURLY.getDrivingTime()) && (price >= Ticket.HALF_PRICE_HOURLY.getPrice())) {
                return Ticket.HALF_PRICE_HOURLY;
            } else if ((drivingTime > Ticket.HALF_PRICE_HOURLY.getDrivingTime()) && (price >= Ticket.HALF_PRICE_DAILY.getPrice())) {
                return Ticket.HALF_PRICE_DAILY;
            }
        } else {
            if ((drivingTime <= Ticket.NORMAL_HOURLY.getDrivingTime()) && (price >= Ticket.NORMAL_HOURLY.getPrice())) {
                return Ticket.NORMAL_HOURLY;
            } else if ((drivingTime > Ticket.NORMAL_HOURLY.getDrivingTime()) && (price >= Ticket.NORMAL_DAILY.getPrice())) {
                return Ticket.NORMAL_DAILY;
            }
        }

        return Ticket.NO_TICKET;
    }
}
