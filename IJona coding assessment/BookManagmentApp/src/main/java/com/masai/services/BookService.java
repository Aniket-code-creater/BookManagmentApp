package com.masai.services;

import java.util.List;

import com.masai.Entiy.Book;
import com.masai.exceptions.BookNotFoundException;

public interface BookService {
	
	public List<Book> GetAllBooks() throws BookNotFoundException;
	
	
	public Book GetBookById(Integer Id) throws BookNotFoundException;
	
	public Book AddNewBook(Book book);
	
	public Book Updatebook(Book book) throws BookNotFoundException;
	
	public Book DeleteBookById(Integer Id) throws BookNotFoundException;

}
