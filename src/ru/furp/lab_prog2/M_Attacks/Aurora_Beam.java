package ru.furp.lab_prog2.M_Attacks;

import ru.ifmo.se.pokemon.*;

public class Aurora_Beam extends SpecialMove {

    public Aurora_Beam (){
        super(Type.ICE,65,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().stat(Stat.ATTACK,-1).chance(0.1).turns(-1));
    }

    @Override
    protected String describe() {
        return "делает холодное пьяяяя!" ;
    }
}
