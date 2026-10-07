package listasencadeadas;

public class Main {

    public static void main(String[] args) {

        ListaEncadeada lista = new ListaEncadeada();

        lista.adicionar(10, 0);
        lista.adicionar(20, 1);
        lista.adicionar(30, 2);

        lista.imprimir();

        lista.adicionar(15, 1);
        lista.imprimir();

        lista.adicionar(5, 0);
        lista.imprimir();

        lista.adicionar(40, lista.getTamanho());
        lista.imprimir();
    }
}