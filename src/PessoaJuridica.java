public class PessoaJuridica extends Usuario {
    private String CNPJ;

    public PessoaJuridica(String nome, String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return this.CNPJ;
    }


    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;

    }
}

