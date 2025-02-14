package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.dao.MovieDao;
import com.cg.model.Movie;

import jakarta.transaction.Transactional;
public class MovieServiceImpl implements MovieService{
	private MovieDao movieDao;
	public Movie addNewMovieService(Movie m) {
		return null;
	}
	public Movie searchMovieService(int movieCode) {
		//to search by PK
		return null;
	}
	public List<Movie> allmoviesService() {
		return null;
	}
	public List<Movie> searchByGenreService(String genre) {
		return null;
	}
	public List<Movie> searchByLanguageService(String lang) {
		return null;
	}
	public Movie updateMovieService(Movie m, int movieId) {
		return null;
	}

	@Override
	public void deleteMovieService(int movieId) {
	
		
	}

}
