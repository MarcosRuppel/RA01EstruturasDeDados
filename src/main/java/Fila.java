public class Fila {
    private Node primeiro;
    private Node ultimo;

    public boolean isEmpty() {
        return (primeiro == null && ultimo == null);
    }

    public void adicionar(Cliente c) {
        Node n = new Node(c);
        if (isEmpty()) {
            primeiro = n;
        } else {
            ultimo.setProximo(n);
        }
        ultimo = n;
    }

    public Cliente atenderPrimeiro() {
        if (isEmpty()) return null;
        else {
            Node aux = primeiro;
            primeiro = primeiro.getProximo();
            return aux.getCliente();
        }
    }

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