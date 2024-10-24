package org.example;

import org.example.repository.SuperheroeRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TestSuperHeroeRepository {
    @Autowired
    private SuperheroeRepository repository;

    @Test
    public void contextLoads() throws Exception {
        assertThat(repository).isNotNull();
    }

    @Test
    public void getAll(){

    }
}
