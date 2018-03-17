package com.example.oleonh.padxpokemon;

/**
 * Created by oleonh on 3/17/18.
 */

public class Pokemon {
    int attack;
    int defense;
    int agility;
    String type;

    public Pokemon(){

    }

    public Pokemon(int att, int def, int agi, String name){
        attack = att;
        defense = def;
        agility = agi;
        type = name; 
    }
}
