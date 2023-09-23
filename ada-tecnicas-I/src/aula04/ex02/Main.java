package aula04.ex02;

import java.util.List;

public class Main {

    /*
    Exercício 2: Encontrando o Produto Mais Caro
    Dada uma Lista de produtos, encontre o produto mais caro.
    Crie uma classe Produto com os atributos nome(String) e preço(Double)
    Crie um programa para ler uma lista e achar o produto mais caro.
    List<Produto> produtos = List.of(
        new Produto("Notebook", 2500.0),
        new Produto("Camisa", 50.0),
        new Produto("Smartphone", 1200.0),
        new Produto("Tênis", 150.0));
    */

    public static void main(String[] args) {
        List<Produto> produtos = List.of(
            new Produto("Notebook", 2500.0),
            new Produto("Camisa", 50.0),
            new Produto("Smartphone", 1200.0),
            new Produto("Tênis", 150.0));

        System.out.println(
                produtos.stream()
                        .max((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()))
        );

    }
}
