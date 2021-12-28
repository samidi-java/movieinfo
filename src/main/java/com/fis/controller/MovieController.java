package com.fis.controller;

import java.util.List;
/*
 * This is movie controller class
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fis.model.Movie;
import com.fis.service.MovieService;
/*
 * Movie Rest controller
 */
@RestController
public class MovieController {

 @Autowired
 private MovieService service;
 
 @GetMapping("/movie")
 public List<Movie> getAllMovies()
 {
	 return service.getAllMovies();
 }
 
 @GetMapping("/movie/{id}")
 public Movie getMovieById(@PathVariable("id") int id)
 {
	 return service.getMovieById(id);
 }
 
 @PostMapping("/movie/create")
 public Movie saveMovie(@RequestBody Movie m)
 {
	 return service.saveOrUpdate(m);
 }
 
 @PostMapping("/movie/update")
 public Movie updateMovie(@RequestBody Movie m)
 {
	 return service.saveOrUpdate(m);
 }

 @GetMapping("/movie/delete/{id}")
 public void deleteMovieById(@PathVariable("id") int id)
 {
	 service.deleteMovieById(id);
 }
 
}
