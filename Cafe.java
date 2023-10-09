/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufu.poo.aula;

/**
 *
 * @author fabiola
 */
public class Cafe extends BebidaTemplate {

    @Override
    void preparaBebida() {
        System.out.println("adicionando o po do cafe");
    }

    @Override
    void adicionaCondimentos() {
        System.out.println("adicionando acucar");
    }
    
    
}
