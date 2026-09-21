package Att2109.Estrutura; 

import java.util.Stack;

import Att2109.Basica.Processo;

public class Fila {

    private Processo[] fila;
    private int inicio;
    private int fim;

    public Fila() {
        fila = new Processo[10];
        inicio = 0;
        fim = 0;
    }

    // Adicionar processo
    public void adicionar(Processo processo) {
        if (fim < fila.length) {
            fila[fim] = processo;
            fim++;
            System.out.println("Processo adicionado.");
        } else {
            System.out.println("Fila cheia.");
        }
    }

    // Remover processo
    public void remover() {
        if (inicio < fim) {
            System.out.println("Processo removido:");
            fila[inicio].mostrar();
            inicio++;
        } else {
            System.out.println("Fila vazia.");
        }
    }

    // Verificar primeiro processo
    public void verificar() {
        if (inicio < fim) {
            System.out.println("Primeiro processo da fila:");
            fila[inicio].mostrar();
        } else {
            System.out.println("Fila vazia.");
        }
    }

    // Mostrar todos os processos
    public void mostrar() {
        if (inicio == fim) {
            System.out.println("Fila vazia.");
            return;
        }

        System.out.println("\nProcessos na fila:");

        for (int i = inicio; i < fim; i++) {
            fila[i].mostrar();
        }
    }

    // Inverter a fila usando uma pilha
    public void inverter() {

        Stack<Processo> pilha = new Stack<>();

        // Coloca os processos na pilha
        for (int i = inicio; i < fim; i++) {
            pilha.push(fila[i]);
        }

        // Retira da pilha e coloca de volta na fila
        int quantidade = fim - inicio;

        for (int i = 0; i < quantidade; i++) {
            fila[inicio + i] = pilha.pop();
        }

        System.out.println("Fila invertida.");
    }
}