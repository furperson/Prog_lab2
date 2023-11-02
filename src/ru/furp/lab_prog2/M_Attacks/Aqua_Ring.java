package ru.furp.lab_prog2.M_Attacks;

import ru.ifmo.se.pokemon.*;

public class Aqua_Ring extends StatusMove {

    public Aqua_Ring(){
        super(Type.WATER,0,100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.HP,-(int)(pokemon.getStat(Stat.HP)*(1/16)));
    }



    @Override
    protected String describe() {
        return "окружает себя водянной завесой";
    }
}
