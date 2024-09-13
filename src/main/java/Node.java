public class Node {
    private Node proximo;
    private Solicitacao solicitacao;
    private Cliente cliente;

    public Node(Solicitacao s) {
        this.solicitacao = s;
    }
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