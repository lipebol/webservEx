package dev.lipebol.webservEx_REST.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.lipebol.webservEx_REST.models.Model_Playlist;
import dev.lipebol.webservEx_REST.repositories.Repo_Playlist;

@Service
public class Service_Playlist {

	@Autowired
	private Repo_Playlist r_playlist;
	
	public Model_Playlist create(Model_Playlist track) {
		return r_playlist.save(track);
	}
	
	public Model_Playlist update(Model_Playlist track) {
		return r_playlist.save(track);
	}
	
	public Map<String, String> notFound() {
		Map<String, String> map = new HashMap<>();
		map.put("error", "Sorry! Not Found.");
		return map;
	}
	
}
