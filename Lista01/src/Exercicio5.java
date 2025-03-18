import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a diagonal maior do losango");
        double diagonalMaior = sc.nextDouble();
        System.out.println("Digite a diagonal menor do losango");
        double diagonalMenor = sc.nextDouble();

        double area = (diagonalMaior * diagonalMenor) / 2;
        System.out.println("Área do losango: " + area);

        sc.close();
    }
}

