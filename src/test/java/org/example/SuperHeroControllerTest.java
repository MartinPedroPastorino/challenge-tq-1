package org.example.controller;

import org.example.model.Superheroe;
import org.example.service.SuperheroeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class SuperheroeControllerTest {

    @InjectMocks
    private SuperheroeController superheroeController;

    @Mock
    private SuperheroeService superheroeService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getAllSuperheroes() {
        Superheroe hero1 = new Superheroe("Hero One");
        Superheroe hero2 = new Superheroe("Hero Two");
        List<Superheroe> superheroes = Arrays.asList(hero1, hero2);

        when(superheroeService.getAllSuperHeroes()).thenReturn(superheroes);

        List<Superheroe> result = superheroeController.getAllSuperheroes();

        assertEquals(2, result.size());
        verify(superheroeService).getAllSuperHeroes();
    }

    @Test
    void getSuperheroeById_Found() {
        Superheroe hero = new Superheroe("Hero One");
        when(superheroeService.getSuperHeroeById(1)).thenReturn(Optional.of(hero));

        ResponseEntity<Superheroe> response = superheroeController.getSuperheroeById(1);

        assertEquals(200, response.getStatusCodeValue());
        assertEquals(hero, response.getBody());
    }

    @Test
    void getSuperheroeById_NotFound() {
        when(superheroeService.getSuperHeroeById(1)).thenReturn(Optional.empty());

        ResponseEntity<Superheroe> response = superheroeController.getSuperheroeById(1);

        assertEquals(404, response.getStatusCodeValue());
    }

    @Test
    void createSuperheroe() {
        Superheroe hero = new Superheroe( "Hero One");
        when(superheroeService.saveSuperheroe(any(Superheroe.class))).thenReturn(hero);

        Superheroe createdHero = superheroeController.createSuperheroe(hero);

        assertEquals("Hero One", createdHero.getNombre());
    }

    @Test
    void updateSuperheroe_Exists() {
        Superheroe updatedHero = new Superheroe("Updated Hero");
        when(superheroeService.updateSuperheroe(1, updatedHero)).thenReturn(updatedHero);

        ResponseEntity<Superheroe> response = superheroeController.updateSuperheroe(1, updatedHero);

        assertEquals(200, response.getStatusCodeValue());
        assertEquals(updatedHero, response.getBody());
    }

    @Test
    void updateSuperheroe_NotFound() {
        Superheroe updatedHero = new Superheroe("Updated Hero");
        when(superheroeService.updateSuperheroe(1, updatedHero)).thenThrow(new IllegalArgumentException());

        ResponseEntity<Superheroe> response = superheroeController.updateSuperheroe(1, updatedHero);

        assertEquals(404, response.getStatusCodeValue());
    }

    @Test
    void deleteSuperheroe() {
        doNothing().when(superheroeService).deleteSuperheroe(1);

        ResponseEntity<Void> response = superheroeController.deleteSuperheroe(1);

        assertEquals(200, response.getStatusCodeValue());
        verify(superheroeService).deleteSuperheroe(1);
    }
}
