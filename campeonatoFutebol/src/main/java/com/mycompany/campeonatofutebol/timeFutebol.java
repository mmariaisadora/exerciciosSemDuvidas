/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campeonatofutebol;

/**
 *
 * @author aluno
 */
public class timeFutebol {

    public String nomeTime;
    public jogador jogadorReferencia;
    public int vitorias;
    int derrotas;
    String tecnico;
    
    public void cadastrarTime(String nomeTime, jogador jogadorReferencia, int vitorias, int derrotas, String tecnico){
        this.nomeTime = nomeTime;
        this.jogadorReferencia = jogadorReferencia;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.tecnico = tecnico;
    }
  public void imprimirDadosTime(){
      System.out.println("Nome do time: "+nomeTime);
       System.out.println("Jogador Referencia: " +jogadorReferencia);
        System.out.println("Número de vitórias: "+vitorias);
         System.out.println("Número de derrotas: "+derrotas);
          System.out.println("Técnico do time: "+tecnico);
  }
}
