package br.com.repository;

import br.com.model.Client;
import br.com.model.Filme;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends MongoRepository<Filme, String> {


}
