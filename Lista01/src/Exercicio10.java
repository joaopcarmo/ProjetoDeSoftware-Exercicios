import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio");
        double raio = sc.nextDouble();

        double comprimento = 2 * Math.PI * raio;
        double area = Math.PI * Math.pow(raio, 2);
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

        System.out.printf("O comprimento da esfera é: %.2f%n", comprimento);
        System.out.printf("A área da esfera é: %.2f%n", area);
        System.out.printf("O volume da esfera é: %.2f%n", volume);

        sc.close();
    }
}
