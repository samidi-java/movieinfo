package com.fis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
/*
 * Movie Repository
 */
import org.springframework.stereotype.Repository;

import com.fis.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
	

}
