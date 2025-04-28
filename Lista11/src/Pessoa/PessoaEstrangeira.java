package Pessoa;

public class PessoaEstrangeira extends Pessoa {
    private String passaporte;

    public PessoaEstrangeira(String nome, String passaporte) {
        super(nome);  // Chama o construtor da classe Pessoa
        this.passaporte = passaporte;
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    @Override
    public String getIdentificacao() {
        return super.getIdentificacao() + " | Passaporte: " + this.passaporte;
    }
}
