public abstract class ContaInvestimento extends Conta {
    private double taxaRendimento;

    public ContaInvestimento(String numero, String titular, String agencia, String idUsuario) {
        super(idUsuario);
        this.setNumero(numero);
        this.setTitular(titular);
        this.setAgencia(agencia);
    }

    @Override
    public boolean sacar(double valor) {
        return false;
    }

    @Override
    public boolean transferir(double valor, boolean destinatario) {

        return false;
    }

    public void investir(double valor) {


    }

    @Override
    public void depositar(double valor) {

    }

    public double consultarSaldo() {
        return this.getSaldo();
    }

    public double getTaxaRendimento() {
        return this.taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}



