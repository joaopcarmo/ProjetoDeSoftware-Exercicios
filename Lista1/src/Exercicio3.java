import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a cotação do dolar em reais");
        double cotacaoDolar = sc.nextDouble();
        System.out.println("Digite o valor possuído em dolar");
        double valorDolar = sc.nextDouble();

        double valorEmReal = cotacaoDolar * valorDolar;
        System.out.println("Valor possuído em real: 5" + valorEmReal);

        sc.close();
    }
}
