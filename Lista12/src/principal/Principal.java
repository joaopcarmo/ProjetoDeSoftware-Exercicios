package principal;

import animal.*;

public class Principal {
    public static void main(String[] args) {
        // Criando o vetor de 10 animais
        Animal[] zoologico = new Animal[10];

        // Preenchendo o vetor com diferentes tipos de animais
        zoologico[0] = new Elefante();
        zoologico[1] = new Gorila();
        zoologico[2] = new Leao();
        zoologico[3] = new Urso();
        zoologico[4] = new Zebra();
        zoologico[5] = new Elefante();
        zoologico[6] = new Gorila();
        zoologico[7] = new Leao();
        zoologico[8] = new Urso();
        zoologico[9] = new Zebra();

        // Percorrendo o vetor e chamando o metodo emitirSom() de cada animal
        for (Animal animal : zoologico) {
            System.out.println("Animal: " + animal.toString());
            animal.emitirSom();
        }
    }
}
