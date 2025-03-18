import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso");
        double peso = sc.nextDouble();

        double pesoEngordar = peso + (peso * 0.15);
        double pesoEmagrecer = peso - (peso * 0.20);
        System.out.println("Peso engordando 15%: " + pesoEngordar);
        System.out.println("Peso emagrecendo 20%: " + pesoEmagrecer);

        sc.close();
    }
}

