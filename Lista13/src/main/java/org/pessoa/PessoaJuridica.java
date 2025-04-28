package org.pessoa;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaJuridica extends Pessoa {
    private String cnpj;

    // Construtor
    public PessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco);  // Chama o construtor da classe Pessoa
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return super.toString() + ", CNPJ: " + cnpj;
    }
}