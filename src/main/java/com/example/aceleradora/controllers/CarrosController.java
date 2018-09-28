package com.example.aceleradora.controllers;

import com.example.aceleradora.models.Carro;
import com.example.aceleradora.services.CarrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping(path = "/carros")
public class CarrosController {

    @Autowired
    private CarrosService carrosService;

    @GetMapping
    public String carros(Model model) {
//        ArrayList<Carro> carros = new ArrayList<>();
//        model.addAttribute("carros", carros);

        model.addAttribute("carros", carrosService.pegaTodosCarros());

        return "carros";
    }
}
