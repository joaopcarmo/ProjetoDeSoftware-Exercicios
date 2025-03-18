import java.util.Locale;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = sc.nextInt();

        try {
            int divisao =  n1 / n2;
            System.out.println("Resultado da divisão: " + divisao);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero não é permitida.");
        }
        sc.close();
    }
}
