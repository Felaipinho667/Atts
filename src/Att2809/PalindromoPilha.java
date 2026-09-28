package Att2809;

import java.text.Normalizer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PalindromoPilha {

    // Remove acentos, espaços e pontuação, e converte para minúsculas.
    // Assim "A sogra má e amargosa" e "Socorram-me, subi no ônibus em Marrocos"
    // também são reconhecidas como palíndromos.
    private static String normalizar(String texto) {
        String semAcento = Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");
        return semAcento.toLowerCase().replaceAll("[^a-z0-9]", "");
    }

    public static boolean ehPalindromo(String texto) {
        String limpo = normalizar(texto);
        Deque<Character> pilha = new ArrayDeque<>();

        // Empilha todos os caracteres
        for (char c : limpo.toCharArray()) {
            pilha.push(c);
        }

        // Ao desempilhar, os caracteres saem em ordem inversa.
        // Comparamos com a string original, da esquerda para a direita.
        for (char c : limpo.toCharArray()) {
            if (c != pilha.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String entrada = sc.nextLine();

        if (ehPalindromo(entrada)) {
            System.out.println("\"" + entrada + "\" É um palíndromo.");
        } else {
            System.out.println("\"" + entrada + "\" NÃO é um palíndromo.");
        }
        sc.close();
    }
}