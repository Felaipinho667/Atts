
package duplaEncadeada;

public class Main {

    public static void main(String[] args) {

        ListaDuplamenteEncadeada numeros = new ListaDuplamenteEncadeada();

        System.out.println("Adicionando valores no final:");
        numeros.adicionarFim(10);
        numeros.adicionarFim(20);
        numeros.adicionarFim(30);
        numeros.adicionarFim(40);
        numeros.adicionarFim(50);
        numeros.mostrarLista();

        System.out.println("\nAdicionando 5 no início:");
        numeros.adicionarInicio(5);
        numeros.mostrarLista();

        System.out.println("\nAdicionando 25 na posição 3:");
        numeros.adicionarNaPosicao(25, 3);
        numeros.mostrarLista();

        System.out.println("\nRemovendo o primeiro:");
        numeros.excluirInicio();
        numeros.mostrarLista();

        System.out.println("\nRemovendo o último:");
        numeros.excluirFim();
        numeros.mostrarLista();

        System.out.println("\nRemovendo a posição 2:");
        numeros.excluirPosicao(2);
        numeros.mostrarLista();
    }
}