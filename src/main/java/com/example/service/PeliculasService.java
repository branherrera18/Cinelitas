package com.example.service;

import com.example.entity.Peliculas;
import com.example.repository.PeliculasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculasService implements IPeliculasService {

    @Autowired
    private PeliculasRepository peliculasRepository;

    @Override
    public List<Peliculas> getAllPeliculas() {
        return (List<Peliculas>) peliculasRepository.findAll();
    }

    @Override
    public Peliculas getPeliculaById(long id) {
        return peliculasRepository.findById(id).orElse(null);

    }

    @Override
    public void savePelicula(Peliculas peliculas) {
        peliculasRepository.save(peliculas);

    }

    @Override
    public void delete(long id) {
        peliculasRepository.deleteById(id);
    }

}
