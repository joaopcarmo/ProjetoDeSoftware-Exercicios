package org.principal;

import org.pessoa.Pessoa;
import org.pessoa.PessoaFisica;
import org.pessoa.PessoaJuridica;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando o vetor de pessoas
        Pessoa[] pessoas = new Pessoa[5];

        // Permitir que o usuario insira pessoas físicas ou jurídicas no vetor
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Deseja cadastrar uma Pessoa Física ou Jurídica?");
            String tipo = sc.nextLine().toLowerCase();

            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();
            System.out.print("Digite o endereço: ");
            String endereco = sc.nextLine();

            if (tipo.equals("fisica")) {
                System.out.print("Digite o CPF: ");
                String cpf = sc.nextLine();
                pessoas[i] = new PessoaFisica(nome, endereco, cpf);
            } else if (tipo.equals("juridica")) {
                System.out.print("Digite o CNPJ: ");
                String cnpj = sc.nextLine();
                pessoas[i] = new PessoaJuridica(nome, endereco, cnpj);
            } else {
                System.out.println("Tipo inválido! Cadastrando como Pessoa Física por padrão.");
                System.out.print("Digite o CPF: ");
                String cpf = sc.nextLine();
                pessoas[i] = new PessoaFisica(nome, endereco, cpf);
            }
        }

        // Percorrer o vetor e exibir os dados de cada pessoa
        System.out.println("\nPessoas cadastradas:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}

