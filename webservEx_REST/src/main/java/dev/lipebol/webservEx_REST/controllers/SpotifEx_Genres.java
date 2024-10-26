package dev.lipebol.webservEx_REST.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dev.lipebol.webservEx_REST.models.Model_Genres;
import dev.lipebol.webservEx_REST.services.Service_Genres;


@RestController
@RequestMapping("/api/spotifex/genres")
public class SpotifEx_Genres {
	
	@Autowired
	private Service_Genres s_genres;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Model_Genres>  allGenres(){
		return s_genres.getAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Model_Genres create(@RequestBody Model_Genres genre) {
		return s_genres.create(genre);
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	public Model_Genres update(@RequestBody Model_Genres genre) {
		return s_genres.update(genre);
	}
	
	@DeleteMapping
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Map<String, String> notDelete() {
		return s_genres.notFound();
	}
	
}
