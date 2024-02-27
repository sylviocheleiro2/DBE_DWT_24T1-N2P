package org.example.models3;

public class Produto3
{
    private String nome;
    private int codigo;
    private String marca;
    public Produto3(String nome, int codigo, String marca ) {
        this.nome = nome;
        this.codigo = codigo;
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
