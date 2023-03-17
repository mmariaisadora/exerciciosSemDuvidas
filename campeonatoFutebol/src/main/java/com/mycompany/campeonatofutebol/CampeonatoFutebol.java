/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.campeonatofutebol;

/**
 *
 * @author aluno
 */
public class CampeonatoFutebol extends jogador{

    public static void main(String[] args) {
        jogador jogador1 = new jogador();
        jogador jogador2 = new jogador();
        jogador jogador3 = new jogador();
        jogador jogador4 = new jogador();
        jogador jogador5 = new jogador();
        
        jogador1.construtorJogador("Marcos", "Corinthians", 17, 25, 70);
        jogador2.construtorJogador("Neymar", "Santos", 10, 27, 70);
        jogador3.construtorJogador("Mario", "Flamengo", 9, 19, 66);
        jogador4.construtorJogador("Robert", "Coritiba", 30, 30, 80);
        jogador5.construtorJogador("Alfredo", "Inter", 33, 1, 82);
    
        timeFutebol corinthians = new timeFutebol();
        timeFutebol santos = new timeFutebol();
        
        corinthians.cadastrarTime("Corinthians", jogador1, 5, 5, "Tite");
        santos.cadastrarTime("Flamengo", jogador3, 9, 1, "Miro");
    
        System.out.println("Jogo de hoje é " + corinthians.nomeTime + " vs " + santos.nomeTime);
        corinthians.imprimirDadosTime();
        santos.imprimirDadosTime();
    }
}
