package org.collections.list.ordination;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdinationPeople {
    List<Person> listPeople;

    //iniciar a lista vazia
    public OrdinationPeople() {
        this.listPeople = new ArrayList<>();
    }

    public void addPerson(String name, int age, double height) {
        listPeople.add(new Person(name, age, height));
    }

    public List<Person> sortByAge() {
        //Estou duplicando a lista
        List<Person> peopleByAge = new ArrayList<>(listPeople);
        Collections.sort(peopleByAge);
        return peopleByAge;
    }

    public List<Person> sortByHeight() {
        List<Person> peopleByHeight = new ArrayList<>(listPeople);
        Collections.sort(peopleByHeight, new ComparatorByHeight());
        return peopleByHeight;
    }
}
