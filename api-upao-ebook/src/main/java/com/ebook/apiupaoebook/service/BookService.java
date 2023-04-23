package com.ebook.apiupaoebook.service;


import com.ebook.apiupaoebook.model.Book;

import java.util.List;


public interface BookService {
    Book createBook(Book book);
    List<Book> getAllBooks();

}
