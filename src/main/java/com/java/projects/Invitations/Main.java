package com.java.projects.Invitations;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Get number of invitations:");
        int numberOfInvitations = Integer.parseInt(scanner.nextLine());

        Invitation[] invitations = new Invitation[numberOfInvitations];

        invitations = fillInvitations(scanner, invitations);
        System.out.println("We invite " + addPeople(invitations) + " guests.");
    }

    private static Invitation[] fillInvitations(Scanner scanner, Invitation[] invitations) {
        for (int i = 0; i < invitations.length; i++) {
            System.out.println("Get name:");
            String name = scanner.nextLine();
            System.out.println("Get surname:");
            String surname = scanner.nextLine();
            System.out.println("Get invitation type from the list:");
            for (InvitationType element : InvitationType.values()) {
                System.out.println(element);
            }
            InvitationType type = (InvitationType.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT)));
            invitations[i] = new Invitation(name, surname, type);
        }
        return invitations;
    }

    private static int addPeople(Invitation[] invitation) {
        int allGuests = 0;
        for (Invitation element : invitation) {
            allGuests += element.getInvitationType().getNumberOfPeople();
        }
        return allGuests;
    }

}
