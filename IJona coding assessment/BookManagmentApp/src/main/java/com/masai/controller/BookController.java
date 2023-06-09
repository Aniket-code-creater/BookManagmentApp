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


//@Controller + @ResponseBody=@Restcontroller
@RestController
@RequestMapping("/ijona")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	/**
	 * Retrieves all books.
	 * 
	 * @return ResponseEntity containing a list of all books and HTTP status code OK
	 * @throws BookNotFoundException if no books are found
	 */
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllbooks() throws BookNotFoundException{
		List<Book> books= bookService.GetAllBooks();
		return new ResponseEntity<>(books, HttpStatus.OK);
	}
	
	
	/**
	 * Adds a new book.
	 * @param book the book to add
	 * @return ResponseEntity containing the added book and HTTP status code CREATED
	 */
	@PostMapping("/addbook")
	public ResponseEntity<Book> Addnewbook(@RequestBody Book book){
		Book book2=bookService.AddNewBook(book);
		return new ResponseEntity<>(book2,HttpStatus.CREATED);
	}
	
	/**
	 * Retrieves a book by its ID.
	 * 
	 * @param Id the ID of the book to retrieve
	 * @return ResponseEntity containing the book with the specified ID and HTTP status code OK
	 * @throws BookNotFoundException if the book with the given ID is not found
	 */
	@GetMapping("/bookbyId/{Id}")
	public ResponseEntity<Book> findbookById(@PathVariable("Id") Integer Id) throws BookNotFoundException{
		
		Book book= bookService.GetBookById(Id);
		return new ResponseEntity<>(book,HttpStatus.OK);
		
	}
	
	/**
	 * Updates an existing book.
	 * @param book the book to update
	 * @return ResponseEntity containing the updated book and HTTP status code OK
	 * @throws BookNotFoundException if the book with the given ID is not found
	 */
	@PutMapping("/update")
	public ResponseEntity<Book> updateBook(@RequestBody Book book) throws BookNotFoundException{
		Book book2=bookService.Updatebook(book);
		return new ResponseEntity<>(book2,HttpStatus.OK);
		
		
	}
	
	
	/**
	 * Deletes a book by its ID.
	 * @param Id the ID of the book to delete
	 * @return ResponseEntity containing the deleted book and HTTP status code OK
	 * @throws BookNotFoundException if the book with the given ID is not found
	 */
	@DeleteMapping("/delete/{Id}")
	public ResponseEntity<Book> DeleteBookById(@PathVariable Integer Id) throws BookNotFoundException{
		Book book=bookService.DeleteBookById(Id);
		return new ResponseEntity<>(book,HttpStatus.OK);
		
	}
	
	

}
