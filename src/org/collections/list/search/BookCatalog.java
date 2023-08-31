package org.collections.list.search;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {

    private List<Book> bookList;

    public BookCatalog() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(String title, String author, int publicationYear) {
        bookList.add(new Book(title, author, publicationYear));
    }

    public List<Book> searchByAuthor(String author) {
        //verificar se a lista está vazia antes da pesquisa
        List<Book> searchByAuthor = new ArrayList<>();
        if(!bookList.isEmpty()) {
            for (Book b: bookList) {
                if(b.getAuthor().equalsIgnoreCase(author)) {
                    searchByAuthor.add(b);
                }
            }
        }
        return searchByAuthor;
    }

    public List<Book> searchByYearRange(int initialYear, int finalYear) {
        List<Book> searchByYearRange = new ArrayList<>();
        if(!bookList.isEmpty()) {
            for (Book b: bookList) {
                if (b.getPublicationYear() >= initialYear && b.getPublicationYear() <= finalYear) {
                    searchByYearRange.add(b);
                }
            }
        }
        return searchByYearRange;
    }

    public Book searchByTitle(String title) {
        //retorna o priimeiro livro
        Book bookByTitle = null;
        if (!bookList.isEmpty()) {
            for (Book b: bookList) {
                if (b.getTitle().equalsIgnoreCase(title)) {
                    bookByTitle = b;
                    break;
                }
            }
        }
        return bookByTitle;
    }
}
