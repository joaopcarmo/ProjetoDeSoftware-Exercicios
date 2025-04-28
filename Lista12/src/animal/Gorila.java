package animal;

public class Gorila extends Animal {
    public Gorila() {
        super("[gorila]");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de gorila.");
    }
}
