package com.example.springapi.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="book_name")
    private String book_name;
    @Column(name="author_name")
    private String author_name;
    @Column(name="isbn")
    private String isbn;

//    @OneToOne(cascade = {CascadeType.REMOVE})
//    @JoinColumn(name="employee_id")
//    private Employee employee;









}



// creating table with query
//create table book(
//        id int not null primary key,
//        name varchar_ignorecase(50) not null,
//        author varchar_ignorecase(50) not null,
//        price int);
