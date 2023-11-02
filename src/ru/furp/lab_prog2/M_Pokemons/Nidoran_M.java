package ru.furp.lab_prog2.M_Pokemons;

import ru.furp.lab_prog2.M_Attacks.Confide;
import ru.furp.lab_prog2.M_Attacks.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Nidoran_M extends Pokemon {

    public Nidoran_M(String name, int lvl){
        super(name,lvl);
        this.setType(Type.POISON);
        this.setStats(46,57,40,40,40,50);
        this.setMove(new Confide(),new Thunderbolt());
    }
}
