package com.example.service;

import com.example.entity.Salas;
import com.example.repository.SalasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalasService implements ISalasService {

    @Autowired
    private SalasRepository salasRepository;
    
    @Override
    public List<Salas> listarSalas() {
        return (List<Salas>)salasRepository.findAll();
    }
    
}
