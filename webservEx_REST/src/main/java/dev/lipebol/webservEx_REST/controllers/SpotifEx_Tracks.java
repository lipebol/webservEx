package dev.lipebol.webservEx_REST.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.lipebol.webservEx_REST.models.Model_Tracks;
import dev.lipebol.webservEx_REST.services.Service_Tracks;

@RestController
@RequestMapping("/tracks")
public class SpotifEx_Tracks {
	
	@Autowired
	private Service_Tracks s_tracks;
	
	@PostMapping
	public Model_Tracks create(@RequestBody Model_Tracks track) {
		return s_tracks.create(track);
	}
	
	@PutMapping
	public Model_Tracks update(@RequestBody Model_Tracks track) {
		return s_tracks.update(track);
	}

}
