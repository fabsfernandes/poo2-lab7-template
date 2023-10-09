/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufu.poo.aula;

/**
 *
 * @author fabiola
 */
public abstract class BebidaTemplate {
    
    public void aqueceAgua(){
        System.out.println("aquecendo agua");
    }
    
    
    public void colocaXicara(){
        System.out.println("colocando na xicara");
    }
    
    abstract void preparaBebida();
    
    abstract void adicionaCondimentos();
    
    public void preparaPedido(){
        aqueceAgua();
        preparaBebida();
        colocaXicara();
        adicionaCondimentos();
    }
    
}
