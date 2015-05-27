/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

/**
 *
 * @author nu3_lab11
 */
public class ListaVetor implements InterfaceLista {

    private int capacidade = 0 , tamanho =0;
    private NoVet lista [];

    @Override
    public void criarLista(int capacidade) {
      lista = new NoVet [capacidade];
    }

    @Override
    public NoVet[] aumentarLista() {
        NoVet aux [] = new NoVet [capacidade*2];        
        for (int i = 0 ; i < capacidade ; i++ ){
           aux[i] = lista[i];            
        }
        lista = aux;    
        capacidade *= 2 ;
        return lista;
    }

    @Override
    public boolean eVazia() {
    return tamanho == 0 ;
    }

    @Override
    public boolean eCheia() {
    return tamanho == capacidade ;
    }

    @Override
    public int tamanho() {
    return tamanho ;
    }

    @Override
    public int capacidade() {
    return capacidade;
    }

    @Override
    public boolean procurarElemento(int valor) {
        for (int i = 0 ; i < capacidade ; i++){
            if (valor == lista[i].getValor()){
                return true;
            }
           
        }
       return false; 
    }

    @Override
    public NoVet pegarElemento(int indice) {
        
             return lista[indice]; // pq nao .getvalor() ????
         
    }

    @Override
    public void addNoInicio(int valor) {
        if (!eCheia()){
            for(int i =tamanho; i >0 ; i--){
                lista[i] = lista[i-1];
            } 
            lista[0] = new NoVet(valor);
             tamanho++;
        }
        
        if(eCheia()){
         lista = aumentarLista(); 
        }
    }

    @Override
    public void addNoFim(int valor) {
     if (!eCheia()){           
            lista[tamanho] = new NoVet(valor);
            tamanho++;
        }
     
     if(eCheia()){
         lista = aumentarLista(); 
         
     }
    }

    @Override
    public void addNaPosicao(int indice, int valor) {
        if(lista[indice]== null){
            lista[indice]= new NoVet (valor);// falta correr ou seja for
            tamanho ++;
        }
        else {
            for (int i = tamanho ; i > indice ; i--){
                lista[i] = lista[i-1];
            }
             lista[indice]= new NoVet (valor);
             tamanho++;
        }
        
        if(eCheia()){
         lista = aumentarLista();}
        
    }

    @Override
    public void removerNoInicio() {
        for (int i =0 ; i < tamanho ; i++){
            lista [i]= lista [i+1];
            lista[i+1]=null;
            }
        tamanho--;
    }

    @Override
    public void removerNoFim() {
        lista [tamanho-1] = null;
        tamanho--;
     
    }

    @Override
    public void remover(int indice) {
        
        if (indice < tamanho-1){
            lista [indice] = null;
            for (int i = indice ; i < tamanho ; i--){
                lista[i] = lista[i+1];
            }
            tamanho--;
        }
        else{
            lista [indice] = null;
            tamanho--;
        }
    }

    @Override
    public void listar() {
        for (int i = 0 ; i < tamanho ; i++){
                System.out.println("valor: '" + lista[i].getValor() + "' esta na posiçao " + i + " da lista");
            }
    }
       
    
}
