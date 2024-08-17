package com.jcmunozo.RestBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jcmunozo.RestBook.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}