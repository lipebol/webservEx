package dev.lipebol.webservEx_REST.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	private Service_Tracks tracks;
	
	@GetMapping
	public List<Model_Tracks>  allTracks(){
		return tracks.getAll();
	}
	
	@PostMapping
	public Model_Tracks create(@RequestBody Model_Tracks track) {
		return tracks.create(track);
	}
	
	@PutMapping
	public Model_Tracks update(@RequestBody Model_Tracks track) {
		return tracks.update(track);
	}

}
