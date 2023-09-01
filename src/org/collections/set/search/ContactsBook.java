package org.collections.set.search;

import java.util.HashSet;
import java.util.Set;

public class ContactsBook {

    private Set<Contact> contactSet;

    public ContactsBook() {
        this.contactSet = new HashSet<>();
    }

    public void addContact(String name, int number) {
        contactSet.add(new Contact(name, number));
    }

    public void showContacts() {
        System.out.println(contactSet);
    }

    //Pesquisa contatos pelo nome e retorna um conjunto com os contatos encontrados.
    public Set<Contact> searchByName(String name) {
        Set<Contact> contactsByName = new HashSet<>();
        for (Contact c: contactSet) {
            if (c.getName().startsWith(name)) contactsByName.add(c);
        }
        return contactsByName;
    }

    //Atualiza o número de telefone de um contato específico.
    public Contact updateContactNumber(String name, int newNumber) {
        Contact newContact = null;
        for (Contact c: contactSet) {
            if (c.getName().equalsIgnoreCase(name)) {
                c.setNumber(newNumber);
                newContact = c;
                break;
            }
        }
        return newContact;
    }
}
