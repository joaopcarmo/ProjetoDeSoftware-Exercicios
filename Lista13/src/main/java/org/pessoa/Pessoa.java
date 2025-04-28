package org.pessoa;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {
    private String nome;
    private String endereco;

    // Construtor
    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Endereço: " + endereco;
    }
}
