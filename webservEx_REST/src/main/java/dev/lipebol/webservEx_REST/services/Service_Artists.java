package dev.lipebol.webservEx_REST.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.lipebol.webservEx_REST.models.Model_Artists;
import dev.lipebol.webservEx_REST.repositories.Repo_Artists;

@Service
public class Service_Artists {
	
	@Autowired
	private Repo_Artists r_artists;
	
	public Model_Artists create(Model_Artists artist) {
		return r_artists.save(artist);
	}
	
	public Model_Artists update(Model_Artists artist) {
		return r_artists.save(artist);
	}
}