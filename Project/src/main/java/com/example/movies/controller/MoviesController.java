package com.example.movies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.movies.model.MoviesModel;
import com.example.movies.resource.MoviesResource;

@RestController
public class MoviesController {

	@Autowired
	private MoviesResource moviesResource;

	/*POST method to save movies name*/	
	@RequestMapping(method = RequestMethod.POST, value = "/movies")
	@ResponseStatus(code=HttpStatus.CREATED)
	public void addTopic(@RequestBody MoviesModel movies) {
		moviesResource.addMovies(movies);
	}

	/*GET method to get movies name with prefix and limit*/	
	@RequestMapping("/movies/search/{prefix}/{limit}")
	@ResponseStatus(code=HttpStatus.OK)
	public List<MoviesModel> getMovies(@PathVariable String prefix, @PathVariable int limit) {
		return moviesResource.getMovies(prefix,limit);
	}
	
	/*GET method to view all movies name*/	
	@RequestMapping("/getAllMovies")
	public List<MoviesModel> getAllMovies() {
		return moviesResource.getAllMovies();
	}
}
