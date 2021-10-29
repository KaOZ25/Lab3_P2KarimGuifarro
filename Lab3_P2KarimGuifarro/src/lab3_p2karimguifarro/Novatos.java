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
public class Novatos extends Entrenadores{
    private String pkmn_decubiertos;
    private pkmn pokemon;

    public Novatos(String nombre, String sexo, int edad) {
        super(nombre, sexo, edad);
    }

    public Novatos(String pkmn_decubiertos, pkmn pokemon, String nombre, String sexo, int edad) {
        super(nombre, sexo, edad);
        this.pkmn_decubiertos = pkmn_decubiertos;
        this.pokemon = pokemon;
    }

    public String getPkmn_decubiertos() {
        return pkmn_decubiertos;
    }

    public void setPkmn_decubiertos(String pkmn_decubiertos) {
        this.pkmn_decubiertos = pkmn_decubiertos;
    }

    public pkmn getPokemon() {
        return pokemon;
    }

    public void setPokemon(pkmn pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public String toString() {
        return "Pokemon descubiertos=" + pkmn_decubiertos + ", pokemon=" + pokemon;
    }
    
}
