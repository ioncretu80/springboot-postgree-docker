package com.example.springbootpostgreedocker.dao;

import com.example.springbootpostgreedocker.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
