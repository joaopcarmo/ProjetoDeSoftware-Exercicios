import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média aritmética é: %.2f%n", media);

        sc.close();
    }
}
