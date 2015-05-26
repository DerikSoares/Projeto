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
public class FilaEncadeadaS implements InterfaceFilaS {
     private NoEnS fim = null;
   private NoEnS inicio = null ;
   private int tamanho = 0; 

    @Override
    public void criarFila() {
       inicio = new NoEnS ();
       fim = inicio;
       
    }

    @Override
    public boolean eVazia() {
        return tamanho == 0; 
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public NoEnS enfileirar(int valor) {
     
        NoEnS novoNo = new NoEnS();
        novoNo.setValor(valor);
        novoNo.setProximo(null);
        fim.setProximo(novoNo);
        fim = novoNo;
        tamanho ++;
        return novoNo;
    }

    @Override
    public NoEnS desenfileirar() {
        NoEnS saiu =  inicio.getProximo() ;
       if (tamanho != 0){
           inicio.setProximo(saiu.getProximo()) ; 
           saiu.setProximo(null);
           tamanho --;  
       }
       else {
           System.out.println("fila vazia");
       }    
       return saiu;
            }

    @Override
    public int pegarInicio() {
        return inicio.getProximo().getValor();
    }

    @Override
    public void listar() {
        if (eVazia()){
            System.out.println("fila esta vazia no momento");
        }
        
        else{
            NoEnS aux = inicio.getProximo();
            while(aux != null){
                System.out.println(aux.getValor());
                aux = aux.getProximo();
            }
        }
    
    }

   
}
