package com.java.projects.Invitations;

public enum InvitationType {
    SINGLE(1),
    DOUBLE(2);

    private int numberOfPeople;

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    InvitationType(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }
}
