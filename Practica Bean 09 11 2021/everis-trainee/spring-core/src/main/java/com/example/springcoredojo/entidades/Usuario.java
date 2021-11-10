package com.example.springcoredojo.entidades;


import org.springframework.stereotype.Component;

@Component

public class Usuario {
    private Alumno alum;

    public Usuario(Alumno alum) {
        this.alum = alum;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "alum=" + alum +
                '}';
    }

    public Alumno getAlum() {
        return alum;
    }

    public void setAlum(Alumno alum) {
        this.alum = alum;
    }
}
