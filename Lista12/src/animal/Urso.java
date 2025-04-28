package animal;

public class Urso extends Animal {
    public Urso() {
        super("[urso]");
    }

    @Override
    public void emitirSom() {
        super.emitirSom();  // Chama o metodo da classe base, se necessário
    }
}
