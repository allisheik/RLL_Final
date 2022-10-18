package com.RLL.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RLL.models.MovieCard;
import com.RLL.repositories.MovieCardRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("movieCart")
public class MovieCardCotroller {

	@Autowired
	MovieCardRepo mcr;
	
	@PostMapping("addCard")
	public MovieCard addProduct(@RequestBody MovieCard moviecard) {
		return mcr.save(moviecard);
	}
	
	@GetMapping("allCards")
	public List<MovieCard> getAll()
	{
		List<MovieCard> cards= (List<MovieCard>) mcr.findAll();
		return cards;
	}

			// get particular Card by its ID
			@GetMapping("card/{id}")
			public Optional<MovieCard> getCardById(@PathVariable int id)
			{
				return mcr.findById(id);
			}
			
			// update existing Card 
			@PutMapping("update/{id}")
			public MovieCard updateCard(@RequestBody MovieCard movieCard)
			{
				return mcr.save(movieCard);
			}
			
			// delete particular Card from database
			@DeleteMapping("delete/{id}")
			public void deleteCard(@PathVariable int id)
			{
				mcr.deleteById(id);
			}

	
}