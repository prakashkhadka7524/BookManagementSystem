package com.book.service.impl;

import java.util.List;

import com.book.entity.Book;
import com.book.entity.dto.BookDto;

public interface BookService{
	
	public String addBook(BookDto bookDto);
	public List<BookDto> viewAllBooks();
	public boolean deleteBook(long bookId);
	public BookDto findBookById(long bookId);
	public Book updateBook(long bookId, BookDto bookDto);

}
