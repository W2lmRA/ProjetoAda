public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String numero, String titular, String agencia, double taxaRendimento, String idUsuario) {
        super(idUsuario);
        this.setNumero(numero);
        this.setTitular(titular);
        this.setAgencia(agencia);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public boolean sacar(double valor, boolean destinatario) {
        return false;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean transferir(double valor, boolean destinatario) {
        if (valor > 0 && valor <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        } else {
            return false;
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.setSaldo(this.getSaldo() + valor);
        }
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
