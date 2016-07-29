package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {
        for(int i = 0; i < books.length; ++i) {
            String book = books[i];
            if(book.contains(partialBookTitle))
                printStream.println(book);
        }
    }
}
