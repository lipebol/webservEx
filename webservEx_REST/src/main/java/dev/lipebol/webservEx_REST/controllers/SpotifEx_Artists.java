package dev.lipebol.webservEx_REST.controllers;

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

import dev.lipebol.webservEx_REST.models.Model_Artists;
import dev.lipebol.webservEx_REST.services.Service_Artists;

@RestController
@RequestMapping("/artists")
public class SpotifEx_Artists {

	@Autowired
	private Service_Artists s_artists;
	
	@GetMapping
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Map<String, String> notGet() {
		return s_artists.notFound();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Model_Artists create(@RequestBody Model_Artists artist) {
		return s_artists.create(artist);
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	public Model_Artists update(@RequestBody Model_Artists artist) {
		return s_artists.update(artist);
	}
	
	@DeleteMapping
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Map<String, String> notDelete() {
		return s_artists.notFound();
	}
}
