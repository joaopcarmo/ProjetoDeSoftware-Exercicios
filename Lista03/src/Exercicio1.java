import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int alunosMediaMaiorQue90 = 0, alunosReprovados = 0, numAlunos = 0;
        int maiorNota = Integer.MIN_VALUE, menorNota = Integer.MAX_VALUE;
        int nota, totalFaltas;
        double somaNotas = 0;

        System.out.println("Digite a nota final do aluno (0 a 100) ou um valor negativo para encerrar:");
        nota = sc.nextInt();

        while (nota >= 0) { // O loop continua enquanto a nota for >= 0
            System.out.println("Digite o total de faltas:");
            totalFaltas = sc.nextInt();

            // Contabiliza o número de alunos
            numAlunos++;
            somaNotas += nota;

            // Atualiza maior e menor nota
            if (nota > maiorNota) {
                    maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }

            if (nota >= 90) {
                alunosMediaMaiorQue90++;
            }

            if (nota < 70 || totalFaltas >= 20) {
                alunosReprovados++;
            }

            System.out.println("Digite a nota final do aluno (0 a 100) ou um valor negativo para encerrar:");
            nota = sc.nextInt();
        }

        double media = numAlunos > 0 ? somaNotas / numAlunos : 0;

        System.out.println("Quantidade de alunos que tiveram nota final maior ou igual a 90: " + alunosMediaMaiorQue90);
        System.out.println("Quantidade de alunos reprovados: " + alunosReprovados);
        System.out.println("Maior nota: " + (numAlunos > 0 ? maiorNota : "Nenhuma nota cadastrada"));
        System.out.println("Menor nota: " + (numAlunos > 0 ? menorNota : "Nenhuma nota cadastrada"));
        System.out.println("Média de notas da turma: " + media);

        sc.close();
    }
}


