public interface Servicos {

    public void IncluirConta(Conta conta);
    public void CalcularRendimento();
    public Conta LocalizarConta(Long id);
    public boolean VerificarContaId(Long id);
    public ContaInvestimento VerificaContaInvestimento(String usuarioId);
}