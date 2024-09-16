package dev.lipebol.webservEx_REST.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import dev.lipebol.webservEx_REST.models.Model_Genres;
import dev.lipebol.webservEx_REST.repositories.Repo_Genres;


@Service
public class Service_Genres { 
	
	@Autowired
	private Repo_Genres r_genres;
	
	public List<Model_Genres> getAll() {
		Sort sorted = Sort.by("name").ascending();
		return r_genres.findAll(sorted);
	}

	public Model_Genres create(Model_Genres genre) {
		return r_genres.save(genre);
	}
	
	public Model_Genres update(Model_Genres genre) {
		return r_genres.save(genre);
	}
}
