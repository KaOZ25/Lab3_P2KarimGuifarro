/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_p2karimguifarro;

import java.util.ArrayList;

public class Coordinador extends Entrenadores {
    ArrayList <pkmn> pokemon= new ArrayList();

    public Coordinador(String nombre, String sexo, int edad) {
        super(nombre, sexo, edad);
    }

    public ArrayList<pkmn> getPokemon() {
        return pokemon;
    }

    public void setPokemon(ArrayList<pkmn> pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public String toString() {
        return "pokemon=" + pokemon ;
    }
    
}
