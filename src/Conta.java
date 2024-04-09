import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    protected String id;
    protected List<String> historicoAcoes;
    protected LocalDateTime dataAtualizacao;
    protected Status status;
    protected String idUsuario;
    protected double saldo;
    protected double taxa;
    protected String titular;
    protected String numero;
    protected String agencia;

    public Conta(String idUsuario) {
        this.id = gerarId();
        this.historicoAcoes = new ArrayList<>();
        this.dataAtualizacao = LocalDateTime.now();
        this.status = Status.ATIVA;
        this.idUsuario = idUsuario;
        this.saldo = 0;
    }

    public abstract boolean sacar(double valor, boolean destinatario);

    public abstract boolean sacar(double valor);

    public abstract boolean transferir(double valor, boolean destinatario);

    public abstract void depositar(double valor);

    public String getId() {
        return this.id;
    }

    public List<String> getHistoricoAcoes() {
        return this.historicoAcoes;
    }

    public LocalDateTime getDataAtualizacao() {
        return this.dataAtualizacao;
    }

    public Status getStatus() {
        return this.status;
    }

    public String getIdUsuario() {
        return this.idUsuario;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getTaxa() {
        return this.taxa;
    }

    public String getTitular() {
        return this.titular;
    }

    public String getNumero() {
        return this.numero;
    }

    public String getAgencia() {
        return this.agencia;
    }

    protected void setId(String id) {
        this.id = id;
    }

    protected void setHistoricoAcoes(List<String> historicoAcoes) {
        this.historicoAcoes = historicoAcoes;
    }

    protected void setDataAtualizacao(LocalDateTime dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    protected void setStatus(Status status) {
        this.status = status;
    }

    protected void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    protected void setTitular(String titular) {
        this.titular = titular;
    }

    protected void setNumero(String numero) {
        this.numero = numero;
    }

    protected void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    private String gerarId() {
        return "ID_" + LocalDateTime.now().toString();
    }
}
