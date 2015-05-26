/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilaEncadeaD;

/**
 *
 * @author DerikJorge
 */
public class NoEnD {

    
    private NoEnD anterior;
        private int valor; // int pois recebe um valor 
    private NoEnD proximo; // pois ele vai apontar para outr valor

    public NoEnD() {
        
    }

   

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NoEnD getProximo() {
        return proximo;
    }

    public void setProximo(NoEnD proximo) {
        this.proximo = proximo;
    }

    public NoEnD getAnterior() {
        return anterior;
    }

    public void setAnterior(NoEnD anterior) {
        this.anterior = anterior;
    }
    
    
    
    
}
    

