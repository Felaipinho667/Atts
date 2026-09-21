package Att2109.Projeto2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Queue<Processo> fila = new LinkedList<>();

        Processo p1 = new Processo(1, "Documento A");
        Processo p2 = new Processo(2, "Documento B");
        Processo p3 = new Processo(3, "Documento C");

        // Adicionar
        fila.add(p1);
        fila.add(p2);
        fila.add(p3);

        System.out.println("Fila:");

        for (Processo p : fila) {
            p.mostrar();
        }

        // Verificar primeiro
        System.out.println("\nPrimeiro processo:");
        fila.peek().mostrar();

        // Remover
        System.out.println("\nRemovendo:");
        fila.poll().mostrar();

        // Mostrar fila
        System.out.println("\nFila depois da remocao:");

        for (Processo p : fila) {
            p.mostrar();
        }

        // Inverter usando pilha
        Stack<Processo> pilha = new Stack<>();

        while (!fila.isEmpty()) {
            pilha.push(fila.poll());
        }

        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }

        // Mostrar fila invertida
        System.out.println("\nFila invertida:");

        for (Processo p : fila) {
            p.mostrar();
        }
    }
}
