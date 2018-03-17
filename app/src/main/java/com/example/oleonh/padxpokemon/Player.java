package com.example.oleonh.padxpokemon;

/**
 * Created by kamehameya on 3/17/18.
 */

import java.util.ArrayList;

public class Player {
    String name;
    ArrayList<Pokemon> pokemen = new ArrayList<Pokemon>();
    ArrayList<Pokemon> inventory = new ArrayList<>();

    //boolean reveals if the pokemon can be added
    void addPokemon(Pokemon p) {
        if (pokemen.size() > 6) {
            inventory.add(p);
            System.out.println("to inventory");
        }
        pokemen.add(p);
        System.out.println("done");
    }


    //i is index of pokemon from inventory
    //j is index of pokemon from bag
    void swapFromInventorytoHand(int i, int j){
        Pokemon p = pokemen.get(i);
        pokemen.set(i, inventory.set(j, p));
        System.out.println("done");
    }
}
