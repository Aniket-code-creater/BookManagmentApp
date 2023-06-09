package com.masai.services;

import java.util.List;

import com.masai.Entiy.Book;
import com.masai.exceptions.BookNotFoundException;

public interface BookService {
	
	
	/**
	 * Retrieves all books.
	 * 
	 * @return List of all books
	 * @throws BookNotFoundException if no books are found
	 */
	public List<Book> GetAllBooks() throws BookNotFoundException;
	
	/**
	 * Retrieves a book by its ID.
	 * 
	 * @param id the ID of the book to retrieve
	 * @return the book with the specified ID
	 * @throws BookNotFoundException if the book with the given ID is not found
	 */
	public Book GetBookById(Integer Id) throws BookNotFoundException;
	

/**
	 * Adds a new book.
	 * 
	 * @param book the book to add
	 * @return the added book
	 */
	public Book AddNewBook(Book book);
	
	/**
	 * Updates an existing book.
	 * 
	 * @param book the book to update
	 * @return the updated book
	 * @throws BookNotFoundException if the book with the given ID is not found
	 */
	public Book Updatebook(Book book) throws BookNotFoundException;
	
	
	/**
	 * Deletes a book by its ID.
	 * 
	 * @param id the ID of the book to delete
	 * @return the deleted book
	 * @throws BookNotFoundException if the book with the given ID is not found
	 */
	public Book DeleteBookById(Integer Id) throws BookNotFoundException;

}
