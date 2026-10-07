package src;

import java.util.Scanner;

public class Recursao {

    
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static int potencia(int base, int expoente) {
        
        if (expoente == 0) {
            return 1;
        }

        return base * potencia(base, expoente - 1);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("=== FIBONACCI ===");
        System.out.print("Quantos termos deseja ver? ");
        int quantidade = entrada.nextInt();

        System.out.print("Sequência: ");
        for (int i = 0; i < quantidade; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println("\n");

        System.out.println("=== POTÊNCIA ===");
        System.out.print("Digite a base: ");
        int base = entrada.nextInt();

        System.out.print("Digite o expoente (maior ou igual a 0): ");
        int expoente = entrada.nextInt();

        if (expoente < 0) {
            System.out.println("Expoente inválido! Use um número maior ou igual a 0.");
        } else {
            System.out.println(base + " elevado a " + expoente + " = " + potencia(base, expoente));
        }

        entrada.close();
    }
}