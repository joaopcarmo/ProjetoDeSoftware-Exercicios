import java.util.Scanner;

public class Lista4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        exercicio1(sc);
        sc.close();
    }

    public static void exercicio1(Scanner sc) {

        int nota, idade;
        double salario;
        char sexo;

        do {
            System.out.print("Informe a nota (0 a 100): ");
            nota = sc.nextInt();
            if (nota < 0 || nota > 100) {
                System.out.println("Nota deve ser entre 0 e 100. Tente novamente.");
            }
        } while (nota < 0 || nota > 100);


        do {
            System.out.print("Informe o salário: ");
            salario = sc.nextDouble();
            if (salario <= 0) {
                System.out.println("Salário deve ser maior que 0. Tente novamente.");
            }
        } while (salario <= 0);


        do {
            System.out.print("Informe o sexo (m ou f): ");
            sexo = sc.next().toLowerCase().charAt(0);
            if (sexo != 'm' && sexo != 'f') {
                System.out.println("Sexo deve ser m ou f. Tente novamente.");
            }
        } while (sexo != 'm' && sexo != 'f');


        do {
            System.out.print("Informe a idade (0 a 110): ");
            idade = sc.nextInt();
            if (idade < 0 || idade > 110) {
                System.out.println("Idade deve ser entre 0 e 110. Tente novamente.");
            }
        } while (idade < 0 || idade > 110);

        System.out.println("Todos os dados foram informados corretamente. Cadastro finalizado com sucesso!");
        sc.close();
    }
}