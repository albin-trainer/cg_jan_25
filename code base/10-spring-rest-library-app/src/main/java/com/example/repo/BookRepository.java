package com.example.repo;

import java.util.List;

import com.example.dto.BookDto;
import com.example.entity.Book;
import com.example.entity.Genre;

public interface BookRepository {

Book addBook(BookDto book);
List<Book> searchByGenre2(Genre genre);

List<Book> allBooks();
List<Book> searchByAuthour(int authourId);
List<Book> searchByGenre(Genre genre);
Book updateBook(Book book,int bookId);
void removeBook(int bookId);

List<Book> searchByBookName(String bookName);

}
