package com.book.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.entity.Book;
@Repository
public interface BookRepo  extends JpaRepository<Book, Long>{

	Book save(Optional<Book> book);



}
