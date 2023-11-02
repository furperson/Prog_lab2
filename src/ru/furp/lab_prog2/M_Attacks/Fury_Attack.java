package ru.furp.lab_prog2.M_Attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import java.util.Random;

public class Fury_Attack extends PhysicalMove {


    protected void set_power(int pwer){
        this.power = pwer;

    }
    public Fury_Attack(){
        super(Type.NORMAL,15,85);


    }

    @Override
    protected double calcBaseDamage(Pokemon pokemon, Pokemon pokemon1) {
        Random rn = new Random();
        int pw = 15;
        if(rn.nextDouble()>(3/8)) pw = pw+15;
        if(rn.nextDouble()>(3/8)) pw = pw+15;
        if(rn.nextDouble()>(1/8)) pw = pw+15;
        if(rn.nextDouble()>(1/8)) pw = pw+15;
        set_power(pw);
        return super.calcBaseDamage(pokemon, pokemon1);
    }

    @Override
    protected String describe() {
        return "ЯРОСТНО БЬЁТ";
    }
}
