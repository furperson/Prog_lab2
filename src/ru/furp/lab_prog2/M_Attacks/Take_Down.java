package ru.furp.lab_prog2.M_Attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Take_Down extends PhysicalMove {
    public Take_Down(){
        super(Type.NORMAL,90,85);
    }

    @Override
    protected void applySelfDamage(Pokemon pokemon, double v) {
        super.applySelfDamage(pokemon, (int)(v/4));
    }

    @Override
    protected String describe() {
        return "Тейкает даунит";
    }
}
