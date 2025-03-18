import java.util.Locale;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número (dividendo): ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número (divisor): ");
        int n2 = sc.nextInt();

        // Criação da instância da classe Divisao
        Divisao div = new Divisao();

        try {
            double resultado = div.dividir(n1, n2);
            System.out.printf("Resultado da divisão: %.2f%n", resultado);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
