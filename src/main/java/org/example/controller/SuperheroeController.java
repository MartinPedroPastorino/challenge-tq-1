package org.example.controller;

import org.example.model.Superheroe;
import org.example.service.SuperheroeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/superheroes/")
public class SuperheroeController {

    private final SuperheroeService superheroeService;

    @Autowired
    public SuperheroeController(SuperheroeService superheroeService){
        this.superheroeService = superheroeService;
    }

    @GetMapping("/all")
    public List<Superheroe> getAllSuperHeroes() {
        return superheroeService.getAllSuperHeroes();
    }

    @GetMapping("/all/{target}")
    public List<Superheroe> getAllSuperHeroesContains(@PathParam("target") String target) {
        return superheroeService.getAllSuperHeroesContains(target);
    }

    public Superheroe getSuperHeroe(Integer id) {
        return superheroeService.getSuperHeroe(id);
    }

    public Superheroe CreateSuperHeroe(String nombre) {
        return superheroeService.CreateSuperHeroe(nombre);
    }

    public Superheroe ModifySuperheroe(Integer id, String nombre) {
        return superheroeService.ModifySuperheroe(id,nombre);
    }

    public void DeleteSuperheroe(Integer id, String nombre) {
        superheroeService.DeleteSuperheroe(id,nombre);
    }

}
