/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrarbicicletas;

/**
 *
 * @author aluno
 */
public class bicicleta {
    public String cor;
    public String modelo;
    public int tamanho;
    private double valor;
    private double custo;
    private String fornecedor;
    private int estoque;
    
    public void aValor(double valor){
    this.valor = valor;
}
public void aEstoque(int estoque){
    this.estoque = estoque;
}

public void construtorBicicleta(String aCor, String aModelo, int aTamanho, double aCusto, String aFornecedor){
    cor = aCor;
    modelo = aModelo;
    tamanho = aTamanho;
    custo = aCusto;
    fornecedor = aFornecedor;
    
}
 public void mostrarDados() {
        System.out.println("cor: " + cor);
        System.out.println("modelo: " + modelo);
        System.out.println("tamanho: " + tamanho);
        System.out.println("valor: " + valor);
        System.out.println("custo: " + custo);
        System.out.println("fornecedor: " + fornecedor);
        System.out.println("estoque: " + estoque);
    }
}

