package dev.lipebol.webservEx_REST.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.lipebol.webservEx_REST.models.Model_Tracks;
import dev.lipebol.webservEx_REST.repositories.Repo_Tracks;

@Service
public class Service_Tracks { 
	
	@Autowired
	private Repo_Tracks r_tracks;

	public Model_Tracks create(Model_Tracks track) {
		return r_tracks.save(track);
	}
	
	public Model_Tracks update(Model_Tracks track) {
		return r_tracks.save(track);
	}
	
	public Map<String, String> notFound() {
		Map<String, String> map = new HashMap<>();
		map.put("error", "Sorry! Not Found.");
		return map;
	}
}
