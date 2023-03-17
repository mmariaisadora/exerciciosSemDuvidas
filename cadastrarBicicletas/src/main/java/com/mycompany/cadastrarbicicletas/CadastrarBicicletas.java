/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cadastrarbicicletas;

/**
 *
 * @author aluno
 */
public class CadastrarBicicletas {

    public static void main(String[] args) {
    bicicleta bicicleta1 = new bicicleta();
    bicicleta bicicleta2 = new bicicleta();
    bicicleta bicicleta3 = new bicicleta();
    bicicleta bicicleta4 = new bicicleta();
    
    bicicleta1.aEstoque(7);
    bicicleta1.aValor(1000);
    bicicleta1.construtorBicicleta("Preta", "Dobrável", 10, 400, "Caloi");
    
    bicicleta2.aEstoque(2);
    bicicleta2.aValor(550);
    bicicleta2.construtorBicicleta("Laranjada", "Speed", 15, 200, "Pasto");
    
    bicicleta3.aEstoque(100);
    bicicleta3.aValor(3000);
    bicicleta3.construtorBicicleta("Prata", "Elétrica", 50, 1000, "Caloi");
    
    bicicleta4.aEstoque(15);
    bicicleta4.aValor(870);
    bicicleta4.construtorBicicleta("Rosa", "Infantil", 5, 400, "Caloi");
    
    
    bicicleta1.mostrarDados();
    bicicleta2.mostrarDados();
    bicicleta3.mostrarDados();
    bicicleta4.mostrarDados();
    
    }
}
