package com.example.controller;

import com.example.entity.Peliculas;
import com.example.entity.Salas;
import com.example.service.IPeliculasService;
import com.example.service.ISalasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PeliculasController {

    @Autowired
    private IPeliculasService peliculasService;
    @Autowired
    private ISalasService salasService;
    
    @GetMapping("/peliculas")
    public String index(Model model){
        List<Peliculas> listaPelicula = peliculasService.getAllPeliculas();
        model.addAttribute("titulo","Tabla Peliculas");
        model.addAttribute("peliculas",listaPelicula);
        return "peliculas";
    }
    
    @GetMapping("/peliculaN")
    public String crearPelicula(Model model){
        List<Salas> listaSalas = salasService.listarSalas();
        model.addAttribute("peliculas",new Peliculas());//"persona"-> como lo leemos en el html //envia el objeto al html
        model.addAttribute("salas",listaSalas);
        return "crear";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarPelicula(@PathVariable("id") Long idPelicula){
        peliculasService.delete(idPelicula);
        return "redirect:/peliculas";
    }
    
    @PostMapping("/save")
    public String guardarPelicula(@ModelAttribute Peliculas peliculas){
        peliculasService.savePelicula(peliculas);
        return "redirect:/peliculas";
    }
    
    @GetMapping("/editPelicula/{id}")
    public String editarPelicula(@PathVariable("id") Long idPelicula, Model model){
        Peliculas peliculas = peliculasService.getPeliculaById(idPelicula);
        List<Salas> listaSalas = salasService.listarSalas();
        model.addAttribute("peliculas",peliculas);
        model.addAttribute("salas",listaSalas);
        return "crear";
    }
}
