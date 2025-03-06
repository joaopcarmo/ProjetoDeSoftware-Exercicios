import java.util.Scanner;

public class Lista5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        exercicio1(sc);

    }
    public static void exercicio1(Scanner sc) {
        int n = 0, fatorial = 1;

        System.out.println("Digite o número que deseja descobrir o fatorial: ");
        n = sc.nextInt();

         if (n < 0){
            System.out.println("Número inválido! Número deve ser positivo!");
        } else {
            for (int i = n; i > 1; i--) {
                 fatorial *= i;
            }
             System.out.println("Fatorial de " + n + " é: " + fatorial);
        }

    }
}