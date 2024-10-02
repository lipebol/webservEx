package dev.lipebol.webservEx_REST.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import dev.lipebol.webservEx_REST.models.Model_Playlist;

public interface Repo_Playlist extends MongoRepository<Model_Playlist, String> {

}
