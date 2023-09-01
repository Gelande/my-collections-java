package org.collections.set.search;

public class App {
    public static void main(String[] args) {

        ContactsBook contactsBook = new ContactsBook();
        contactsBook.showContacts();

        contactsBook.addContact("Ana", 21213434);
        contactsBook.addContact("Ana", 21213431);
        contactsBook.addContact("Ana Júlia", 87213434);
        contactsBook.addContact("Ana Souza", 98213434);
        contactsBook.addContact("Mary", 34213434);
        contactsBook.showContacts();

       System.out.println(contactsBook.searchByName("Mary"));
       contactsBook.updateContactNumber("Mary", 11111111 );
       System.out.println(contactsBook.searchByName("Mary"));

    }
}
