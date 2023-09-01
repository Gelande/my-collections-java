package org.collections.set.basicoperations;

import java.util.HashSet;
import java.util.Set;

public class SetGuests {

    private Set<Guest> guests;

    public SetGuests() {
        this.guests = new HashSet<>();
    }

    //Adiciona um convidado ao conjunto
    public void addGuest(String name, int invitationCode) {
        guests.add(new Guest(name, invitationCode));
    }

    //Remove um convidado do conjunto com base no código do convite.
    public void removeGuestByCodeInvite(int invitationCode) {
        Guest removeGuest = null;
        for (Guest g: guests) {
            if (g.getInvitationCode() == invitationCode) {
                removeGuest = g;
                break;
            }
        }
        guests.remove(removeGuest);
    }

    //Contar convidados
    public int countGuests() {
        return guests.size();
    }

    //Exibir convidados
    public void showGuests() {
        System.out.println(guests);
    }
}
