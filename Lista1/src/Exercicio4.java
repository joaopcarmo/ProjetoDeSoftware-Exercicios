import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu salário");
        double salarioAtual = sc.nextDouble();

        double salarioDepoisdoAumento = salarioAtual + (salarioAtual * 0.25);
        System.out.println("Seu salário depois do aumento é de: " + salarioDepoisdoAumento);

        sc.close();
    }
}

