/*
 * This should be your main class where all your objects will be created
 */
package org.example;
import java.util.ArrayList;

public class App {


    public static void main(String[] args) {


    }

    class Library {
        private String name;
        private ArrayList<Book> books;

        // Constructor
        public Library(String name) {
            this.name = name;
            this.books = new ArrayList<>();
        }


        public void addBook(Book book) {
            books.add(book);
            System.out.println("Book added: " + book.getTitle());
        }

    }
}