package Projeto0510;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static Contato lerContato() {
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Telefone: ");
        String telefone = sc.nextLine();
        return new Contato(nome, telefone);
    }

    static int lerNumero(String texto) {
        System.out.print(texto);
        return Integer.parseInt(sc.nextLine());
    }

    public static void main(String[] args) {
        ListaDupla agenda = new ListaDupla();
        int op = -1;

        while (op != 0) {
            System.out.println("\n--- AGENDA TELEFONICA ---");
            System.out.println("1 - Inserir no inicio");
            System.out.println("2 - Inserir no fim");
            System.out.println("3 - Inserir em uma posicao");
            System.out.println("4 - Remover do inicio");
            System.out.println("5 - Remover do fim");
            System.out.println("6 - Remover de uma posicao");
            System.out.println("7 - Verificar posicao");
            System.out.println("8 - Listar");
            System.out.println("9 - Pesquisar");
            System.out.println("0 - Sair");
            op = lerNumero("Opcao: ");

            switch (op) {
                case 1:
                    agenda.inserirInicio(lerContato());
                    break;
                case 2:
                    agenda.inserirFim(lerContato());
                    break;
                case 3:
                    int p = lerNumero("Posicao: ");
                    agenda.inserirPosicao(p, lerContato());
                    break;
                case 4:
                    agenda.removerInicio();
                    break;
                case 5:
                    agenda.removerFim();
                    break;
                case 6:
                    agenda.removerPosicao(lerNumero("Posicao: "));
                    break;
                case 7:
                    agenda.verificarPosicao(lerNumero("Posicao: "));
                    break;
                case 8:
                    agenda.listar();
                    break;
                case 9:
                    System.out.print("Nome: ");
                    agenda.pesquisar(sc.nextLine());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }
}

