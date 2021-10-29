/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_p2karimguifarro;

/**
 *
 * @author karim
 */
public class Gimnasios {
    private String nombre,ciudad,lider;
    private int victorias,derrotas;
    private long dinero;

    public Gimnasios() {
    }

    
    public Gimnasios(String nombre, String ciudad, String lider, int victorias, int derrotas, long dinero) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.lider = lider;
        this.victorias = victorias;
        this.derrotas = derrotas;
        this.dinero = dinero;
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

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
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

    public long getDinero() {
        return dinero;
    }

    public void setDinero(long dinero) {
        this.dinero = dinero*10000;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", ciudad=" + ciudad + ", lider=" + lider + ", victorias=" + victorias + ", derrotas=" + derrotas + ", dinero=" + dinero;
    }
    
}
