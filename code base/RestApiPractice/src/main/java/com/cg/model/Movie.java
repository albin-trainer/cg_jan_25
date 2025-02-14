package com.cg.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;



public class Movie {
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", genre=" + genre + ", language=" + language
				+ ", releaseDate=" + releaseDate + "]";
	}
private int movieId;
private String movieName;
private String genre;
private String language;

@JsonFormat(pattern = "yyyy-MM-dd")
private LocalDate releaseDate;

public LocalDate getReleaseDate() {
	return releaseDate;
}
public void setReleaseDate(LocalDate releaseDate) {
	this.releaseDate = releaseDate;
}
public int getMovieId() {
	return movieId;
}
public void setMovieId(int movieId) {
	this.movieId = movieId;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}

}
