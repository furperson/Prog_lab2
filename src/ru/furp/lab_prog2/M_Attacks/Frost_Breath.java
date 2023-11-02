package ru.furp.lab_prog2.M_Attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Frost_Breath extends SpecialMove {

    public Frost_Breath (){
        super(Type.ICE,60,90);
    }

    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1) {
        return 2;
    }

    @Override
    protected String describe() {
        return "использует морозное дыхание";
    }
}
