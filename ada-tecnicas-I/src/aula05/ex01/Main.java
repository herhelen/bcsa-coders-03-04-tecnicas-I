package aula05.ex01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    /*
    Exercício 1: Processamento Lista de Produto
    Crie um programa que leia uma lista de produtos e realize as seguintes funcionalidades
    A Classe Produto possui os atributos nome(String) e preço(Double) e quantidade(Integer)
    List<Produto> produtos = Arrays.asList(
        new Produto("Notebook", 2500.0, 10),
        new Produto("Impressora", 800.0, 5),
        new Produto("Mouse", 50.0, 20),
        new Produto("Teclado", 100.0, 15)
    );
    Funcionalidades
    1. Filtrar os produtos com preço acima de 500 e imprimir seus nomes. Dica: Use filter e forEach.
    2. Mapear os produtos para seus preços e imprimir a lista resultante.  Dica: Use map e forEach.
    3. Encontrar o produto mais barato.
    4. Filtrar os produtos com quantidade em estoque menor que 10 e imprimir seus nomes.
    */

    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Notebook", 2500.0, 10),
                new Produto("Impressora", 800.0, 5),
                new Produto("Mouse", 50.0, 20),
                new Produto("Teclado", 100.0, 15)
        );

        // 1. Filtrar os produtos com preço acima de 500 e imprimir seus nomes. Dica: Use filter e forEach.
        System.out.println("Funcionalidade 1");
        produtos.stream()
                .filter(p -> p.getPreco() > 500)
                .map(p -> p.getNome())
                .forEach(System.out::println);

        // 2. Mapear os produtos para seus preços e imprimir a lista resultante.  Dica: Use map e forEach.
        System.out.println("\nFuncionalidade 2");
        produtos.stream()
                .map(p -> String.format("O valor do produto %s é %.2f.", p.getNome(), p.getPreco()))
                .forEach(System.out::println);

        // 3. Encontrar o produto mais barato.
        System.out.println("\nFuncionalidade 3");
        System.out.println(produtos.stream()
                .min((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco())));

        // 4. Filtrar os produtos com quantidade em estoque menor que 10 e imprimir seus nomes.
        System.out.println("\nFuncionalidade 4");
        produtos.stream()
                .filter(p -> p.getQtde() < 10)
                .map(p -> p.getNome())
                .forEach(System.out::println);


    }
}
