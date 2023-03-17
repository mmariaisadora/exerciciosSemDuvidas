/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campeonatofutebol;

/**
 *
 * @author aluno
 */
public class jogador {
    
    private String nome;
    private String time;
    private int camisa;
    private int idade;
    private double peso;

    public void removerJogador(String nome, String time, int camisa, int idade, double peso) {
        this.nome = null;
        this.time = null;
        this.camisa = 0;
        this.idade = 0;
        this.peso = 0;
    }

    public void editarJogador(String nome, String time, int camisa, int idade, double peso) {
        this.nome = null;
        this.time = null;
        this.camisa = 0;
        this.idade = 0;
        this.peso = 0;
    }

    public void imprimirDados() {
        System.out.println("nome: " + nome);
        System.out.println("time: " + time);
        System.out.println("camisa: " + camisa);
        System.out.println("idade: " + idade);
        System.out.println("peso: " + peso);
        System.out.println("\n");
    }

  public void construtorJogador(String nome, String time, int camisa, int idade, double peso) {
        this.nome = null;
        this.time = null;
        this.camisa = 0;
        this.idade = 0;
        this.peso = 0;
    }
    public String getNome() {
        return nome;
    }
}
