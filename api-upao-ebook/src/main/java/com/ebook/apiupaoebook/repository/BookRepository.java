package com.ebook.apiupaoebook.repository;

import com.ebook.apiupaoebook.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {



}
