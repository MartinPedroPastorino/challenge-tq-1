package org.example.service;

import org.example.model.Superheroe;
import org.example.repository.ISuperheroeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SuperheroeService implements ISuperheroeService{

    @Autowired
    private ISuperheroeRepository iSuperheroeRepository;
    @Override
    public List<Superheroe> getAllSuperHeroes() {
        return iSuperheroeRepository.findAll();
    }

    @Override
    public List<Superheroe> getAllSuperHeroesContains(String target) {
        return null;
    }

    @Override
    public Optional<Superheroe> getSuperHeroeById(Integer id) {
        return iSuperheroeRepository.findById(id);
    }

    @Override
    public Superheroe saveSuperheroe(Superheroe superheroe) {
      return  iSuperheroeRepository.save(superheroe);
    }

    @Override
    public Superheroe updateSuperheroe(Integer id,  Superheroe updatedSuperheroe) {
        return iSuperheroeRepository.findById(id).map(existingSuperheroe -> {
            // Actualizar solo los campos que necesitas
            existingSuperheroe.setNombre(updatedSuperheroe.getNombre());
            // Aquí puedes agregar más campos si tu modelo tiene más atributos

            // Guardar el superhéroe actualizado
            return iSuperheroeRepository.save(existingSuperheroe);
        }).orElseThrow(() -> new IllegalArgumentException("El superhéroe no existe"));
    }

    @Override
    public void deleteSuperheroe(Integer id) {
        iSuperheroeRepository.deleteById(id);
    }
}
