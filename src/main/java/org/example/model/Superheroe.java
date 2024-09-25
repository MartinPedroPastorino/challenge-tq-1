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
    @Column(name="CUSTOMERID",updatable = false)
    private Integer id;

    @Column(name="CUSTOMERID", nullable = false)
    private String nombre;
}
