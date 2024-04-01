package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.book.entity.dto.BookDto;
import com.book.service.impl.BookServiceImpl;

@Controller
public class BookController {
	
	@Autowired
	private BookServiceImpl bookServiceImpl;
	
	@RequestMapping("/load")
    public String loadForm(Model model)
    {
  	  BookDto bookDto=new BookDto();
  	  
  	  model.addAttribute("bookDto", bookDto);
  	  
  	  
  	  return "addBooks";
    }
	@RequestMapping(value="/deleteBook")
	public String delete(@RequestParam("id")    int id,Model m)
	{
		bookServiceImpl.deleteBook(id);
		return "redirect:/viewBooks";
	}

	@RequestMapping("/register")
	public String createBook(@ModelAttribute("bookDto") BookDto bookDto,Model model)
	{
	String msg = bookServiceImpl.addBook(bookDto);
		
	model.addAttribute("msg", msg);
	
	
		return "addBooks";
	}
	@RequestMapping("/viewBooks")
	public String viewAllBooks(Model model)
	{
		List<BookDto> viewAllBooks = bookServiceImpl.viewAllBooks();
		
		model.addAttribute("books", viewAllBooks);
		return "viewBooks";
	}
	@RequestMapping("/editBook")
	public String edit(@RequestParam   int id,Model model)
	{
	BookDto custById = bookServiceImpl.findBookById(id);//data will get from database
		
model.addAttribute("cust", custById);

		return "editCustomer";
	}
	
@RequestMapping("/editSave")
public String editSave(@ModelAttribute    BookDto cust  )  
{
	String saveCustomer = bookServiceImpl.addBook(cust);

	return "redirect:/viewBooks";
}
	
	
		
	}
	


