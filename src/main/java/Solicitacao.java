public class Solicitacao {
    private int id;
    private String descricao;
    private final String data;
    private final String hora;

    public Solicitacao(int id, String descricao, String data, String hora) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
        this.hora = hora;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
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