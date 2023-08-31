package org.collections.list.ordination;

public class App {
    public static void main(String[] args) {

        OrdinationPeople ordinationPeople = new OrdinationPeople();
        ordinationPeople.addPerson("Name 1", 53, 1.53);
        ordinationPeople.addPerson("Name 2", 31, 1.50);
        ordinationPeople.addPerson("Name 3", 46, 1.72);
        ordinationPeople.addPerson("Name 4", 26, 1.60);

        System.out.println(ordinationPeople.listPeople);

        System.out.println(ordinationPeople.sortByAge());
        System.out.println(ordinationPeople.sortByHeight());
    }
}
