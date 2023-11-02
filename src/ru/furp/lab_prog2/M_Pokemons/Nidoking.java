package ru.furp.lab_prog2.M_Pokemons;

import ru.furp.lab_prog2.M_Attacks.Confide;
import ru.furp.lab_prog2.M_Attacks.Fury_Attack;
import ru.furp.lab_prog2.M_Attacks.Thunderbolt;
import ru.furp.lab_prog2.M_Attacks.Poison_Sting;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Nidoking extends Pokemon {

    public Nidoking(String name, int lvl){
        super(name,lvl);
        this.setType(Type.POISON,Type.GROUND);
        this.setStats(81,102,77,85,75,85);
        this.setMove(new Confide(),new Thunderbolt(),new Fury_Attack(),new Poison_Sting());
    }
}
