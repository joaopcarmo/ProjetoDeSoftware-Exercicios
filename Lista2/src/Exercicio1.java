import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota de 0 a 10: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota de 0 a 10: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota de 0 a 10: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media < 3) {
            System.out.println("REPROVADO");
        } else if (media >= 3 && media < 7) {
            System.out.println("EXAME");
        } else if (media >= 7 && media <= 10) {
            System.out.println("APROVADO");
        } else {
            System.out.println("ERRO! NOTAS DEVEM SER DE 0 A 10");
        }
        sc.close();
    }
}

