package org.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
}
