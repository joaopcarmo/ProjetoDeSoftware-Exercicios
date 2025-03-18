import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = somaProdutos(sc);

        System.out.printf("O total da compra é: R$ %.2f%n", total);

    }

    public static double somaProdutos(Scanner sc) {
        System.out.println("Quantos preços serão somados? ");
        int n = sc.nextInt();
        double soma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.printf("Digite o preço do produto %d: R$ ", i);
            soma += sc.nextDouble();
        }
        return soma;
    }
}
