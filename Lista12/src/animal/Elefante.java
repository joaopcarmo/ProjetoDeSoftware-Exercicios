package animal;

public class Elefante extends Animal {
    public Elefante() {
        super("[elefante]");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de elefante.");
    }
}
