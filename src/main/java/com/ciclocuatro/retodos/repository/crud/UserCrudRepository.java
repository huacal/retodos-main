package com.ciclocuatro.retodos.repository.crud;

import com.ciclocuatro.retodos.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

/**
 * @author Huacal
 */
public interface UserCrudRepository extends MongoRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String password);

    //Seleccionar el usuario con el id Maximo.
    Optional<User> findTopByOrderByIdDesc();
}


