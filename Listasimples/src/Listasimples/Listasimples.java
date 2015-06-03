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
public class Listasimples implements InterfaceListaS {

    private int tamanho=0 ;
    private NoLES inicio =null;
    private NoLES fim = null;
            
    
    @Override
    public void criarLista() {
    inicio = new NoLES();
    fim = inicio;
    }

    @Override
    public boolean eVazia() {
    return tamanho ==0;
    }

    @Override
    public int tamanho() {
     return tamanho;
    }

    @Override
    public NoLES buscarElemento(int valor) {
        NoLES elemento = inicio.getProximo();
        for (int i =0 ; i < tamanho ; i++){
            if (valor == elemento.getValor()){
                return elemento;
            }
            else {
                elemento = elemento.getProximo();
            }        
        }
        return null;
    }

    @Override
    public NoLES addInicio(int valor) {
        NoLES novo = new NoLES();
        novo.setValor(valor);
        if (tamanho !=0 ){
            novo.setProximo(inicio.getProximo());
            inicio.setProximo(novo);
            
            tamanho++;
        }
        else{
            System.out.println("lista vazio");
        }
        
        return novo;
              
    }

    @Override
    public NoLES addFim(int valor) {
        NoLES novo = new NoLES();
        novo.setValor(valor);
        
            fim.setProximo(novo); 
            fim = novo;
            tamanho++;
       
        
        return fim;
    }

    @Override
    public NoLES addDepois(int valor, int novoValor) {
            
        NoLES aux2 = inicio.getProximo();
        NoLES aux3 = new NoLES();        
            while(aux2!=null){
                if(aux2.getValor()==valor){
                    if(aux2!=fim){
                        aux3.setValor(novoValor);
                        aux3.setProximo(aux2.getProximo()); 
                        aux2.setProximo(aux3);   
                    }
                    else {
                        aux3.setValor(novoValor);
                        aux3.setProximo(aux2.getProximo()); 
                        aux2.setProximo(aux3);  
                        fim = aux3;
                    }  
                   tamanho++; /// duvida , assim funciona
                   return aux3;               
                   
                }
              
                aux2 = aux2.getProximo();
            }
        return null;
    }

    
    @Override
    public NoLES removeInicio(int valor) {
       
        NoLES aux= inicio.getProximo();
        if (!eVazia() ){
            inicio.setProximo(aux.getProximo());
            aux.setProximo(null);
           
            tamanho++;
        }
        else{
            System.out.println("lista vazio");
        }
        
        return aux;
    }

    @Override
    public NoLES removeFim(int valor) {
        NoLES aux1 = inicio.getProximo();
        NoLES aux2 = inicio;
        
        if (!eVazia()){
            while(aux1!=null){
                aux1 = aux1.getProximo();
                aux2 = aux2.getProximo();  
            }

            aux2.setProximo(null); 
            fim = aux2;
            tamanho --;
            return aux1;
        }
        
        System.out.println("lista vazia");       
        return null;
    }

    @Override
    public NoLES removeDepois(int valor) {/// duvidas
        
        NoLES aux2 = inicio.getProximo();
        NoLES aux3 = new NoLES();
        
            while(aux2!=null){
                
                if (aux2.getValor()==valor){
                    aux3 = aux2.getProximo();
                    
                        if(aux3 == fim){
                            aux2.setProximo(aux3.getProximo());
                            fim = aux2;
                            aux3.setProximo(null);
                        }
                        else{
                            aux2.setProximo(aux3.getProximo());
                            aux3.setProximo(null);
                        }
                    
                    tamanho--;
                    return aux3;
                }
              
                aux2 = aux2.getProximo();
            }
        return null;
    }

     @Override
    public void listar() {
        NoLES imprimir = inicio.getProximo();
        int i=1;
        while(imprimir!=null){
            System.out.println("valor da poisçao " + i + " é: " + imprimir.getValor() );
            imprimir= imprimir.getProximo();
            i++;
        }
                
    }
    
    @Override
    public NoLES removeAntes(int valor) {// nao existe
        
          return null;
    }

    @Override
    public NoLES addAntes(int valor, int novoValor) {// nao existe
     return null;
             }

   

    
}
/*public NoLES removeDepois(int valor) {
        
        NoLES aux2 = inicio.getProximo();
        NoLES aux3 = new NoLES();
        
            while(aux2!=null){
                
                if (aux2.getValor()==valor){
                    aux3 = aux2.getProximo();
                    
                        if(aux3 == fim){
                            aux2.setProximo(aux3.getProximo());
                            fim = aux2;
                            aux3.setProximo(null);
                        }
                        else{
                            aux2.setProximo(aux3.getProximo());
                            aux3.setProximo(null);
                        }
                    
                    tamanho--;
                    return aux3;
                }
              
                aux2 = aux2.getProximo();
            }
        return null;
    }*/