/**
 * Define uma estrutura de dados do tipo Fila (FIFO).
 * Ordena os objetos do tipo Cliente.
 */
public class Fila {
    private Node primeiro;
    private Node ultimo;

    /**
     * Verifica se a fila está vazia.
     * @return 'True' se estiver vazia.
     */
    public boolean isEmpty() {
        return (primeiro == null && ultimo == null);
    }

    /**
     * Adiciona um Cliente ao final da fila e cria o Node necessário para o encadeamento.
     * @param c - Cliente.
     */
    public void adicionar(Cliente c) {
        Node n = new Node(c);
        if (isEmpty()) {
            primeiro = n;
        } else {
            ultimo.setProximo(n);
        }
        ultimo = n;
    }

    /**
     * Remove o primeiro cliente da fila e retorna seus dados.
     * @return String contendo os atributos do Cliente.
     */
    public Cliente atenderPrimeiro() {
        if (isEmpty()) return null;
        else {
            Node aux = primeiro;
            primeiro = primeiro.getProximo();
            return aux.getCliente();
        }
    }

    /**
     * Exibe a fila invocando o método 'toString' de cada nó que compõe a fila.
     */
    public void print() {
        if (isEmpty()) System.out.println("Fila vazia");
        else {
            Node aux = primeiro;
            while (aux != null) {
                System.out.println(aux.getCliente().toString());
                aux = aux.getProximo();
            }
        }
    }
}