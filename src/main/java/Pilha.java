/**
 * Define uma estrutura de dados do tipo Pilha (LIFO).
 * Ordena os objetos do tipo Solicitacao.
 */
public class Pilha {
    private Node topo;

    public Pilha() {
        this.topo = null;
    }

    /**
     * Verifica se a pilha está vazia.
     * @return 'True' se a pilha estiver vazia.
     */
    public boolean isEmpty() {
        return topo == null;
    }

    /**
     * Adiciona uma Solicitacao ao topo da pilha e cria o Node necessário para o encadeamento.
     * @param s - Solicitacao.
     */
    public void adicionar(Solicitacao s) {
        Node n = new Node(s);
        if (isEmpty()) topo = n;
        else {
            Node aux = topo;
            topo = n;
            n.setProximo(aux);
        }
    }

    /**
     * Remove a Solicitacao do topo da fila e retorna seus dados.
     * @return String contendo os atributos da Solicitacao.
     */
    public Solicitacao retirar() {
        if (isEmpty()) {
            System.out.println("Histórico vazio.");
            return null;
        }
        Node aux = topo;
        topo = topo.getProximo();
        return aux.getSolicitacao();
    }

    /**
     * Exibe a pilha invocando o método 'toString' de cada nó que compõe a pilha.
     */
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