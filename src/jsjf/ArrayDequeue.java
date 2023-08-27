/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsjf;

/**
 * Implementación ArrayDequeue en base a una lista desordenada.
 * @author Zuriel García García.
 * @param <T> datos a utilizar.
 * 
 */
public class ArrayDequeue<T> {
    /**
     * Atributo privado de lista desordenada, con el que se implementa la clase.
     */
    private ArrayUnorderedList<T> lista;
    private int back;
    //Atributo back se refiere al final de la cola.
    private int front;
    //Atributo front se refiere al principio de la cola.
    
    public ArrayDequeue(){
        back=lista.nextLast;
        front=0;
    }
    /**
     * Método que añade al principio de la cola un elemento dado.
     * @param element a añadir.
     */
    public void addFirst(T element){
        lista.addFirst(element);
    }
    /**
     * Método que añade al final de la cola un elemento.
     * @param element a añadir.
     */
    public void addLast(T element){
        lista.add(element);
        back++;
    }
    /**
     * Mètodo que remueve el elemento al inicio de la cola.
     * @return elemento T.
     */
    public T removeFirst(){
        T res;
        res=lista.remove(front);
        front++;
        return res;
    }
    /**
     * Mètodo que remueve el elemento al final de la cola.
     * @return elemento T.
     */
    public T removeLast(){
        T res;
        res=lista.remove(back);
        back--;
        return res;
    }
    /**
     * Mètodo que regresa el primer elemento de la cola.
     * @return elemento T.
     */
    public T first(){
        return lista.get(back);
    }
    /**
     * Mètodo que regresa el último elemento de la cola.
     * @return elemento T.
     */
    public T last(){
        return lista.get(front);
    }
    /**
     * Método que regresa si la cola está vacía.
     * @return valor boolean.
     */
    public boolean isEmpty(){
        return lista.size()==0;
    }
    /**
     * Método que resetea la cola.
     */
    public void clear(){
        lista.clear();
    }
}
