import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o seu ano de nascimento");
            int anoNascimento = sc.nextInt();
            int anoAtual = LocalDate.now().getYear();
            int idade = anoAtual - anoNascimento;
            int idade2050 = 2050 - anoNascimento;

            System.out.println("Sua idade é: " + idade);
            System.out.println("Em 2050 sua idade será: " + idade2050);

            sc.close();
        }
    }

