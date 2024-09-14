/**
 * Objeto que contém atributos e métodos de um Cliente.
 */
public class Cliente {
    private String id;
    private String nome;
    private String motivo;

    public Cliente(String id, String nome, String motivo) {
        this.id = id;
        this.nome = nome;
        this.motivo = motivo;
    }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }
    /**
     * Consolida os atributos da classe em forma de String.
     * @return String contendo os dados
     */
    public String toString() {
        return "[id=" + id + ", nome=" + nome + ", motivo=" + motivo + "]";
    }
}
