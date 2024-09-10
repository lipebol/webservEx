package dev.lipebol.webservEx_REST.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import dev.lipebol.webservEx_REST.models.Model_Tracks;

public interface Repo_Tracks extends MongoRepository<Model_Tracks, String> {

}
