package org.example.service;

import org.example.model.Superheroe;

import java.util.List;

public interface ISuperheroeService {
    public List<Superheroe> getAllSuperHeroes();
    public List<Superheroe> getAllSuperHeroesContains(String target);
    public Superheroe getSuperHeroe(Integer id);

    public Superheroe CreateSuperHeroe(String nombre);

    public Superheroe ModifySuperheroe(Integer id,String nombre);

    public void DeleteSuperheroe(Integer id,String nombre);
}
