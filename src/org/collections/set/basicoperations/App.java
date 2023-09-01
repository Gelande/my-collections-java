package org.collections.set.basicoperations;

public class App {
    public static void main(String[] args) {

        SetGuests setGuests = new SetGuests();
        System.out.println("Existem " + setGuests.countGuests() + " convidados.");

        setGuests.addGuest("Convidado 1", 1234);
        setGuests.addGuest("Convidado 2", 1235);
        setGuests.addGuest("Convidado 3", 1235);
        setGuests.addGuest("Convidado 4", 1237);
        setGuests.addGuest("Convidado 5", 1238);

        setGuests.showGuests();
        System.out.println("Existem " + setGuests.countGuests() + " convidados.");

        setGuests.removeGuestByCodeInvite(1234);
        System.out.println("Existem " + setGuests.countGuests() + " convidados.");
    }
}
