/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastraraluno;

/**
 *
 * @author aluno
 */
public class aluno {

    private String nome;
    private String email;
    private int idade;
    private boolean sexo;
    private double nota;

    public aluno(String aNome, String aEmail) { /**criando construtor */
        nome = aNome;
        email = aEmail;
    }

    public String getNome() {
        return "Nome do aluno: " + nome;
    }

    public String getEmail() {
        return "E-mail: " + email;
    }

    public void setIdade(int aIdade) {
        idade = aIdade;
    }

    public void setSexoMasc(boolean asexo) {
        this.sexo = asexo;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}
