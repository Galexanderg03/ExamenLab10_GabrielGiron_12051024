/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab10p2_gabrielgiron_12051024;

import java.io.Serializable;

/**
 *
 * @author Galex
 */
public class Carros implements Serializable{
    private String Nombre;
    private String Tipo;
    private int Velocidad;
    private int Derrape;
    private double Ataque;
    private double Vida;

    public Carros(String Nombre, int Velocidad, int Derrape, double Ataque, double Vida) {
        this.Nombre = Nombre;
        this.Velocidad = Velocidad;
        this.Derrape = Derrape;
        this.Ataque = Ataque;
        this.Vida = Vida;
        this.Tipo = Tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    public int getDerrape() {
        return Derrape;
    }

    public void setDerrape(int Derrape) {
        this.Derrape = Derrape;
    }

    public double getAtaque() {
        return Ataque;
    }

    public void setAtaque(int Ataque) {
        this.Ataque = Ataque;
    }

    public double getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }
    
    @Override
    public String toString() {
        return Nombre;
    }
    
}
