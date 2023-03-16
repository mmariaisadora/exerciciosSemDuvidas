/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedidomesadebar;

/**
 *
 * @author aluno
 */
public class cadastrarPedido {
    
    String produto;
    int quantidade;
    double valor;
    String categoria;
    boolean alcool;


    public cadastrarPedido(String aProduto, int aQuantidade,double aValor, String aCategoria, boolean aAlcool) {
        produto = aProduto;
        quantidade = aQuantidade;
        valor = aValor;
        categoria = aCategoria;
        alcool = aAlcool;
    }
    
    
}
