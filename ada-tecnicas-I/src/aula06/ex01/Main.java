package aula06.ex01;

public class Main {
    /*
    Exercício 1: Gerenciamento de Usuários em uma Aplicação
	Suponha que você está desenvolvendo uma aplicação de gerenciamento de usuários.
	Cada usuário possui um nome, um e-mail e uma idade. No entanto, algumas informações podem estar ausentes.
	Crie uma classe Usuario com os seguintes atributos:
		- nome (String)
		- email (Optional<String>)
		- idade (Optional<Integer>)
	Implemente um método na classe Usuario chamado mostrarDetalhes() que imprime o nome,
	e-mail (se presente) e idade (se presente) do usuário.
	Se o e-mail ou idade estiverem ausentes, a mensagem "Informação não disponível" deve ser exibida.

	Crie uma lista de usuários e inclua alguns usuários com diferentes
	combinações de informações disponíveis e ausentes.

	Para cada usuário na lista, chame o método mostrarDetalhes() para exibir suas informações.

	Dica: Use o Optional.ifPresent() para verificar se o e-mail ou a idade está presente e,
	em caso afirmativo, execute uma ação.
	Use o método orElse() para fornecer um valor padrão se a informação estiver ausente.
	*/

    public static void main(String[] args) {
        BancoUsuarios bd = new BancoUsuarios();

        for (Usuario u : bd.getUsuarios()) {
            u.mostrarDetalhes();
            mostrarDetalhesValorPadrao(u);
            System.out.println();
        }
    }

    public static void mostrarDetalhesValorPadrao(Usuario u) {
        System.out.println("Nome: " + u.getNome());

        if(u.getEmail().isPresent()) {
            System.out.println("E-mail: " + u.getEmail().get());
        } else {
            System.out.println("E-mail: " + u.getEmail().orElse("padrao@email.com"));
        }

        if(u.getIdade().isPresent()) {
            System.out.println("Idade: " + u.getIdade().get());
        } else {
            System.out.println("Idade: " + u.getIdade().orElse(0));
        }
    }
}
