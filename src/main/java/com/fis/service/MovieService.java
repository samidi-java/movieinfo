package com.fis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.model.Movie;
import com.fis.repository.MovieRepository;

/*
 * Movie service class
 */
@Service
public class MovieService {
	@Autowired
	private MovieRepository repository;
	
	public List<Movie> getAllMovies()
	{
		return repository.findAll();
	}
	public Movie getMovieById(int id)
	{
		return repository.getById(id);
	}
	
	public Movie saveOrUpdate(Movie m)
	{
		return repository.save(m);
	}
	
	public void deleteMovieById(int id)
	{
		repository.deleteById(id);
	}
	

}
