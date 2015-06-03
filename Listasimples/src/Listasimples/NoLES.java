/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listasimples;

/**
 *
 * @author DerikJorge
 */
public class NoLES { // No Lista Encadada Simples
    
    private int valor;
    private NoLES proximo;

    public NoLES() {
    }
    
    

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NoLES getProximo() {
        return proximo;
    }

    public void setProximo(NoLES proximo) {
        this.proximo = proximo;
    }
    
    
}
