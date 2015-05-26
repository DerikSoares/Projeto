/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilaCircular;

/**
 *
 * @author DerikJorge
 */
public class FilaCircular implements InterfaceCircular {
    
    private int tamanho;
    private int quantidade = 0;
    private NoVetC fila[];
    private int inicio = 0;
    private int fim = 0;

    @Override
    public void criarFila(int tamanho) {
       fila = new NoVetC[tamanho] ; 
       this.tamanho = tamanho;
    }

    @Override
    public boolean eCheia() {
        return quantidade == tamanho;
    }

    @Override
    public boolean eVazia() {
       return quantidade == 0;
    }

    @Override
    public int tamanho() {
        return quantidade ;
    }
/////////////////////////////////////////duvida//////////////////////////
    @Override
    public NoVetC enfileirar(int valor) {
        if (quantidade != tamanho){
            if (fim!=tamanho){
                NoVetC novo = new NoVetC(valor);
                fila[fim++] = novo;
                quantidade++;
                return novo;
            }
            else{
                fim = 0 ;
                NoVetC novo = new NoVetC(valor);
                fila[fim++] = novo;
                quantidade++;
                return novo;
            }       
        }
      
        System.out.println("fila cheia");
        return null;
    }    
    
    //////////////////////////////////duvida/////////////////////////////////////
    @Override
    public NoVetC desenfileirar() {
        if (!eVazia()) {
            if (inicio !=tamanho){
                NoVetC aux = fila[inicio];
                fila[inicio++] = null;
                quantidade--  ;
                return aux;           
            }
            else{
                inicio =0;
                NoVetC aux = fila[inicio];
                fila[inicio++] = null;
                quantidade--  ;
                return aux; 
            }
        }
        
        System.out.println("Fila não possui elementos");
        return null;
    
    }

    @Override
    public int pegarInicio() {
        if (inicio != 0 && fim != 0) {
            return fila[inicio].getValor();
        }
        else {
            return -1;
        }
    }

    
    ///////////////////////////////duvida/////////////////////
    
    @Override
    public void listar() {
        if (!eVazia()) {
            if(inicio < fim){
            for (int i = inicio; i < fim; i++) {
                System.out.println(fila[i].getValor());
                }
                System.out.println("----------------------------------");
            }  
            else{
                for (int i = inicio; i < quantidade; i++) {
                System.out.println(fila[i].getValor());
                }
                for (int i = 0; i < fim; i++) {
                System.out.println(fila[i].getValor());
                }
                
            }
            
        }
    }
    
  
}
 