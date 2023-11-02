package ru.furp.lab_prog2.M_Pokemons;

import ru.furp.lab_prog2.M_Attacks.Aqua_Ring;
import ru.furp.lab_prog2.M_Attacks.Aurora_Beam;
import ru.furp.lab_prog2.M_Attacks.Take_Down;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Seel extends Pokemon {

    public Seel(String name, int lvl){
        super(name,lvl);
        this.setType(Type.WATER);
        this.setStats(65,45,55,45,70,45);
        this.setMove(new Take_Down(),new Aurora_Beam(),new Aqua_Ring(),new Aqua_Ring());

    }
}
