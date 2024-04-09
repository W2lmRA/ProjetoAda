import java.time.LocalDate;

public class Usuario {

    public abstract class Pessoa {
        protected String nome;
        protected String id;
        protected String classificacao;
        protected LocalDate dataCadastro;
        protected Status status;

        public Pessoa(String nome, String id, String classificacao, LocalDate dataCadastro, Status status) {
            this.nome = nome;
            this.id = id;
            this.classificacao = classificacao;
            this.dataCadastro = dataCadastro;
            this.status = status;
        }

        public String getNome() {
            return this.nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getClassificacao() {
            return this.classificacao;
        }

        public void setClassificacao(String classificacao) {
            this.classificacao = classificacao;
        }

        public LocalDate getDataCadastro() {
            return this.dataCadastro;
        }

        public void setDataCadastro(LocalDate dataCadastro) {
            this.dataCadastro = dataCadastro;
        }

        public Status getStatus() {
            return this.status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }

        public String toString() {
            return "Nome: " + this.getNome() + ", ID: " + this.getId() + ", Classificação: " + this.getClassificacao() +
                    ", Data de Cadastro: " + this.getDataCadastro() + ", Status: " + this.getStatus() + ".";
        }
    }

}

