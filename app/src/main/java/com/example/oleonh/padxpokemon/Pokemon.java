package com.example.oleonh.padxpokemon;

import java.lang.Math;
/**
 * Created by oleonh on 3/17/18.
 */

public class Pokemon {
    int attack;
    int defense;
    int agility;
    String type;
    String name;
    int health;

    public Pokemon (int att, int def, int agil, String type, String n){
        attack = att; defense = def; agility = agil; type = this.type;
        name = n; health = 100;
    }

    void damage(int amount){
        health = health - amount;
    }

    boolean capture(){
        int x = (int)(Math.random() * health/10);
        if (x == 1 || x == 2){
            return true;
        }
        return false;
    }

    // returns 1 if superior, 0 if equal and -1 if weaker
    // @param type of the other pokemon
    int typeIsSuperior(String t){
        if(type.equals("grass") || type.equals("flying")){
            if (t.equals("fire")){
                return -1;
            } else if (type.equals("water")){
                return 1;
            }
            return 0;
        } else if (type.equals("fire")) {
            if (t.equals("fire")){
                return -1;
            } else if (type.equals("water")){
                return 1;
            }
            return 0;
        } else if (type.equals("water")) {
            if (t.equals("fire")){
                return 1;
            } else if (type.equals("grass")){
                return -1;
            }
            return 0;
        } else if (type.equals("dark")) {
            return 0;
        } else if (type.equals("flying")) {
            if (t.equals("grass")){
                return 1;
            }
            return 0;
        }
        return 0;
    }

}
