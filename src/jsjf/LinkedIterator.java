/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsjf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Zuriel
 * @param <T> datos a utilizar.
 */
public class LinkedIterator<T> implements Iterator<T>{

    private DoubleNode<T> current;//posición actual del iterador.
    private int count;  //elementos en la colección.
    /**
     * Constructor ArrayIterator. El índice current se inicializa en 0.
     * @param current nodo actual.
     * @param size tamaño.
     */
    public LinkedIterator(DoubleNode<T> current, int size){
        this.current=current;
        count = size;
    }
    /**
     * Método que regresa un boolean si existe un elemento siguiente.
     * @return valor boolean.
     */
    @Override
    public boolean hasNext() {
        return count>0;
    }
    /**
     * Método next regresa el siguiente elemento marcado por el índice current.
     * @return el siguiente elemento.
     * @throws NoSuchElementException al no haber siguiente elemento. 
     */
    @Override
    public T next() throws NoSuchElementException{
        if(!hasNext())
            throw new NoSuchElementException();
        T element=current.getElement();
        count--;
        current=current.getSiguiente();
        return element;
    }
    /**
     * Función que elimina el elemento en el índice current.
     * @throws UnsupportedOperationException si no siguiente elemento.
     */
    @Override
    public void remove() throws UnsupportedOperationException{
            throw new UnsupportedOperationException();
    }
    
}
