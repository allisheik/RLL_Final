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

import com.RLL.models.book;
import com.RLL.repositories.bookRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("books")
public class BookController {

	@Autowired
	bookRepo bookrepo;

	@PostMapping("addBook")
	public book addBook(@RequestBody book b1) {
		return bookrepo.save(b1);
	}
	
	@GetMapping("allBooks")
	public List<book> getAll()
	{
		List<book> book= (List<book>) bookrepo.findAll();
		return book;
	}

			// get particular user by its ID
			@GetMapping("book/{id}")
			public Optional<book> getBookById(@PathVariable int id)
			{
				return bookrepo.findById(id);
			}
			
			// update existing user 
			@PutMapping("update/{id}")
			public book updateBook(@RequestBody book b1)
			{
				return bookrepo.save(b1);
			}
			
			// delete particular user from database
			@DeleteMapping("delete/{id}")
			public void deleteBook(@PathVariable int id)
			{
				bookrepo.deleteById(id);
			}			
}