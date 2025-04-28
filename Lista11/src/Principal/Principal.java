package Principal;

import Pessoa.*;

public class Principal {

    public static void main(String[] args) {
        Pessoa pessoa;

        // Pessoa Física
        pessoa = new PessoaFisica("Ana", "123.456.789-00");
        System.out.println(pessoa.getIdentificacao());

        // Pessoa Jurídica
        pessoa = new PessoaJuridica("Escola", "03.278.251/0001-32");
        System.out.println(pessoa.getIdentificacao());

        // Pessoa Estrangeira
        pessoa = new PessoaEstrangeira("Ana", "123456789");
        System.out.println(pessoa.getIdentificacao());
    }
}
