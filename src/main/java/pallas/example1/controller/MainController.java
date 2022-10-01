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
    public String iroda(Model model){

        return "Dev";
    }
}
