package org.collections.map.basicoperations;

public class App {
    public static void main(String[] args) {

        ContactsBook contactsBook = new ContactsBook();
        contactsBook.showContacts();

        contactsBook.addContact("Vitória", 12345678);
        contactsBook.addContact("Vitória", 345678);
        contactsBook.addContact("Vitória Souza", 22222222);
        contactsBook.addContact("Vitória Vivi", 67812345);
        contactsBook.addContact("Ana Vitória", 22222222);
        contactsBook.addContact("Vitória", 5555555);
        contactsBook.showContacts();

        contactsBook.removeContact("Vitória");
        contactsBook.showContacts();

        Integer number = contactsBook.searchByName("Ana Vitória");
        System.out.println("O número solicitado é: " + number);
    }
}
