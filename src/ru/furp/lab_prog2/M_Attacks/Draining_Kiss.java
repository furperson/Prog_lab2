package ru.furp.lab_prog2.M_Attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Draining_Kiss extends SpecialMove {


    public Draining_Kiss (){
        super(Type.FAIRY,50,100);
    }

    @Override
    protected void applySelfDamage(Pokemon p, double v) {
        p.setMod(Stat.HP,-(int)(v*0.75) );
    }

    @Override
    protected String describe() {
        return "жёстко целует";
    }
}
