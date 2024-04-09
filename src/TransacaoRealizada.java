public interface TransacaoRealizada {

    public void Sacar(Conta conta, Double valor, String observacao);
    public void Depositar(Conta conta, Double valor, String observacao);
    public void Transferir(Conta contaOrigem, Conta contaDestino, Double valor,String observacao);
    public void Investir(ContaCorrente conta, Double valor, String observacao);
}