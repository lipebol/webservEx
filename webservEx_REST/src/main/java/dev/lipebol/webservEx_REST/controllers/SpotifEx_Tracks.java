package dev.lipebol.webservEx_REST.controllers;


import java.util.HashMap;
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

import dev.lipebol.webservEx_REST.models.Model_Tracks;
import dev.lipebol.webservEx_REST.services.Service_Tracks;

@RestController
@RequestMapping("/tracks")
public class SpotifEx_Tracks {
	
	@Autowired
	private Service_Tracks s_tracks;
	
	@GetMapping
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Map<String, String> notGet() {
		Map<String, String> map = new HashMap<>();
		map.put("error", "Sorry! Not Found.");
		return map;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Model_Tracks create(@RequestBody Model_Tracks track) {
		return s_tracks.create(track);
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	public Model_Tracks update(@RequestBody Model_Tracks track) {
		return s_tracks.update(track);
	}
	
	@DeleteMapping
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Map<String, String> notDelete() {
		Map<String, String> map = new HashMap<>();
		map.put("error", "Sorry! Not Found.");
		return map;
	}

}
