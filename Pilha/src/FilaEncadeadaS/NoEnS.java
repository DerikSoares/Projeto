/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilaEncadeadaS;

/**
 *
 * @author DerikJorge
 */
public class NoEnS {
      private int valor; // int pois recebe um valor 
    private NoEnS proximo; // pois ele vai apontar para outr valor

    public NoEnS() {
        
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NoEnS getProximo() {
        return proximo;
    }

    public void setProximo(NoEnS proximo) {
        this.proximo = proximo;
    }
    
    
    
    
}
