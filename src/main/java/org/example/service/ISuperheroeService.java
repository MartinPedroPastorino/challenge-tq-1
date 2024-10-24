package org.example.service;

import org.example.model.Superheroe;

import java.util.List;
import java.util.Optional;

public interface ISuperheroeService {
    public List<Superheroe> getAllSuperHeroes();
    public List<Superheroe> getAllSuperHeroesContains(String target);
    public Optional<Superheroe> getSuperHeroeById(Integer id);

    public Superheroe saveSuperheroe(Superheroe superheroe);

    public Superheroe updateSuperheroe(Integer id,  Superheroe updatedSuperheroe);

    public void deleteSuperheroe(Integer id);
}
