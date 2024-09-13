public class Pilha {
    private Node topo;

    public Pilha() {
        this.topo = null;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public void adicionar(Solicitacao s) {
        Node n = new Node(s);
        if (isEmpty()) topo = n;
        else {
            Node aux = topo;
            topo = n;
            n.setProximo(aux);
        }
    }

    public Solicitacao retirar() {
        if (isEmpty()) {
            System.out.println("Histórico vazio.");
            return null;
        }
        Node aux = topo;
        topo = topo.getProximo();
        return aux.getSolicitacao();
    }

    public void print() {
        if (isEmpty()) System.out.println("Pilha vazia.");
        else {
            Node aux = topo;
            while (aux != null) {
                System.out.println(aux.getSolicitacao().toString());
                aux = aux.getProximo();
            }
        }
    }
}