package ru.furp.lab_prog2.M_Attacks;
import ru.ifmo.se.pokemon.*;

import java.util.Random;

public class Mirror_Shot extends SpecialMove {

    public Mirror_Shot(){
        super(Type.STEEL,65,85);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        final Random rn = new Random();
        if(rn.nextInt(10)>3){
            p.setCondition(new Effect().stat(Stat.ACCURACY,-1).turns(-1));
        }
    }

    @Override
    protected String describe() {
        return "использует зеркальный выстрел";
    }
}
