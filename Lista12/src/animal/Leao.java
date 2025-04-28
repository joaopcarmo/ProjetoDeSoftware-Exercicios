package animal;

public class Leao extends Animal {
    public Leao() {
        super("[leao]");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de leao.");
    }
}
