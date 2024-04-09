public class PessoaFisica extends Usuario {
    private String CPF;

    public PessoaFisica(String nome, String CPF) {
        this.CPF = CPF;
    }


    public String getCPF() {
        return this.CPF;
    }


    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
