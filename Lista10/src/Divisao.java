public class Divisao {
    public double dividir(int dividendo, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Erro: Divisão por zero não é permitida.");
        }
        if (dividendo < 0) {
            throw new ArithmeticException("Erro: O dividendo não pode ser negativo.");
        }
        return (double) dividendo / divisor;
    }
}
