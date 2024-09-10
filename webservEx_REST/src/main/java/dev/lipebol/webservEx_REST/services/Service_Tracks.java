package dev.lipebol.webservEx_REST.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import dev.lipebol.webservEx_REST.models.Model_Tracks;
import dev.lipebol.webservEx_REST.repositories.Repo_Tracks;

@Service
public class Service_Tracks { 
	
	@Autowired
	private Repo_Tracks tracks;

	public List<Model_Tracks> getAll() {
		Sort sorted = Sort.by("artist").ascending().and(
				Sort.by("title").ascending()
			 );
		return tracks.findAll(sorted);
	}
	
	public Model_Tracks create(Model_Tracks track) {
		return tracks.save(track);
	}
	
	public Model_Tracks update(Model_Tracks track) {
		return tracks.save(track);
	}
}
