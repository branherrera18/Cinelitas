package com.example.service;

import com.example.entity.Peliculas;
import java.util.List;

public interface IPeliculasService {
    public List<Peliculas> getAllPeliculas();
    public Peliculas getPeliculaById(long id);
    public void savePelicula(Peliculas peliculas);
    public void delete(long id);
}
