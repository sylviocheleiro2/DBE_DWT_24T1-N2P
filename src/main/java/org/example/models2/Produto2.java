package org.example.models2;

public class Produto2
{
    private String nome;
    private String cpf;
    private String endereco;
    private double renda;

    public Produto2(String nome, String cpf, String endereco, double renda) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.renda = renda;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getRenda() {
        return this.renda;

    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
}

