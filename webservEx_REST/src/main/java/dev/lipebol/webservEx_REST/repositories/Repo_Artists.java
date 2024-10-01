package dev.lipebol.webservEx_REST.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import dev.lipebol.webservEx_REST.models.Model_Artists;

public interface Repo_Artists extends MongoRepository<Model_Artists, String> {

}
