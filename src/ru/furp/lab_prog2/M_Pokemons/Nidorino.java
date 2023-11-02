package ru.furp.lab_prog2.M_Pokemons;

import ru.furp.lab_prog2.M_Attacks.Confide;
import ru.furp.lab_prog2.M_Attacks.Fury_Attack;
import ru.furp.lab_prog2.M_Attacks.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Nidorino extends Pokemon {

    public Nidorino(String name, int lvl){
        super(name,lvl);
        this.setType(Type.POISON);
        this.setStats(61,72,57,55,55,65);
        this.setMove(new Confide(),new Thunderbolt(),new Fury_Attack());
    }
}
