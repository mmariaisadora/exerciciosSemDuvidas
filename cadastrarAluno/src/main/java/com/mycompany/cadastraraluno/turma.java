/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastraraluno;

/**
 *
 * @author aluno
 */
public class turma {
    
     String profs;
     String coordenador;
     int qtdAluno;
     int periodo;
     aluno aluno;
     
     public turma(aluno aAluno) {
        aluno = aAluno;
    }
     
     public void getAluno(){
         System.out.println(aluno.getNome());
     }
}
