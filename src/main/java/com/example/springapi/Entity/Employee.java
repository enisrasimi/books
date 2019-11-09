package com.example.springapi.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "employee")
public class Employee {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

     @Column(name="name")
    private String name;
     @Column(name="departament")
    private String departament;
     @Column(name="salary")
    private int salary;


     //Employe in relation many to one with Book --> one employee so many books
 @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH} )
    @JoinColumn(name="books_id")
    private Book book;
}
