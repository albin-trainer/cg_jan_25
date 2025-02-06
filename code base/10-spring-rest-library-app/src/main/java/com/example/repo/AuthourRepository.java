package com.example.repo;

import java.util.List;

import com.example.entity.Authour;
import com.example.entity.Book;

public interface AuthourRepository {
	public Authour addAuthour( Authour a);
	public List<Authour> allAuthours( );
	
	public Authour searchById( int id);
	public List<Authour> searchByAuthourName(String name );
	public List<Book> findByAuthour( int authourId);
}
