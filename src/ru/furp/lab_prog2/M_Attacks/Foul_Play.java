package ru.furp.lab_prog2.M_Attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Foul_Play extends PhysicalMove {

    public Foul_Play(){
        super(Type.DARK,95,100);

    }

    @Override
    protected double calcBaseDamage(Pokemon pokemon, Pokemon pokemon1) {
        return super.calcBaseDamage(pokemon1, pokemon);
    }

    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1) {
        return super.calcCriticalHit(pokemon1, pokemon);
    }

    @Override
    protected String describe() {
        return "грязно бьёт!";
    }
}
