package org.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name="SUPERHEROES")
@Data
@NoArgsConstructor
public class Superheroe {

    @Id
    @GeneratedValue
    @Column(name="id",updatable = false)
    private Integer id;

    @Column(name="nombre", nullable = false)
    private String nombre;

    public Superheroe(String nombre) {

        this.nombre = nombre;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
