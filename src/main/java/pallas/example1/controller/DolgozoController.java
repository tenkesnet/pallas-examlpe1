package pallas.example1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/primszam")
public class DolgozoController {

    @GetMapping("/{prime}")
    public String index(@PathVariable(name = "prime") long prime){
        String result = "primszám";
        if(prime == 0 || prime==1) result="nem prímszám!";
        for(int i=2 ; i<= Math.sqrt(prime) ; i++){
            if(prime % i == 0 ) {
                result="nem prímszám!";
                break;
            }
        }

        return result;
    }

    public class szam {
        public int szam;

        public szam(int i){
            this.szam=i;
        }
    }
}
