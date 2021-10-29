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
public class Maestro extends Entrenadores{
    int victorias;
    pkmn Pokemon;

    public Maestro(int victorias, pkmn Pokemon, String nombre, String sexo, int edad) {
        super(nombre, sexo, edad);
        this.victorias = victorias;
        this.Pokemon = Pokemon;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public pkmn getPokemon() {
        return Pokemon;
    }

    public void setPokemon(pkmn Pokemon) {
        this.Pokemon = Pokemon;
    }

    @Override
    public String toString() {
        return "victorias=" + victorias + ", Pokemon=" + Pokemon;
    }
    
}
