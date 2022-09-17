package pallas.example1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/dolgozo")
public class DolgozoController {

    @GetMapping("/{counter}")
    public List<szam> index(@PathVariable(name = "counter") int counter){
        List<szam> szamok = new ArrayList<szam>();
        for(int i=1 ; i<= counter ; i++){
            szamok.add(new szam(i));
        }

        return szamok;
    }

    public class szam {
        public int szam;

        public szam(int i){
            this.szam=i;
        }
    }
}
