package com.ciclocuatro.retodos;

import com.ciclocuatro.retodos.model.User;
import com.ciclocuatro.retodos.repository.crud.ChocolateCrudRepository;
import com.ciclocuatro.retodos.repository.crud.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;


@Component
@SpringBootApplication
public class RetodosApplication implements CommandLineRunner {
    @Autowired
    private ChocolateCrudRepository chocolateRepo;
    @Autowired
    private UserCrudRepository userRepo;

    public static void main(String[] args) {
        SpringApplication.run(RetodosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        chocolateRepo.deleteAll();
        userRepo.deleteAll();
    }


}



/*
* @Override
    public void run(String... args) throws Exception {
        userRepo.deleteAll();

        userRepo.saveAll(List.of(
                new User(1, "1018460767", "JUANA LA LOCA", "CR 19 # 19-45", "311211211", "juanalaloca@hotmail.es", "Demo123.", "ZONA 1", "ADM"),
                new User(2, "1023490007", "FEDERICO CANTOR", "CLL 26 # 10-45", "321553552", "federico@hotmail.es", "Demo123.", "ZONA 1", "COORD"),
                new User(3, "1001485007", "CARLOS VIVES", "CLL 36 # 10-33", "321553552", "carlosvives@hotmail.es", "Demo123.", "ZONA 1", "ASE"),
                new User(4, "1031463127", "BAD BUNNY", "CRA 45 # 7-06", "321650002", "badbunny@hotmail.es", "Demo123.", "ZONA 1", "ASE")
        ));

        System.out.println("Listado de usuarios");
        userRepo.findAll().forEach(System.out::println);

        Optional<User> usuarioDos = userRepo.findByEmail("juanalaloca@hotmail.es", "Demo123.");
        if (usuarioDos.isPresent()) {
            System.out.println("Datos del Usuario" + usuarioDos.get());
        }
    }
* */


