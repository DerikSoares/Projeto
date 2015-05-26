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
public class FilaEncadeadaD implements NewInterface {
   private NoEnD fim;
   private NoEnD inicio;
   private int tamanho = 0 , tamanhof= 0; 

    @Override
    public void criarFila(int tamanho) {
        inicio = new NoEnD ();
        fim = inicio;
        this.tamanho = tamanho;
    }

    @Override
    public boolean eCheia() {
     return tamanhof == tamanho; 
             }

    @Override
    public boolean eVazia() {
       return tamanhof ==0; 
    }

    @Override
    public int tamanho() {
       return tamanhof;
    }

    @Override
    public NoEnD addInicio(int valor) {
        NoEnD novoNo = new NoEnD();
        novoNo.setValor(valor);
        novoNo.setProximo(inicio.getProximo());
        novoNo.setAnterior(inicio);
        inicio.setProximo(novoNo);
        tamanhof++;
        return novoNo;
    }

    @Override
    public NoEnD addFim(int valor) {
        
        NoEnD novoNo = new NoEnD();
        novoNo.setValor(valor);
        novoNo.setAnterior(fim);
        fim.setProximo(novoNo);
        novoNo.setProximo(null);
        fim = novoNo;        
        tamanhof++;
        return novoNo;
    }

    @Override
    public NoEnD removeInicio() {
       NoEnD saiu =  inicio.getProximo() ;
       if (tamanhof != 0){
           inicio.setProximo(saiu.getProximo()) ; 
           saiu.setAnterior(null);
           saiu.setProximo(null);
           tamanhof --;  
       }
       else {
           System.out.println("fila vazia");
       }    
       return saiu;
            }  
   
// professor fiquei com algumas duvidas nessa parte
    
    @Override
    public NoEnD removeFim() {
    NoEnD aux = fim;
    NoEnD saiu =  fim.getAnterior();
       if (tamanhof != 0){
           saiu.setProximo(null);
           fim.setAnterior(null);
           fim = saiu;
           saiu = aux;     
           tamanhof --;  
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
            NoEnD aux = inicio.getProximo();
            while(aux != null){
                System.out.println(aux.getValor());
                aux = aux.getProximo();
            }
        }
    }

   
   
}
