package listasencadeadas;

public class ListaEncadeada {

    private No primeiro;
    private int tamanho;

    public ListaEncadeada() {
        primeiro = null;
        tamanho = 0;
    }

    public void adicionar(int valor, int posicao) {

        if (posicao < 0 || posicao > tamanho) {
            System.out.println("Não foi possível inserir: posição inválida.");
            return;
        }

        No novo = new No(valor);

        // Inserção no começo
        if (posicao == 0) {
            novo.proximo = primeiro;
            primeiro = novo;
        } else {
            No anterior = primeiro;

            // Procura o elemento anterior à posição desejada
            for (int i = 0; i < posicao - 1; i++) {
                anterior = anterior.proximo;
            }

            novo.proximo = anterior.proximo;
            anterior.proximo = novo;
        }

        tamanho++;
    }

    public void imprimir() {

        if (primeiro == null) {
            System.out.println("Lista vazia.");
            return;
        }

        No auxiliar = primeiro;

        System.out.print("Lista: ");

        while (auxiliar != null) {
            System.out.print(auxiliar.valor);

            if (auxiliar.proximo != null) {
                System.out.print(" -> ");
            }

            auxiliar = auxiliar.proximo;
        }

        System.out.println();
    }

    public int getTamanho() {
        return tamanho;
    }
}