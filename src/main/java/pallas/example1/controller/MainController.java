package pallas.example1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pallas.example1.*;
import pallas.example1.model.Cikk;
import pallas.example1.model.Mufaj;
import pallas.example1.model.Szerzo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

    @GetMapping(value = "/")
    public Szerzo iroda(Model model){
        Szerzo sz1 = new Szerzo("Balázs", 32, "Budapest", new ArrayList<Cikk>());
        ArrayList<Mufaj> drama_thiller = new ArrayList<Mufaj>();
        drama_thiller.add(new Mufaj("drama"));
        drama_thiller.add(new Mufaj("thiller"));
        sz1.getCikkek().add(
                new Cikk(
                        "Budapest látképe",
                        " jkhkhklh khkh klhlkh kjh kh lk",
                        Date.valueOf("2020-04-01"),
                        drama_thiller
                )
        );
        sz1.getCikkek().add(new Cikk("Pécs látképe"," 111111 khkh klhlkh kjh kh lk",Date.valueOf("2021-08-01")));
        return sz1;
    }
}
