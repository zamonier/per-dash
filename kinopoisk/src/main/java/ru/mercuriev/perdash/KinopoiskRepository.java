package ru.mercuriev.perdash;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Eugene on 26.03.15.
 */
@Repository
public interface KinopoiskRepository extends MongoRepository<Customer, String> {
}
