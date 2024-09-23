package org.example.service;

import org.example.model.Superheroe;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperheroeService implements ISuperheroeService{
    @Override
    public List<Superheroe> getAllSuperHeroes() {
        return null;
    }

    @Override
    public List<Superheroe> getAllSuperHeroesContains(String target) {
        return null;
    }

    @Override
    public Superheroe getSuperHeroe(Integer id) {
        return null;
    }

    @Override
    public Superheroe CreateSuperHeroe(String nombre) {
        return null;
    }

    @Override
    public Superheroe ModifySuperheroe(Integer id, String nombre) {
        return null;
    }

    @Override
    public void DeleteSuperheroe(Integer id, String nombre) {

    }
}
