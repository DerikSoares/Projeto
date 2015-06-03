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
public interface InterfaceListaS {
    
    void criarLista(); //cria lista com tamanho     
    boolean eVazia();  //verifica se a lista possui elementos     
    int tamanho();  //retorna o número de itens da lista      
    NoLES buscarElemento(int valor);  //procura e retorna por um determinado nó     
    NoLES addInicio(int valor);  //insere um valor no início da lista     
    NoLES addFim(int valor);  //insere um valor no fim da lista    
    NoLES addDepois(int valor, int novoValor);  //insere um novo nó depois de um valor já existente na lista     
    NoLES addAntes(int valor, int novoValor);  //retira o nó do fim da lista   
    NoLES removeInicio(int valor);  //insere um valor no início da lista     
    NoLES removeFim(int valor);  //insere um valor no fim da lista    
    NoLES removeDepois(int valor);  //insere um novo nó depois de um valor já existente na lista     
    NoLES removeAntes(int valor);  //retira o nó do fim da lista     
    void listar();  //retorna os valores da lista
    
}
