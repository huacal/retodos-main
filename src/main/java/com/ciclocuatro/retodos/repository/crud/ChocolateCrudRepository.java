package com.ciclocuatro.retodos.repository.crud;

import com.ciclocuatro.retodos.model.Chocolate;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Huacal
 */
public interface ChocolateCrudRepository extends MongoRepository<Chocolate, String> {

}
