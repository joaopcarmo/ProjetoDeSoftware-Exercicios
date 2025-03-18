import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int somaPares = 0, maior = 0, menor = 0;
         String posicoesNegativas = "";
         String elementosImpares = "";
         int[] vect = new int[10];

         for(int i = 0; i < 10; i++){
             vect[i] = sc.nextInt();
         }

        menor = maior = vect[0];


        for(int i = 0 ; i < 10 ; i++){
            if(vect[i] % 2 == 0){
                somaPares += vect[i]; //soma dos números pares
            }
            if(vect[i] < 0 ){
                posicoesNegativas += i + " ";  //guarda posição dos negativos
            }
            if(vect[i] < menor){  //menor número
                menor = vect[i];
            }
            if(vect[i] > maior){ //maior número
                maior = vect[i];
            }
            if (i % 2 != 0) {
                elementosImpares += vect[i] + " ";  //elemente nas posicoes impares
            }
        }

        System.out.println("\nVetor lido: " + java.util.Arrays.toString(vect));
        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Posições com números negativos: " + (posicoesNegativas.isEmpty() ? "Nenhuma" : posicoesNegativas));
        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);
        System.out.println("Elementos nas posições ímpares: " + (elementosImpares.isEmpty() ? "Nenhum" : elementosImpares));

        sc.close();
    }
}
