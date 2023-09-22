package aula03.ex01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {

    /*
    Exercicio 1
    Uma empresa de e-commerce precisa saber o preço total de produtos
    num carrinho de compras de seu aplicativo.
    Seu trabalho como dev, é criar um método que receba uma lista com produtos
    e uma lambda com implementação do método por parâmetro.

    Requisitos de implementação:
    Classe Produto com os atributos getter e setter.
    Classe Main com um método calcular.
    lambda com o corpo do método para somar todos os preços do carrinho de compras.
    */

    public static void main(String[] args) {
        Function<List<Produto>, BigDecimal> calcular = lista -> {
            BigDecimal total = BigDecimal.ZERO;
            for (Produto produto : lista) {
                total = total.add(produto.getPreco());
            }
            return total;
        };

        List<Produto> carrinho = new ArrayList<>();
        carrinho.add(new Produto("papel higienico", BigDecimal.valueOf(22.99)));
        carrinho.add(new Produto("arroz", BigDecimal.valueOf(32.99)));
        carrinho.add(new Produto("cenoura", BigDecimal.valueOf(11.69)));
        carrinho.add(new Produto("bife", BigDecimal.valueOf(19.95)));
        carrinho.add(new Produto("alface", BigDecimal.valueOf(5.99)));

        System.out.println(calcular.apply(carrinho));

    }
}
