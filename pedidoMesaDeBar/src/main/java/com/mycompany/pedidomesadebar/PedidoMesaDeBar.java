/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pedidomesadebar;

/**
 *
 * @author aluno
 */
public class PedidoMesaDeBar {

    public static void main(String[] args) {
        cadastrarPedido pedido1 = new cadastrarPedido("Cerveja", 1, 10, "Maltada",true);
        cadastrarPedido pedido2 = new cadastrarPedido("Vinho", 2, 70, "Seco",true);
        cadastrarPedido pedido3 = new cadastrarPedido("Porção", 1, 00, "Fritas",false);
        cadastrarPedido pedido4 = new cadastrarPedido("Água", 1, 5, "Com gás",false);
        cadastrarPedido pedido5 = new cadastrarPedido("Suco", 5, 30, "Natural",false);
        
        double total = pedido1.valor + pedido2.valor + pedido3.valor + pedido4.valor +pedido5.valor;
        System.out.println("O total dos pedidos é: " +total);
    }
    
}
