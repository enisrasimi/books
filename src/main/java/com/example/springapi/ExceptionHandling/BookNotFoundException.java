package com.example.springapi.ExceptionHandling;


public class BookNotFoundException extends Exception {
    private long book_id;
    public BookNotFoundException(long book_id) {
        super(String.format("OshoBooksService is not found with id : '%s'", book_id));
    }
}
