/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_p2karimguifarro;

import java.util.ArrayList;

/**
 *
 * @author karim
 */
public class Gimnasios {
    private String nombre,ciudad;
    private int victorias,derrotas,dinero;
    Maestro lider;
    private ArrayList <Entrenadores> entre=new ArrayList();
    public Gimnasios() {
    }

    public Gimnasios(String nombre, String ciudad, int victorias, int derrotas, int dinero, Maestro lider) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.victorias = victorias;
        this.derrotas = derrotas;
        this.dinero = dinero;
        this.lider = lider;
    }

    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Maestro getLider() {
        return lider;
    }

    public void setLider(Maestro lider) {
        this.lider = lider;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero*10000;
    }

    public ArrayList<Entrenadores> getEntre() {
        return entre;
    }

    public void setEntre(ArrayList<Entrenadores> entre) {
        this.entre = entre;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", ciudad=" + ciudad + ", victorias=" + victorias + ", derrotas=" + derrotas + ", dinero=" + dinero + ", lider=" + lider + ", entre=" + entre ;
    }
    

    
    
}
