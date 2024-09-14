/**
 * Objeto que contem os atributos e métodos de uma solicitacao.
 */
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

    /**
     * Consolida os atributos da classe em forma de String.
     * @return String contendo os dados
     */
    public String toString() {
        return "[id=" + id + ", descricao=" + descricao + ", data=" + dataSolicitacao + "]";
    }
}