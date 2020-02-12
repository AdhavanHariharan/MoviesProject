package com.example.movies.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.movies.model.MoviesModel;

@Service
public class MoviesResource {

	String pref = null;

	private List<MoviesModel> movies = new ArrayList<MoviesModel>();

	public List<MoviesModel> getAllMovies() {
		return movies;
	}

	public void addMovies(MoviesModel movie) {

		movies.add(movie);
	}

	public List<MoviesModel> getMovies(String prefix, int limit) {

		pref = prefix.toLowerCase();

		return movies.stream().filter(l -> l.getMovieName().toLowerCase().startsWith(pref)).limit(limit)
				.collect(Collectors.toList());

	}
}
