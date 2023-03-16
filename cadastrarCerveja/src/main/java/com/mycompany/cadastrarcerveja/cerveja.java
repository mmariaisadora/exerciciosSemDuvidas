/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrarcerveja;

/**
 *
 * @author aluno
 */
public class cerveja {
    
    public String nome;
    public double valor;
    public int qnt;
    public String categoria;
    private String origem;
    private int codigo;

    public cerveja(int aCodigo, String aOrigem) {
        codigo = aCodigo;
        origem = aOrigem;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public String getOrigem() {
        return origem;
    }
    
    public void setCategoria(String aCategoria) {
        categoria = aCategoria;
    }

    public void setQnt(int aQnt) {
        qnt = aQnt;
    }

    public void setValor(double aValor) {
        valor = aValor;
    }
    

    public void setNome(String aNome) {
        nome = aNome;
    }    
    
}