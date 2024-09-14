/**
 * Define um nó de uma lista encadeada.
 * Pode armazenar um objeto do tipo Solicitacao ou Cliente.
 */
public class Node {
    private Node proximo;
    private Solicitacao solicitacao;
    private Cliente cliente;

    /**
     * Define uma Solicitacao como um nó da lista encadeada.
     * @param s - Solicitacao.
     */
    public Node(Solicitacao s) {
        this.solicitacao = s;
    }

    /**
     * Define um Cliente como um nó da lista encadeada.
     * @param c - Cliente.
     */
    public Node(Cliente c) {
        this.cliente = c;
    }

    public Node getProximo() { return proximo; }
    public void setProximo(Node proximo) { this.proximo = proximo; }
    public Solicitacao getSolicitacao() { return solicitacao; }
    public void setSolicitacao(Solicitacao solicitacao) { this.solicitacao = solicitacao; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
}