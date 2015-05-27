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
public interface InterfaceLista {
    void criarLista(int capaidade); //cria lista com tamanho    
    NoVet[] aumentarLista(); //dobra o tamanho da lista atual
    boolean eVazia();  //verifica se a lista possui elementos   
    boolean eCheia(); //verfica se a lista está cheia
    int tamanho();  //retorna o número de itens da lista   '
    int capacidade();  //retorna a capacidade de itens possiveis na lista   
    boolean procurarElemento(int valor); //verifica se o elemento está na lista
    NoVet pegarElemento(int indice);  //retorna um determinado nó  de um determinado indice    
    void addNoInicio(int valor);  //insere um novo nó no inicio da lista    
    void addNoFim(int valor);  //insere um novo nó no fim da lista
    void addNaPosicao(int indice, int valor);  //insere um novo nó em uma posição desejada, caso ela esteja disponivel   
    void removerNoInicio();  //remove um novo nó do inicio da lista 
    void removerNoFim();  //remove um novo nó do fim da lista  
    void remover(int indice);  //remove o nó de uma posição desejada    
    void listar();  //retorna os valores da lista
}
