package com.example.entity;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "peliculas")
public class Peliculas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String nombre;
    private int costo_entrada;
    private Date fecha;
    
    @ManyToOne //foreign key
    @JoinColumn(name = "sala_id") 
    private Salas salas;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto_entrada() {
        return costo_entrada;
    }

    public void setCosto_entrada(int costo_entrada) {
        this.costo_entrada = costo_entrada;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Salas getSalas() {
        return salas;
    }

    public void setSalas(Salas salas) {
        this.salas = salas;
    }
    
    
}
