package Pessoa;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String getIdentificacao() {
        return super.getIdentificacao() + " CNPJ: " + this.cnpj;
    }

    public String getIdentificacao(String telefone) {
        return super.getIdentificacao() + " CNPJ: " + this.cnpj + " Telefone: " + telefone;
    }
}
