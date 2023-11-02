package ru.furp.lab_prog2.M_Attacks;

import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt(){
        super(Type.ELECTRIC,90,100);
    }

    @Override
    protected String describe() {
        return "пускает молнию";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().condition(Status.PARALYZE).turns(0).chance(0.1));
    }
}
