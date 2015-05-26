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
public interface NewInterface {
    
  void criarFila(int tamanho); //cria fila com tamanho    
    boolean eCheia();  //verifica se a fila estar cheia     
    boolean eVazia();  //verifica se a fila possui elementos     
    int tamanho();  //retorna o número de itens da fila      
    NoEnD addInicio(int valor);  //insere um valor no início  da fila     
    NoEnD addFim(int valor);  //insere um valor no fim da fila     
    NoEnD removeInicio();  //retira o nó do início da fila     
    NoEnD removeFim();  //retira o nó do fim da fila  
    int pegarInicio();  //retorna o valor atual do início da fila     
    void listar();  //retorna os valores da fila  
    
}
