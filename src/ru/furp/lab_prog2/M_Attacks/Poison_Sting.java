package ru.furp.lab_prog2.M_Attacks;

import ru.ifmo.se.pokemon.*;

public class Poison_Sting extends PhysicalMove {

    public Poison_Sting(){
        super(Type.POISON,15,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.3).condition(Status.POISON).turns(0));
    }

    @Override
    protected String describe() {
        return "Жалит!";
    }
}
