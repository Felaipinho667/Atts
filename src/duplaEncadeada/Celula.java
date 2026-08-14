package duplaEncadeada;

public class Celula {

    private int valor;
    private Celula esquerda;
    private Celula direita;

    public Celula(int valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Celula getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Celula esquerda) {
        this.esquerda = esquerda;
    }

    public Celula getDireita() {
        return direita;
    }

    public void setDireita(Celula direita) {
        this.direita = direita;
    }
}