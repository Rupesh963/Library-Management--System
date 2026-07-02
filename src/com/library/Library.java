package com.library;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    // Add Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book Added Successfully.");
    }

    // View Books
    public void viewBooks() {

        if (books.isEmpty()) {
            System.out.println("No Books Available.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Issue Book
    public void issueBook(int bookId) {

        for (Book book : books) {

            if (book.getBookId() == bookId) {

                if (!book.isIssued()) {
                    book.setIssued(true);
                    System.out.println("Book Issued Successfully.");
                } else {
                    System.out.println("Book is Already Issued.");
                }

                return;
            }
        }
        System.out.println("Book Not Found.");
    }
        // Return Book
        public void returnBook(int bookId){

            for (Book book : books) {

                if (book.getBookId() == bookId) {

                    if (book.isIssued()) {
                        book.setIssued(false);
                        System.out.println("Book Returned Successfully.");
                    } else {
                        System.out.println("Book was not Issued.");
                    }

                    return;
                }
            }
            System.out.println("Book Not Found.");
        }
    }

