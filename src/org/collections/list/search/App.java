package org.collections.list.search;

public class App {
    public static void main(String[] args) {
        BookCatalog bookCatalog = new BookCatalog();
        bookCatalog.addBook("Book 1", "Author 1", 2003);
        bookCatalog.addBook("Book 1", "Author 2", 2007);
        bookCatalog.addBook("Book 2", "Author 2", 2011);
        bookCatalog.addBook("Book 3", "Author 3", 2015);
        bookCatalog.addBook("Book 4", "Author 4", 2020);

        System.out.println(bookCatalog.searchByAuthor("Author 2"));
        System.out.println(bookCatalog.searchByYearRange(2012, 2020));
        System.out.println(bookCatalog.searchByTitle("Book 1"));
    }
}
