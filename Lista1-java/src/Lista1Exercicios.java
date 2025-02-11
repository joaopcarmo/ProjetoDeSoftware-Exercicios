import java.util.Scanner;
import java.time.LocalDate;

public class Lista1Exercicios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        exercicio1(scanner);
//        exercicio2(scanner);
//        exercicio3(scanner);
//        exercicio4(scanner);
//        exercicio5(scanner);
//        exercicio5(scanner);
//        exercicio6(scanner);
//        exercicio7(scanner);
//        exercicio8(scanner);
//        exercicio9(scanner);
//        exercicio10(scanner);
        scanner.close();
    }

    public static void exercicio1(Scanner scanner) {
        System.out.println("Digite a primeira nota");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média aritmética é: %.2f%n", media);
    }


    public static void exercicio2(Scanner scanner) {
        System.out.println("Digite o seu ano de nascimento");
        int anoNascimento = scanner.nextInt();
        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - anoNascimento;
        int idade2050 = 2050 - anoNascimento;

        System.out.println("Sua idade é: " + idade);
        System.out.println("Em 2050 sua idade será: " + idade2050);
    }


    public static void exercicio3(Scanner scanner) {
       System.out.println("Digite a cotação do dolar em reais");
       double cotacaoDolar = scanner.nextDouble();
       System.out.println("Digite o valor possuído em dolar");
       double valorDolar = scanner.nextDouble();

       double valorEmReal = cotacaoDolar * valorDolar;
       System.out.println("Valor possuído em real: 5" + valorEmReal);
    }


    public static void exercicio4(Scanner scanner) {
        System.out.println("Digite o seu salário");
        double salarioAtual = scanner.nextDouble();

        double salarioDepoisdoAumento = salarioAtual + (salarioAtual * 0.25);
        System.out.println("Seu salário depois do aumento é de: " + salarioDepoisdoAumento);
    }


    public static void exercicio5(Scanner scanner) {
        System.out.println("Digite a diagonal maior do losango");
        double diagonalMaior = scanner.nextDouble();
        System.out.println("Digite a diagonal menor do losango");
        double diagonalMenor = scanner.nextDouble();

        double area = (diagonalMaior * diagonalMenor) / 2;
        System.out.println("Área do losango: " + area);
    }


    public static void exercicio6(Scanner scanner) {
        System.out.println("Digite a temperatura em celsius");
        double temperaturaCelcius = scanner.nextDouble();

        double temperaturaFahrenheit = (temperaturaCelcius * 1.8) + 32;
        System.out.println("Temperatura em Fahrneitens: " + temperaturaFahrenheit);
    }


    public static void exercicio7(Scanner scanner) {
        System.out.println("Digite o valor do salário mínimo");
        double salarioMinimo = scanner.nextDouble();
        System.out.println("Digite o salário do funcionário");
        double salarioFuncionario = scanner.nextDouble();

        double contadorSalarioMinimo = salarioFuncionario / salarioMinimo;
        System.out.printf("Quantidade de salários mínimos recebidos: %.2f%n", contadorSalarioMinimo);
    }


    public static void exercicio8(Scanner scanner) {
        System.out.println("Digite seu peso");
        double peso = scanner.nextDouble();

        double pesoEngordar = peso + (peso * 0.15);
        double pesoEmagrecer = peso - (peso * 0.20);
        System.out.println("Peso engordando 15%: " + pesoEngordar);
        System.out.println("Peso emagrecendo 20%: " + pesoEmagrecer);
    }


    public static void exercicio9(Scanner scanner) {
        System.out.println("Digite o valor do primeiro cateto");
        double catetoB = scanner.nextDouble();
        System.out.println("Digite o valor do segundo cateto");
        double catetoC = scanner.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(catetoB, 2) + Math.pow(catetoC, 2));
        System.out.println("Hipotenusa: " + hipotenusa);
    }


    public static void exercicio10(Scanner scanner) {
        System.out.println("Digite o raio");
        double raio = scanner.nextDouble();

        double comprimento = 2 * Math.PI * raio;
        double area = Math.PI * Math.pow(raio, 2);
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

        System.out.printf("O comprimento da esfera é: %.2f%n", comprimento);
        System.out.printf("A área da esfera é: %.2f%n", area);
        System.out.printf("O volume da esfera é: %.2f%n", volume);
    }
}
