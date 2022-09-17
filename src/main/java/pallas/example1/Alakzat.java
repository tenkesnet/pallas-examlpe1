package pallas.example1;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class Alakzat extends Forma {

    public double terulet;
    public ArrayList<Kocka> kockak = new ArrayList<Kocka>();

    public Alakzat(){
        Kocka kocka = new Kocka(25,"piros");
        kockak.add(kocka);
        kocka = new Kocka(50,"kék");
        kockak.add(kocka);
        this.szogszam=6;
        this.terulet=50;
    }

}
