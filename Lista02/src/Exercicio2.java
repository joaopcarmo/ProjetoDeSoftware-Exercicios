import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
        sc.close();
    }
}

