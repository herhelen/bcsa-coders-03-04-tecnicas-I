package aula06.ex01;

import java.util.Optional;

public class Usuario {
    private String nome;
    private Optional<String> email;
    private Optional<Integer> idade;

    public Usuario(String nome) {
        this.nome = nome;
        this.email = Optional.empty();
        this.idade = Optional.empty();
    }

    public Usuario(String nome, Optional<String> email, Optional<Integer> idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public Optional<String> getEmail() {
        return this.email;
    }

    public Optional<Integer> getIdade() {
        return this.idade;
    }

    public void mostrarDetalhes() {
        System.out.println("Nome: " + this.nome);

        this.email.ifPresentOrElse(
            x -> System.out.println("E-mail: " + x),
            () -> System.out.println("E-mail: Informação não disponível.")
        );

        this.idade.ifPresentOrElse(
            x -> System.out.println("Idade: " + x),
            () -> System.out.println("Idade: Informação não disponível.")
        );
    }
}
