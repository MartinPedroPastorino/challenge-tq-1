package org.example.controller;

import org.example.model.Superheroe;
import org.example.service.SuperheroeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/superheroes")
public class SuperheroeController {

    @Autowired
    private SuperheroeService superheroeService;

    @GetMapping
    public List<Superheroe> getAllSuperheroes() {
        return superheroeService.getAllSuperHeroes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Superheroe> getSuperheroeById(@PathVariable Integer id) {
        Optional<Superheroe> superheroe = superheroeService.getSuperHeroeById(id);
        return superheroe.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Superheroe createSuperheroe(@RequestBody Superheroe superheroe) {
        return superheroeService.saveSuperheroe(superheroe);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Superheroe> updateSuperheroe(@PathVariable Integer id, @RequestBody Superheroe updatedSuperheroe) {
        try {
            return ResponseEntity.ok(superheroeService.updateSuperheroe(id, updatedSuperheroe));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSuperheroe(@PathVariable Integer id) {
        superheroeService.deleteSuperheroe(id);
        return ResponseEntity.ok().build();
    }
}
