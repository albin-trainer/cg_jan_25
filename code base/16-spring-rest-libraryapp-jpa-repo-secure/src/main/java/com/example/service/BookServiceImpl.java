package com.example.service;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.dto.BookDto;
import com.example.entity.Authour;
import com.example.entity.Book;
import com.example.entity.Genre;
import com.example.exception.AuthourNotFoundException;
import com.example.exception.BookNotFoundException;
import com.example.repo.AuthourRepository;
import com.example.repo.BookRepository;
//@Component
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository bookRepo;
	@Autowired
	private AuthourRepository authourRepo;
	public Book addBookService(BookDto bookDto) {
		//from authourId get AuthourObj
		//copy data from dto to Book
		//store Authour obj in Book
		
		  Optional<Authour> authourOpt=authourRepo.findById(bookDto.getAuthourId());
		  
		  
		  if(authourOpt.isPresent()) { Authour a=authourOpt.get(); Book b=new Book();
		 b.setBookName(bookDto.getBookName());
		   b.setCost(bookDto.getCost()); 
		  b.setGenre(bookDto.getGenre()); 
		   b.setStock(bookDto.getStock()); //
		  b.setAuthour(a); return bookRepo.save(b); } else throw new
		  AuthourNotFoundException("Authour not found");
		 
	}

	@Override
	public List<Book> searchByGenre2Service(Genre genre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> allBooksService() {
		// TODO Auto-generated method stub
		return bookRepo.findAll();
	}

	@Override
	public List<Book> searchByAuthourService(int authourId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> searchByGenreService(Genre genre) {
		// TODO Auto-generated method stub
		return null;
	}

	public Book updateBookService(BookDto bookDto, int bookId) {
		
		  Supplier<BookNotFoundException> s=() -> new
		  BookNotFoundException("Book not found"); Book book=bookRepo.findById(bookId).
		  orElseThrow(s); book.setBookName(bookDto.getBookName());
		  book.setCost(bookDto.getCost()); book.setGenre(bookDto.getGenre());
		  book.setStock(bookDto.getStock()); bookRepo.save(book); return book;
		 
	}

	@Override
	public void removeBookService(int bookId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Book> searchByBookNameService(String bookName) {
		// TODO Auto-generated method stub
		return null;
	}

 
}
