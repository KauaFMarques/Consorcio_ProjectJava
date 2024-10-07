package org.example.model;

public class Cliente {

    private String nome;
    private int idade;
    private double rendaMensal;
    private double compromissosFinanceiros;
    private double valorCarro;
    private int prazo;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public double getCompromissosFinanceiros() {
        return compromissosFinanceiros;
    }

    public void setCompromissosFinanceiros(double compromissosFinanceiros) {
        this.compromissosFinanceiros = compromissosFinanceiros;
    }

    public double getValorCarro() {
        return valorCarro;
    }

    public void setValorCarro(double valorCarro) {
        this.valorCarro = valorCarro;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }
}
