package org.example.repository;

import org.example.model.Superheroe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISuperheroeRepository extends JpaRepository<Superheroe, Integer> {
}
