package com.br.jcmar;

import java.util.ArrayList;
import java.util.List;

public class Garagem<T extends Carro> {
    private List<T> carros;

    public Garagem() {
        carros = new ArrayList<>();
    }

    public void adicionarCarro(T carro) {
        carros.add(carro);
    }

    public void mostrarTodosCarros() {
        for (T carro : carros) {
            carro.mostrarDetalhes();
        }
    }

    public static void main(String[] args) {
        Garagem<Carro> garagem = new Garagem<>();

        Carro sedan = new Sedan("Civic", "Honda");
        Carro suv = new SUV("Compass", "Jeep");

        garagem.adicionarCarro(sedan);
        garagem.adicionarCarro(suv);

        garagem.mostrarTodosCarros();
    }
}

