package dev.lipebol.webservEx_REST.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import dev.lipebol.webservEx_REST.models.Model_Genres;

public interface Repo_Genres extends MongoRepository<Model_Genres, String> {

}
