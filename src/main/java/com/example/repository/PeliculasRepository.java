package com.example.repository;

import com.example.entity.Peliculas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculasRepository extends CrudRepository<Peliculas, Long> {
    
}
