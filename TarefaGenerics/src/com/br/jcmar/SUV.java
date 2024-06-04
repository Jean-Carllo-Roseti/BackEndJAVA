package com.br.jcmar;

public class SUV extends Carro {
    public SUV(String modelo, String marca) {
        super(modelo, marca);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("SUV [Modelo: " + getModelo() + ", Marca: " + getMarca() + "]");
    }
}
