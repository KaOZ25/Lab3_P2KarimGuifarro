/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_p2karimguifarro;

public class Legendario extends Entrenadores {
    pkmn pokemon;

    public Legendario(String nombre, String sexo, int edad,pkmn pokemon) {
        super(nombre, sexo, edad);
        this.pokemon = pokemon;
    }

    public pkmn getPokemon() {
        return pokemon;
    }

    public void setPokemon(pkmn pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public String toString() {
        return super.toString() + "pokemon=" + pokemon + '}';
    }
    
}
