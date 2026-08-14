package duplaEncadeada;

public class ListaDuplamenteEncadeada {

    private Celula primeiro;
    private Celula ultimo;
    private int quantidade;

    public ListaDuplamenteEncadeada() {
        primeiro = null;
        ultimo = null;
        quantidade = 0;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean estaVazia() {
        return quantidade == 0;
    }

    public void adicionarFim(int valor) {

        Celula nova = new Celula(valor);

        if (estaVazia()) {
            primeiro = nova;
            ultimo = nova;
        } else {
            ultimo.setDireita(nova);
            nova.setEsquerda(ultimo);
            ultimo = nova;
        }

        quantidade++;
    }

    public void adicionarInicio(int valor) {

        Celula nova = new Celula(valor);

        if (estaVazia()) {
            primeiro = nova;
            ultimo = nova;
        } else {
            nova.setDireita(primeiro);
            primeiro.setEsquerda(nova);
            primeiro = nova;
        }

        quantidade++;
    }

    public void adicionarNaPosicao(int valor, int posicao) {

        if (posicao < 0 || posicao > quantidade) {
            System.out.println("Posição inválida!");
            return;
        }

        if (posicao == 0) {
            adicionarInicio(valor);
            return;
        }

        if (posicao == quantidade) {
            adicionarFim(valor);
            return;
        }

        Celula nova = new Celula(valor);
        Celula atual = primeiro;

        for (int i = 0; i < posicao; i++) {
            atual = atual.getDireita();
        }

        Celula antes = atual.getEsquerda();

        antes.setDireita(nova);
        nova.setEsquerda(antes);

        nova.setDireita(atual);
        atual.setEsquerda(nova);

        quantidade++;
    }

    public void excluirInicio() {

        if (estaVazia()) {
            System.out.println("A lista está vazia!");
            return;
        }

        if (quantidade == 1) {
            primeiro = null;
            ultimo = null;
        } else {
            primeiro = primeiro.getDireita();
            primeiro.setEsquerda(null);
        }

        quantidade--;
    }

    public void excluirFim() {

        if (estaVazia()) {
            System.out.println("A lista está vazia!");
            return;
        }

        if (quantidade == 1) {
            primeiro = null;
            ultimo = null;
        } else {
            ultimo = ultimo.getEsquerda();
            ultimo.setDireita(null);
        }

        quantidade--;
    }

    public void excluirPosicao(int posicao) {

        if (posicao < 0 || posicao >= quantidade) {
            System.out.println("Posição inválida!");
            return;
        }

        if (posicao == 0) {
            excluirInicio();
            return;
        }

        if (posicao == quantidade - 1) {
            excluirFim();
            return;
        }

        Celula atual = primeiro;

        for (int i = 0; i < posicao; i++) {
            atual = atual.getDireita();
        }

        Celula antes = atual.getEsquerda();
        Celula depois = atual.getDireita();

        antes.setDireita(depois);
        depois.setEsquerda(antes);

        quantidade--;
    }

    public void mostrarLista() {

        System.out.print("[");

        Celula atual = primeiro;

        while (atual != null) {

            System.out.print(atual.getValor());

            if (atual.getDireita() != null) {
                System.out.print(", ");
            }

            atual = atual.getDireita();
        }

        System.out.println("]");
    }
}