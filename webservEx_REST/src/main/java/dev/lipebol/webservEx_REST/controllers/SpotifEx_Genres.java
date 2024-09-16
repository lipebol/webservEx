package dev.lipebol.webservEx_REST.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.lipebol.webservEx_REST.models.Model_Genres;
import dev.lipebol.webservEx_REST.services.Service_Genres;



@RestController
@RequestMapping("/genres")
public class SpotifEx_Genres {
	
	@Autowired
	private Service_Genres s_genres;
	
	@GetMapping
	public List<Model_Genres>  allGenres(){
		return s_genres.getAll();
	}
	
	@PostMapping
	public Model_Genres create(@RequestBody Model_Genres genre) {
		return s_genres.create(genre);
	}
	
	@PutMapping
	public Model_Genres update(@RequestBody Model_Genres genre) {
		return s_genres.update(genre);
	}

}
