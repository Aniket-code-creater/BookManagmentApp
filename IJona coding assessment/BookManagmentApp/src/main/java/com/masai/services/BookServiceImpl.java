package com.masai.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Entiy.Book;
import com.masai.Repository.BookRepository;
import com.masai.exceptions.BookNotFoundException;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> GetAllBooks() throws BookNotFoundException{
		// TODO Auto-generated method stub
		List<Book> books= bookRepository.findAll();
		if(books.isEmpty()) {
			throw new BookNotFoundException("No Books Found");
		}else {
			return books;
		}
		
		
	}

	@Override
	public Book GetBookById(Integer Id) throws BookNotFoundException{
		// TODO Auto-generated method stub
		Optional<Book> book=bookRepository.findById(Id);
		if(book.isPresent()) {
			Book book2 = book.get();
			return book2;
		}
		else {
			throw new BookNotFoundException("Book not Found By Id : "+Id);
		}
	}

	@Override
	public Book AddNewBook(Book book) {
		// TODO Auto-generated method stub
		Book book1=bookRepository.save(book);
		
		return book1;
	}

	@Override
	public Book Updatebook(Book book) throws BookNotFoundException{
		// TODO Auto-generated method stub
		Optional<Book> b1=bookRepository.findById(book.getBookId());
		if(b1.isEmpty()) {
			throw new BookNotFoundException("Book Not Found By Id : "+book.getBookId());
		}else {
			Book b2= b1.get();
			b2.setAuthor(book.getAuthor());
			b2.setBookName(book.getBookName());
			b2.setPrice(book.getPrice());
			return b2;
		}
		
	}

	@Override
	public Book DeleteBookById(Integer Id) throws BookNotFoundException{
		// TODO Auto-generated method stub
		Optional<Book> book=bookRepository.findById(Id);
		if(book.isPresent()) {
			Book b1= book.get();
			bookRepository.deleteById(Id);
			return b1;
		}
		else {
			throw new BookNotFoundException("Book Not Found By Id : "+Id);
		}
	}

}
