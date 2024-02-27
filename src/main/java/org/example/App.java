package org.example;

import org.example.models.Produto;
import org.example.models2.Produto2;
import org.example.models3.Produto3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Produto p1 = new Produto("Caderno");
        Produto2 cliente = new Produto2("Sylvio", "123", "av brasil", 1000);
        Produto3 marca = new Produto3("Celta", 23, "Chevrolet");

        System.out.println(p1.getNome());

        System.out.println(cliente.getNome());
        System.out.println(cliente.getCpf());
        System.out.println(cliente.getEndereco());

        System.out.println(marca.getNome() + " " +  marca.getMarca() + " " + marca.getCodigo());

    }
}
