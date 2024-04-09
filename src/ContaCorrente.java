public class ContaCorrente extends Conta {
    public ContaCorrente(String numero, String titular, String agencia, String idUsuario) {
        super(idUsuario);
        this.setNumero(numero);
        this.setTitular(titular);
        this.setAgencia(agencia);
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

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.setSaldo(this.getSaldo() + valor);
        }
    }

    public double consultarSaldo() {
        return this.getSaldo();
    }
}
