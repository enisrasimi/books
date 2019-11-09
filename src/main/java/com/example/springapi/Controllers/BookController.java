package com.example.springapi.Controllers;


import com.example.springapi.ExceptionHandling.BookNotFoundException;
import com.example.springapi.Entity.Book;
import com.example.springapi.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    //Create new Note
    @PostMapping("books")
    public Book createNote(@Valid @RequestBody  Book book) {
        return bookRepository.save(book);
    }



    //Get All Notes
    @GetMapping("/books")
    public List<Book> getAllNotes() {
        return bookRepository.findAll();
    }

    //Get a Single Note
    @GetMapping("/books/{id}")
    public Book getNoteByid(@PathVariable(value = "id") Long bookId) throws BookNotFoundException {
        return bookRepository.findById(bookId).orElseThrow(() -> new BookNotFoundException(bookId));
    }

    @PutMapping("/books/{id}")
    public Book updateNote(@PathVariable(value = "id") Long bookId,
                           @Valid @RequestBody Book bookDetalis) throws BookNotFoundException {
        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new BookNotFoundException(bookId));
        book.setBook_name(bookDetalis.getBook_name());
        book.setBook_name(bookDetalis.getBook_name());
        book.setIsbn(bookDetalis.getIsbn());

        Book updateBook = bookRepository.save(book);
        return updateBook;
    }

    //Delete a Note
    @DeleteMapping("/books/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable(value="id") Long bookId) throws BookNotFoundException {
        Book book = bookRepository.findById(bookId).orElseThrow(() -> new BookNotFoundException(bookId));
        bookRepository.delete(book);
        return ResponseEntity.ok().build();
    }


}
