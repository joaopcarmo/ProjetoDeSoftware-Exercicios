import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em celsius");
        double temperaturaCelcius = sc.nextDouble();

        double temperaturaFahrenheit = (temperaturaCelcius * 1.8) + 32;
        System.out.println("Temperatura em Fahrneitens: " + temperaturaFahrenheit);

        sc.close();
    }
}

