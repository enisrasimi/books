package com.example.springapi.Repository;

import com.example.springapi.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;


//@Repository: Annotation used to Indicate the DAO (Data Access Object) component in the persistence layer.
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {


 @Query(
         value="select book_name,author_name,isbn from books b where b.book_name = :book_name AND b.author_name=:author_name AND b.isbn=:isbn",
         nativeQuery = true
 )
 List<Book> findAllBooksNative(@Param("book_name")String book_name, @Param("author_name") String author_name, @Param("isbn") String isbn);
}



