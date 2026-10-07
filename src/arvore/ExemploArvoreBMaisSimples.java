public class ExemploArvoreBMaisSimples {

    static class Folha {
        int[] chaves;
        Folha proxima;

        Folha(int... chaves) {
            this.chaves = chaves;
        }
    }

    static int[] raiz = {20, 40};
    static Folha f1 = new Folha(10, 15);
    static Folha f2 = new Folha(20, 25, 30);
    static Folha f3 = new Folha(40, 50);

    static Folha encontrarFolha(int chave) {
        if (chave < raiz[0]) return f1;
        if (chave < raiz[1]) return f2;
        return f3;
    }

    static boolean buscar(int chave) {
        for (int valor : encontrarFolha(chave).chaves) {
            if (valor == chave) return true;
        }
        return false;
    }

    static void intervalo(int inicio, int fim) {
        Folha folha = encontrarFolha(inicio);

        while (folha != null) {
            for (int valor : folha.chaves) {
                if (valor > fim) return;
                if (valor >= inicio) System.out.print(valor + " ");
            }
            folha = folha.proxima;
        }
    }

    public static void main(String[] args) {
        f1.proxima = f2;
        f2.proxima = f3;

        System.out.println("Raiz: [20 | 40]");
        System.out.println("Folhas: [10 15] -> [20 25 30] -> [40 50]");
        System.out.println("Busca por 25: " + buscar(25));
        System.out.print("Intervalo de 15 a 40: ");
        intervalo(15, 40);
    }
}
