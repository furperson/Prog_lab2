package ru.furp.lab_prog2.M_Attacks;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {

    public Confide(){
        super(Type.NORMAL,0,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().stat(Stat.SPECIAL_ATTACK,-1).turns(-1));
    }

    @Override
    protected String describe() {
        return "доверяет??????";
    }
}
