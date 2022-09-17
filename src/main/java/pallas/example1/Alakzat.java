package pallas.example1;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.*;

@Getter
@Setter
public class Alakzat {
    public ArrayList<Kocka> kockak = new ArrayList<Kocka>();

    public Alakzat(){
        Kocka kocka = new Kocka(25,"piros");
        kockak.add(kocka);
        kocka = new Kocka(50,"kék");
        kockak.add(kocka);
    }

}
