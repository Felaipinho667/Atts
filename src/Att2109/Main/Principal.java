package Att2109.Main;

import Att2109.Basica.Processo;
import Att2109.Estrutura.Fila;

public class Principal {

    public static void main(String[] args) {

        Fila fila = new Fila();

        Processo p1 = new Processo(1, "Documento A");
        Processo p2 = new Processo(2, "Documento B");
        Processo p3 = new Processo(3, "Documento C");

        // Adicionando processos
        fila.adicionar(p1);
        fila.adicionar(p2);
        fila.adicionar(p3);

        // Mostrar fila
        fila.mostrar();

        // Verificar primeiro
        fila.verificar();

        // Remover
        fila.remover();

        // Mostrar novamente
        fila.mostrar();

        // Inverter
        fila.inverter();

        // Mostrar fila invertida
        fila.mostrar();
    }
}
