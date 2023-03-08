package com.example.repository;


import com.example.entity.Salas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalasRepository extends CrudRepository<Salas, Long>{
    
}
