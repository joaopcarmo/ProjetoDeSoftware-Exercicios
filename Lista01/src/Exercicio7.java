import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do salário mínimo");
        double salarioMinimo = sc.nextDouble();
        System.out.println("Digite o salário do funcionário");
        double salarioFuncionario = sc.nextDouble();

        double contadorSalarioMinimo = salarioFuncionario / salarioMinimo;
        System.out.printf("Quantidade de salários mínimos recebidos: %.2f%n", contadorSalarioMinimo);

        sc.close();
    }
}


