package pallas.example1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pallas.example1.Alakzat;
import pallas.example1.Kocka;

@RestController
@RequestMapping("/dolgozo")
public class DolgozoController {

    @GetMapping("")
    public Alakzat index(){

/*
        Kocka kocka = new Kocka();
        kocka.setMeret(25);
        kocka.setSzin("piros");
*/
        Alakzat a = new Alakzat();
        return a;
    }
}
