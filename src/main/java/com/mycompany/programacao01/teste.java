/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacao01;

/**
 *
 * @author aluno
 */
public class teste {
    public static void main(String[] args) {
        Estudantes camada = new Estudantes();
        Estudantes leonardo = new Estudantes();
        Estudantes Jefferson = new Estudantes();
        
        camada.setNome("marcos");
        leonardo.setNome("Leonardo");
        Jefferson.setNome("Jefferson");
        
        System.out.println(camada.getNome());
        System.out.println(leonardo.getNome());
        System.out.println(Jefferson.getNome());
    }
}
