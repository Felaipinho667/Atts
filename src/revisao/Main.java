package src.revisao;

import java.util.ArrayList;
import java.util.List;
public class Main {
    
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno(1, "felipe", 17, 7, 9);
        Aluno aluno2 = new Aluno(2, "Zézin", 15, 4, 7);
        Aluno aluno3 = new Aluno();
        aluno3.id = 3;
        aluno3.nome = "JOTINHA";
        aluno3.idade = 20;
        aluno3.nota1 = 4;
        aluno3.nota2 = 5;

        
        
        List<Aluno> listaAlunos = new ArrayList<>();
        listaAlunos.add (aluno1);
        listaAlunos.add (aluno2);
        listaAlunos.add (aluno3);
        
        Turma turma = new Turma(0001, "Info3", "Informática", listaAlunos, 3);
            System.out.println("\n\n----------Lista de Turmas----------\n\n");
            System.out.println("Turma: " + turma.nome);
            System.out.println("ID: " + turma.id);
            System.out.println("Curso: " + turma.curso);
            System.out.println("Total de ALunos: " + turma.totalAlunos);
            System.out.println("\n\n----------Lista de Alunos------------\n\n");
        
    for (Aluno aluno : listaAlunos){
        
        float media = aluno.calcularMedia();
        System.out.println("\nID: " + aluno.id);
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Idade: " + aluno.idade);
        System.out.println("Nota 1: " + aluno.nota1);
        System.out.println("Nota 2: " + aluno.nota2);
        System.out.println("Média: " + media); 
        
        if (media >= 6){
            
            System.out.println("Aprovado");
        } else {
            
            System.out.println("Reprovado");
        }
    }
    

        

}
}
