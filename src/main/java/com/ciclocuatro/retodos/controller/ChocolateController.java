package com.ciclocuatro.retodos.controller;

import com.ciclocuatro.retodos.model.Chocolate;
import com.ciclocuatro.retodos.model.User;
import com.ciclocuatro.retodos.service.ChocolateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author Huacal
 */

@RestController
@RequestMapping("/api/chocolate")
public class ChocolateController {
    @Autowired
    private ChocolateService servicio;

    @GetMapping("/all")
    public List<Chocolate> getAll(){
        return servicio.getAll();
    }

    @GetMapping("/{reference}")
    public Optional<Chocolate> getChocolate(@PathVariable("reference") String reference) {
        return servicio.getChocolate(reference);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Chocolate create(@RequestBody Chocolate gadget) {
        return servicio.create(gadget);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Chocolate update(@RequestBody Chocolate gadget) {
        return servicio.update(gadget);
    }

    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference) {
        return servicio.delete(reference);
    }


}
