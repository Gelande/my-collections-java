package org.collections.map.basicoperations;

import java.util.HashMap;
import java.util.Map;

public class ContactsBook {

    Map<String, Integer> contactsmap;

    public ContactsBook() {
        this.contactsmap = new HashMap<>();
    }

    //Adiciona um contato à agenda
    public void addContact(String name, Integer phoneNumber) {
        //O método put além de adicionar atualiza também.
        contactsmap.put(name, phoneNumber);
    }
    //Remove um contato da agenda, dado o nome do contato - key.
    public void removeContact(String name) {
        if (!contactsmap.isEmpty()) {
            contactsmap.remove(name);
        }
    }
    //Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
    public void showContacts() {
        System.out.println(contactsmap);
    }
    //pesquisarPorNome(String nome): Pesquisa um contato pelo nome e retorna o número de telefone correspondente.

    public Integer searchByName(String name) {
        Integer number = null;
        if (!contactsmap.isEmpty()) {
            number = contactsmap.get(name);
        }
        return number;
    }
}
