package application;

import entitites.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta contaCorrente = new Conta();

        System.out.print("Informe o número da agência: ");
        int agencia = sc.nextInt();

        System.out.print("Digite o número do conta: ");
        int numeroConta = sc.nextInt();

        contaCorrente.iniciarContaCorrente(numeroConta, agencia);

        System.out.print("Digite o valor do depósito: R$ ");
        double deposito = sc.nextDouble();
        contaCorrente.depositar(deposito);

        contaCorrente.exibe();

        System.out.print("\nDigite o valor do saque: R$ ");
        double saque = sc.nextDouble();
        contaCorrente.sacar(saque);

        // Exibe os dados após o saque
        contaCorrente.exibe();

        sc.close();
    }
}

