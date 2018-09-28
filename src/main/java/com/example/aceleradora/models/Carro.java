package com.example.aceleradora.models;

public class Carro {
    public String modelo;
    public String marca;
    public int ano;
    public int numeroPortas;
    public boolean temAr;
    public String placa;

    public Carro(String modelo, String marca, int ano, int numeroPortas, boolean temAr, String placa) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.numeroPortas = numeroPortas;
        this.temAr = temAr;
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public boolean isTemAr() {
        return temAr;
    }

    public void setTemAr(boolean temAr) {
        this.temAr = temAr;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", numeroPortas=" + numeroPortas +
                ", temAr=" + temAr +
                ", placa='" + placa + '\'' +
                '}';
    }
}
