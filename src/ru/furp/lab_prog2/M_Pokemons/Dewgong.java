package ru.furp.lab_prog2.M_Pokemons;

import ru.furp.lab_prog2.M_Attacks.Aqua_Ring;
import ru.furp.lab_prog2.M_Attacks.Aurora_Beam;
import ru.furp.lab_prog2.M_Attacks.Frost_Breath;
import ru.furp.lab_prog2.M_Attacks.Take_Down;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Dewgong extends Pokemon {

    public Dewgong (String name, int lvl){
        super(name,  lvl);
        this.setType(Type.WATER,Type.ICE);
        this.setStats(90,70,80,70,95,70);
        this.setMove(new Take_Down(),new Aurora_Beam(),new Aqua_Ring(),new Aqua_Ring(), new Frost_Breath());

    }
}
