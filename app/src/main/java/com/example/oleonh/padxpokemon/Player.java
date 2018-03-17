package com.example.oleonh.padxpokemon;

/**
 * Created by kamehameya on 3/17/18.
 */

import java.util.ArrayList;

public class Player {
    String name;
    ArrayList<Pokemon> pokemen = new ArrayList<Pokemon>();


    //boolean reveals if the pokemon can be added
    boolean addPokemon(Pokemon p) {
        if (pokemen.size() >= 5) {
            return false;
        }
        pokemen.add(p);
        return true;
    }
}
