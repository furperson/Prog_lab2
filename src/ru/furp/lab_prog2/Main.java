package ru.furp.lab_prog2;

import ru.furp.lab_prog2.M_Pokemons.*;
import ru.ifmo.se.pokemon.*;


public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Dewgong dewg = new Dewgong("dewq",1);
        Klefki klef = new Klefki("klef",1);
        Nidoking nido = new Nidoking("nido",1);
        Nidoran_M nim = new Nidoran_M("nim",1);
        Nidorino nidr = new Nidorino("nidr",1);
        Seel selika = new Seel("selika",1);
        b.addAlly(dewg); b.addAlly(klef); b.addAlly(nido);
        b.addFoe(nim); b.addFoe(nidr); b.addFoe(selika);
        b.go();
    }
}