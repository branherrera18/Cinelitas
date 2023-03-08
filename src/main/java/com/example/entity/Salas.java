package com.example.entity;

import jakarta.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "salas")
public class Salas implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private long id;
    
    private int capacidad_maxima;
    private int numero_sala;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCapacidad_maxima() {
        return capacidad_maxima;
    }

    public void setCapacidad_maxima(int capacidad_maxima) {
        this.capacidad_maxima = capacidad_maxima;
    }

    public int getNumero_sala() {
        return numero_sala;
    }

    public void setNumero_sala(int numero_sala) {
        this.numero_sala = numero_sala;
    }
    
    
}
