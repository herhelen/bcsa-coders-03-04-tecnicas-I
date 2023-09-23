package aula04.ex01;

import java.util.List;

public class Main {

    /*
    Exercício 1: Filtrando Produtos por Categoria
    Suponha que você tenha uma Lista de produtos e queira filtrar apenas os produtos de uma determinada categoria.
    -> Crie uma classe Produtos com os atributos nome(String) e categoria(String)
    -> Crie um programa que Leia uma lista de Produtos e filtre pela categoria "Vestuário"
    List<Produto> produtos = List.of(
            new Produto("Notebook", "Eletrônicos"),
            new Produto("Camisa", "Vestuário"),
            new Produto("Smartphone", "Eletrônicos"),
            new Produto("Tênis", "Calçados"));
    */

    public static void main(String[] args) {
        List<Produto> produtos = List.of(
                new Produto("Notebook", "Eletrônicos"),
                new Produto("Camisa", "Vestuário"),
                new Produto("Smartphone", "Eletrônicos"),
                new Produto("Tênis", "Calçados"));

        produtos.stream()
                .filter(produto -> produto.getCategoria().equalsIgnoreCase("Vestuário"))
                .forEach(produto -> System.out.println(produto));
    }
}
