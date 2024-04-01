package com.book.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.entity.Book;
import com.book.entity.dto.BookDto;
import com.book.repo.BookRepo;
@Service
public class BookServiceImpl  implements BookService{

	@Autowired
	private BookRepo bookRepo=null;
	@Override
	public String addBook(BookDto bookDto) {
		Book book= new Book();
		BeanUtils.copyProperties(bookDto, book);
		Book saveBook=bookRepo.save(book);
		
		String msg="";
		if(saveBook!=null) {
			msg="Data input successfully!!";
		}
		else {
			msg="Data  does not input successfully!!";
		}
		
		return msg;
	}	

	@Override
	public List<BookDto> viewAllBooks() {
		// TODO Auto-generated method stub
		
		List<Book> books = bookRepo.findAll();
		
		
		List<BookDto>addBooks=new ArrayList<>();
		
		for(Book book: books)
		{
			
		BookDto bookDto=new BookDto();
		//copy the Entity class object data to customerDto
		BeanUtils.copyProperties(book, bookDto);
			
		addBooks.add(bookDto);
		}
		return addBooks;
		}

	@Override
	public BookDto findBookById(long bookId) {
Book book = bookRepo.findById(bookId).get();
		
		BookDto bookDto= new BookDto();
		
		BeanUtils.copyProperties(book, bookDto);
		return bookDto;
	}

	@Override
	public boolean deleteBook(long bookId) {
		Book book = bookRepo.findById(bookId).get();
		bookRepo.deleteById(bookId);
		return true;	
	}

	@Override
	public Book updateBook(long bookId,BookDto bookDto ) {
	
		 Optional<Book> book = bookRepo.findById(bookId);
	        if(book.isPresent()){
	        	Book availableBook=book.get();
	        	BeanUtils.copyProperties(bookDto, book);
	        	return bookRepo.save(availableBook);
	            
	        }
	        else {
	        	return null;
	        }
	
		
		
		
			
		
			
		}

	
		
	}


