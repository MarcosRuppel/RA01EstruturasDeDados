public class Solicitacao {
    private String id;
    private String descricao;
    private final String dataSolicitacao;

    public Solicitacao(String id, String descricao, String dataHora) {
        this.id = id;
        this.descricao = descricao;
        this.dataSolicitacao = dataHora;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDataHora() { return dataSolicitacao; }
    public String toString() {
        return "[id=" + id + ", descricao=" + descricao + ", data=" + dataSolicitacao + "]";
    }
}