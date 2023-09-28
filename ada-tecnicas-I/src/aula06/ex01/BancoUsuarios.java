package aula06.ex01;

import java.util.List;
import java.util.Optional;

public class BancoUsuarios {
    private List<Usuario> usuarios;

    public BancoUsuarios() {
        this.usuarios = List.of(
            new Usuario("ApenasNome"),
            new Usuario("InfoCompleto", Optional.of("email@email.com"), Optional.of(22)),
            new Usuario("SemIdade", Optional.of("email2@email.com"), Optional.empty()),
            new Usuario("SemEmail", Optional.empty(), Optional.of(31))
        );
    }

    public List<Usuario> getUsuarios() {
        return this.usuarios;
    }
}
