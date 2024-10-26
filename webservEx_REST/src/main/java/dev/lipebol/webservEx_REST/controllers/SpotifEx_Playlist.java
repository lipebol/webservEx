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

import dev.lipebol.webservEx_REST.models.Model_Playlist;
import dev.lipebol.webservEx_REST.services.Service_Playlist;

@RestController
@RequestMapping("/api/spotifex/playlist")
public class SpotifEx_Playlist {

	@Autowired
	private Service_Playlist s_playlist;
	
	@GetMapping
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Map<String, String> notGet() {
		return s_playlist.notFound();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Model_Playlist create(@RequestBody Model_Playlist track) {
		return s_playlist.create(track);
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	public Model_Playlist update(@RequestBody Model_Playlist track) {
		return s_playlist.update(track);
	}
	
	@DeleteMapping
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Map<String, String> notDelete() {
		return s_playlist.notFound();
	}
}
