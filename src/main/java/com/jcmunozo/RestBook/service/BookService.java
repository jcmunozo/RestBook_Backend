package com.jcmunozo.RestBook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcmunozo.RestBook.model.Book;
import com.jcmunozo.RestBook.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book create(Book book) {
    	return bookRepository.save(book);
    }
    
    public Book update(Book book) {
    	return bookRepository.save(book);
    }
    
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Integer id) {
        Optional<Book> book = bookRepository.findById(id);
    	return book.orElse(null);
    }
    
    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }
}