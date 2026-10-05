package Projeto0510;

public class ListaDupla {
    No inicio = null;
    No fim = null;
    int tamanho = 0;

    // INSERIR
    public void inserirInicio(Contato c) {
        No novo = new No(c);
        if (tamanho == 0) {
            inicio = novo;
            fim = novo;
        } else {
            novo.prox = inicio;
            inicio.ant = novo;
            inicio = novo;
        }
        tamanho++;
    }

    public void inserirFim(Contato c) {
        No novo = new No(c);
        if (tamanho == 0) {
            inicio = novo;
            fim = novo;
        } else {
            novo.ant = fim;
            fim.prox = novo;
            fim = novo;
        }
        tamanho++;
    }

    public void inserirPosicao(int pos, Contato c) {
        if (pos < 1 || pos > tamanho + 1) {
            System.out.println("Posicao invalida!");
            return;
        }
        if (pos == 1) {
            inserirInicio(c);
        } else if (pos == tamanho + 1) {
            inserirFim(c);
        } else {
            No atual = inicio;
            for (int i = 1; i < pos; i++) {
                atual = atual.prox;
            }
            No novo = new No(c);
            novo.ant = atual.ant;
            novo.prox = atual;
            atual.ant.prox = novo;
            atual.ant = novo;
            tamanho++;
        }
    }

    // REMOVER
    public void removerInicio() {
        if (tamanho == 0) {
            System.out.println("Lista vazia!");
            return;
        }
        if (tamanho == 1) {
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.prox;
            inicio.ant = null;
        }
        tamanho--;
    }

    public void removerFim() {
        if (tamanho == 0) {
            System.out.println("Lista vazia!");
            return;
        }
        if (tamanho == 1) {
            inicio = null;
            fim = null;
        } else {
            fim = fim.ant;
            fim.prox = null;
        }
        tamanho--;
    }

    public void removerPosicao(int pos) {
        if (pos < 1 || pos > tamanho) {
            System.out.println("Posicao invalida!");
            return;
        }
        if (pos == 1) {
            removerInicio();
        } else if (pos == tamanho) {
            removerFim();
        } else {
            No atual = inicio;
            for (int i = 1; i < pos; i++) {
                atual = atual.prox;
            }
            atual.ant.prox = atual.prox;
            atual.prox.ant = atual.ant;
            tamanho--;
        }
    }

    // VERIFICAR POSICAO
    public void verificarPosicao(int pos) {
        if (pos < 1 || pos > tamanho) {
            System.out.println("Posicao invalida!");
            return;
        }
        No atual = inicio;
        for (int i = 1; i < pos; i++) {
            atual = atual.prox;
        }
        System.out.println("Posicao " + pos + ": " + atual.contato);
    }

    // LISTAR
    public void listar() {
        if (tamanho == 0) {
            System.out.println("Lista vazia!");
            return;
        }
        No atual = inicio;
        int pos = 1;
        while (atual != null) {
            System.out.println(pos + " - " + atual.contato);
            atual = atual.prox;
            pos++;
        }
    }

    // PESQUISAR
    public void pesquisar(String nome) {
        No atual = inicio;
        int pos = 1;
        boolean achou = false;
        while (atual != null) {
            if (atual.contato.nome.toLowerCase().contains(nome.toLowerCase())) {
                System.out.println("Encontrado na posicao " + pos + ": " + atual.contato);
                achou = true;
            }
            atual = atual.prox;
            pos++;
        }
        if (!achou) {
            System.out.println("Contato nao encontrado!");
        }
    }
}
