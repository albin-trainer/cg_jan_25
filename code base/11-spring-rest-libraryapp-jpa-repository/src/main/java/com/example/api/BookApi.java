package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.BookDto;
import com.example.entity.Authour;
import com.example.entity.Book;
import com.example.entity.Genre;
import com.example.service.BookService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/books")
public class BookApi {
	@Autowired
	private BookService bookService;
	@PostMapping
	public Book addBook(  @RequestBody  BookDto bookDto){
	 return bookService.addBookService(bookDto);
	}
	@PutMapping("/{bookId}")
	public Book updateBook( @RequestBody @Valid BookDto dto, @PathVariable("bookId") int bookId) {
		return bookService.updateBookService(dto, bookId);
	}
	public void deleteBook(int bookId) {
	}
	public List<Book> searchByAuthourId(int authourId){
		return null;
	}
	public List<Book> allBooks(){
		 return null;
	}
	public List<Book> findByGenre( Genre genre){
		 return null;
	}
	public List<Book> findByGenre2(  Genre genre){
		 return null;
	}
}

