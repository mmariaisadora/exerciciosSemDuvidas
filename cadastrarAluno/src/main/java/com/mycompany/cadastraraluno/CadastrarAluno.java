/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cadastraraluno;

/**
 *
 * @author aluno
 */
public class CadastrarAluno {

    public static void main(String[] args) {
        
        aluno aluno1 = new aluno("Maria Isadora","m.chagas@edu.unipar.br");
        aluno1.setIdade(22);
        aluno1.setSexoMasc(false);
        aluno1.setNota(7.9);
        
        aluno aluno2 = new aluno("Matheus Soares","m.soares@edu.unipar.br");
        aluno1.setIdade(22);
        aluno1.setSexoMasc(true);
        aluno1.setNota(9);
        
        aluno aluno3 = new aluno("Vinicius Ortis","v.ortis@edu.unipar.br");
        aluno1.setIdade(18);
        aluno1.setSexoMasc(true);
        aluno1.setNota(7.9);
        
        turma turma1 = new turma(aluno2);
        turma1.getAluno();
        
         if(aluno1.getNome() != " ")
            System.out.println("O aluno está cadastrado.");
        
        turma turma2 = new turma(aluno1);
        turma2.getAluno();
        
         if(aluno1.getNome() != " ")
            System.out.println("O aluno está cadastrado.");
    
    }
}


