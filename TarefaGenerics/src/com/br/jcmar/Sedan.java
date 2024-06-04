package com.br.jcmar;

public class Sedan extends Carro {
    public Sedan(String modelo, String marca) {
        super(modelo, marca);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Sedan [Modelo: " + getModelo() + ", Marca: " + getMarca() + "]");
    }
}
