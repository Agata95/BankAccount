package com.java.projects.Invitations;

public class Invitation {
    private String name;
    private String surname;
    private InvitationType invitationType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public InvitationType getInvitationType() {
        return invitationType;
    }

    public void setInvitationType(InvitationType invitationType) {
        this.invitationType = invitationType;
    }

    public Invitation(String name, String surname, InvitationType invitationType) {
        this.name = name;
        this.surname = surname;
        this.invitationType = invitationType;
    }
}
