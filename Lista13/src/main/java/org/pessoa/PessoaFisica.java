package org.pessoa;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaFisica extends Pessoa {
    private String cpf;

    // Construtor
    public PessoaFisica(String nome, String endereco, String cpf) {
        super(nome, endereco);  // Chama o construtor da classe Pessoa
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString() + ", CPF: " + cpf;
    }
}
