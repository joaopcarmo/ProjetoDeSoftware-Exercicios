import java.util.Scanner;

public class Lista2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        exercicio1(sc);
//        exercicio2(sc);
        sc.close();
    }

    public static void exercicio1(Scanner sc) {
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
    }

    public static void exercicio2(Scanner sc) {
        System.out.println("Digite o código do produto");
        int codigo = sc.nextInt();
        if (codigo == 1) {
            System.out.println("R$ 99,99");
        } else if (codigo == 2) {
            System.out.println("R$ 103,89");
        } else if (codigo == 3) {
            System.out.println("R$ 49,98");
        } else if (codigo == 4) {
            System.out.println("R$ 89,72");
        } else if (codigo == 5) {
            System.out.println("R$ 97,35");
        } else {
            System.out.println("Código Inválido");
        }
    }
}


