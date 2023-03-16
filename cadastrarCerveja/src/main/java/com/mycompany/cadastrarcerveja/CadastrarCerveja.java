/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cadastrarcerveja;

/**
 *
 * @author aluno
 */
public class CadastrarCerveja {

    public static void main(String[] args) {
        cerveja cerveja1 = new cerveja(01,"Alemanha");
        cerveja1.setCategoria("Puro Malte");
        cerveja1.setNome("Brahma");
        cerveja1.setValor(10);
        cerveja1.setQnt(1);
        
        cerveja cerveja2 = new cerveja(02,"Alemanha");
        cerveja2.setCategoria("Duplo Malte");
        cerveja2.setNome("Petra");
        cerveja2.setValor(10);
         cerveja2.setQnt(2);
        
        cerveja cerveja3 = new cerveja(03,"Alemanha");
        cerveja3.setCategoria("Puro Malte");
        cerveja3.setNome("Skol");
        cerveja3.setValor(10);
        cerveja3.setQnt(3);
        
        cerveja cerveja4 = new cerveja(04,"Alemanha");
        cerveja4.setCategoria("Duplo Malte");
        cerveja4.setNome("spaten");
        cerveja4.setValor(10);
        cerveja4.setQnt(4);
        
        cerveja cerveja5 = new cerveja(05,"Alemanha");
        cerveja5.setCategoria("Duplo Malte");
        cerveja5.setNome("Skin");
        cerveja5.setValor(10);
        cerveja5.setQnt(5);
        
        System.out.println("Cerveja cadastrada 1 Código da cerveja 1 " + cerveja1.getCodigo());
        System.out.println("Cerveja cadastrada 2 Código da cerveja 2 " + cerveja2.getCodigo());
        System.out.println("Cerveja cadastrada 3 Código da cerveja 3 " + cerveja3.getCodigo());
        System.out.println("Cerveja cadastrada 4 Código da cerveja 4 " + cerveja4.getCodigo());
        System.out.println("Cerveja cadastrada 5 Código da cerveja 5 " + cerveja5.getCodigo());

    }
}