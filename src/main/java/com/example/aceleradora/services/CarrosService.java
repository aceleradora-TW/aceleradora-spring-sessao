package com.example.aceleradora.services;

import com.example.aceleradora.models.Carro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class CarrosService {

    public ArrayList<Carro> pegaTodosCarros() {
        return geraCarros();
    }

    // Nao mexer (simula BD)
    private ArrayList<Carro> geraCarros() {

        Carro carro = new Carro("UP", "VW", 2017, 4, true, "IXD-4653");
        Carro carro2 = new Carro("FOX", "VW", 2017, 3, false, "IDO-3212");

        ArrayList<Carro> carros = new ArrayList<>(Arrays.asList(carro, carro2));

        return carros;
    }
}
