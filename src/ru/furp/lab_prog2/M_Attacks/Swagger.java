package ru.furp.lab_prog2.M_Attacks;

import ru.ifmo.se.pokemon.*;

import java.util.Random;

public class Swagger extends StatusMove {

    public Swagger(){
        super(Type.NORMAL,0,85);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Random rn = new Random();
        int trn = rn.nextInt(4)+1;
        pokemon.addEffect(new Effect().turns(trn).stat(Stat.ATTACK,2));
        Effect.confuse(pokemon);
    }

    @Override
    protected String describe() {
        return "свэгает";
    }
}
