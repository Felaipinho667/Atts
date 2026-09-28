package Att2809;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaInvertida {

    // Inverte a fila usando uma pilha auxiliar:
    // desenfileira tudo empilhando (o primeiro fica no fundo)
    // e depois desempilha enfileirando (o último vira o primeiro).
    public static <T> void inverter(Queue<T> fila) {
        Deque<T> pilha = new ArrayDeque<>();

        while (!fila.isEmpty()) {
            pilha.push(fila.poll());
        }
        while (!pilha.isEmpty()) {
            fila.offer(pilha.pop());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite caracteres ou números separados por espaço:");
        String linha = sc.nextLine().trim();

        // A fila guarda Strings, então aceita letras, símbolos e números
        Queue<String> fila = new LinkedList<>();
        if (!linha.isEmpty()) {
            for (String item : linha.split("\\s+")) {
                fila.offer(item);
            }
        }

        System.out.println("Fila original: " + fila);

        inverter(fila);

        System.out.println("Fila invertida: " + fila);
        sc.close();
    }
}