package com.cg.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cg.model.Movie;
import com.cg.service.MovieService;
public class MovieCatalogue {
 private MovieService movieService;
	public Movie addMovie(  Movie m) {
		return null;
	}
	public Movie updateMovie(  Movie m,int mid) {
		return null;
	}
 public List<Movie> listAllMovies(){
	 return null;
 }
 public Movie searchById(int mid) {
	 //call service
	 return null;
 }
 

 public void deleteMovie(int mid) {
 }
 public List<Movie> searchByGenre(String genre) {
	 return null;
 }

 public List<Movie> searchByLang( String lang) {
	 //call service
	 return null;
 }
}
