package com.masai.controller;

import java.util.List;

import org.aspectj.weaver.patterns.HasMemberTypePatternForPerThisMatching;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Entiy.Book;
import com.masai.exceptions.BookNotFoundException;
import com.masai.services.BookService;

@RestController
@RequestMapping("/ijona")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllbooks() throws BookNotFoundException{
		List<Book> books= bookService.GetAllBooks();
		return new ResponseEntity<>(books, HttpStatus.OK);
	}
	
	
	@PostMapping("/addbook")
	public ResponseEntity<Book> Addnewbook(@RequestBody Book book){
		Book book2=bookService.AddNewBook(book);
		return new ResponseEntity<>(book2,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/bookbyId/{Id}")
	public ResponseEntity<Book> findbookById(@PathVariable("Id") Integer Id) throws BookNotFoundException{
		
		Book book= bookService.GetBookById(Id);
		return new ResponseEntity<>(book,HttpStatus.OK);
		
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<Book> updateBook(@RequestBody Book book) throws BookNotFoundException{
		Book book2=bookService.Updatebook(book);
		return new ResponseEntity<>(book2,HttpStatus.OK);
		
		
	}
	
	@DeleteMapping("/delete/{Id}")
	public ResponseEntity<Book> DeleteBookById(@PathVariable Integer Id) throws BookNotFoundException{
		Book book=bookService.DeleteBookById(Id);
		return new ResponseEntity<>(book,HttpStatus.OK);
		
	}
	
	

}
