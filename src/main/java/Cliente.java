public class Cliente {
    private int id;
    private String nome;
    private String motivo;

    public Cliente(int id, String nome, String motivo) {
        this.id = id;
        this.nome = nome;
        this.motivo = motivo;
    }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }
    public String toString() {
        return "[id=" + id + ", nome=" + nome + ", motivo=" + motivo + "]";
    }
}
