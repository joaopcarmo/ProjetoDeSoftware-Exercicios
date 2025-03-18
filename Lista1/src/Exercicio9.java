import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro cateto");
        double catetoB = sc.nextDouble();
        System.out.println("Digite o valor do segundo cateto");
        double catetoC = sc.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(catetoB, 2) + Math.pow(catetoC, 2));
        System.out.println("Hipotenusa: " + hipotenusa);

        sc.close();
    }
}

