/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsjf;

import jsjf.exceptions.EmptyCollectionException;

/**
 * Estructura Last in first out implementada con arreglos.
 * Hereda de la clase AbstractArrayLinearCollection.
 * Implementa la interfaz StackADT.
 * @author zgarciag
 * @param <T> tipo de datos utilizado.
 */
public class ArrayLIFO<T> extends AbstractArrayLinearCollection<T> implements StackADT<T> {
    /**
     * Constructor que llama al constructor de la super clase.
     */
    public ArrayLIFO(){
        super();
    }
    /**
     * Método que regresa el objeto que está en el tope de la pila.
     * @return el elemento que se encuentra en el índice nextLast-1;
     * @throws EmptyCollectionException si la colección está vacía.
     */
    @Override
    public T peek()throws EmptyCollectionException{
        if(isEmpty())
            throw new EmptyCollectionException("Array");
        return array[nextLast-1];
    }
    /**
     * Regresa el elemento en el índice nextLast-1;
     * @return elemento tipo T.
     * @throws EmptyCollectionException si la colección está vacía.
     */
    @Override
    public T pop() throws EmptyCollectionException{
        if(isEmpty())
            throw new EmptyCollectionException("Array");
        nextLast--;
        T result=array[nextLast];
        array[nextLast]=null;
        return result;
    }
    /**
     * Método que regresa si está llena la estructura.
     * @return valor boolean.
     */
    @Override
        public boolean isFull(){
        return nextLast==capacity;
    }
    /**
     * Adhiere un nuevo elemento a la colección, invoca al método add.
     * @param element dato tipo T.
     */
    @Override
    public void push(T element){
        add(element);
    }
    /**
     * Remueve el elemento invocando el elemento pop.
     * @return el elemento tipo T.
     */
    @Override
    public T remove(){
        return pop();
    }
    
}
