public class Solicitacao {
    private String id;
    private String descricao;
    private final String data;
    private final String hora;

    public Solicitacao(String id, String descricao, String data, String hora) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
        this.hora = hora;
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
    public String getData() { return data; }
    public String getHora() { return hora; }
    public String toString() {
        return "[id=" + id + ", descricao=" + descricao + ", data=" + data + ", hora=" + hora + "]";
    }
}