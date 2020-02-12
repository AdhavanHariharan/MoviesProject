package com.example.movies.model;

public class MoviesModel {
	private String movieName;

	public MoviesModel() {

	}

	public MoviesModel(String movieName) {
		super();
		this.movieName = movieName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
}
