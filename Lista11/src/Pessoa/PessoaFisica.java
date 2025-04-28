package Pessoa;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getIdentificacao() {
        return super.getIdentificacao() + " CPF: " + this.cpf;
    }

    public String getIdentificacao(String telefone) {
        return super.getIdentificacao() + " CPF: " + this.cpf + " Telefone: " + telefone;
    }
}
