/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsjf;

import java.util.Arrays;
import jsjf.exceptions.EmptyCollectionException;

/**
 * Implementación de una pila por medio de un arreglo.
 * @author zgarciag
 * @param <T> tipo de datos a utilizar.
 */
public class ArrayStack<T> extends AbstractArrayLinearCollection<T> implements StackADT<T> {
    

    /**
     * Crea una pila vacía utilizando la capacidad default y una llamada al super.
     */
    public ArrayStack(){
        super();
    }
    /**
     * Crea una pila vacía utilizando una capacidad dada.
     * @param initialCapacity capacidad inicial.
     */
    public ArrayStack(int initialCapacity){
        capacity=initialCapacity;
        clear();
    }
    /**
     * Método que añade un elemento al tope de la pila.
     * @param element T a añadir.
     */
    @Override
    public void push(T element){
        if(isFull())
            expandCapacity();
        array[nextLast]=element;
        nextLast++;
    }
    /**
     * Método que expande la capacidad.
     */
    @Override
    public void expandCapacity(){
       array=Arrays.copyOf(array,array.length*2);
    }
    /**
     * Método que regresa el elemento en el tope de la pila.
     * @return elemento T
     * @throws EmptyCollectionException si la colección está vacía. 
     */
    @Override
    public T peek()throws EmptyCollectionException{
        if(isEmpty())
            throw new EmptyCollectionException("Array");
        return array[nextLast-1];
    }
    /**
     * Método que regresa el elemento en el tope de la pila.
     * @return elemento T
     * @throws EmptyCollectionException si la pila está vacía. 
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
     * Método que añade un elemento a la pila. Invoca el método push.
     * @param element T a añadir.
     */
    @Override
    public void add(T element){
        push(element);
    }
    /**
     * Método que remueve el elemento en el tope de la pila. Llama al método pop.
     * @return elemento T.
     */
    @Override
    public T remove(){
        return pop();
    }
    
    
}
