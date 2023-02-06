package com.example.springbootpostgreedocker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {


    @Id
    private Long id;
    private String name;
    private String authorName;


    public Long getId() {
        return id;
    }
}
