package ru.furp.lab_prog2.M_Pokemons;

import ru.furp.lab_prog2.M_Attacks.Draining_Kiss;
import ru.furp.lab_prog2.M_Attacks.Foul_Play;
import ru.furp.lab_prog2.M_Attacks.Mirror_Shot;
import ru.furp.lab_prog2.M_Attacks.Swagger;
import ru.ifmo.se.pokemon.*;
public class Klefki extends Pokemon {
    public Klefki (String name,int lvl){
        super(name,1);
        this.setStats(57,80,91,80,87,75);
        this.setType(Type.STEEL,Type.FAIRY);
        this.setMove(new Mirror_Shot(),new Draining_Kiss(),new Foul_Play(),new Swagger());


    }

}
