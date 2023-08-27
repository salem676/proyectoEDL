/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsjf;

import jsjf.exceptions.EmptyCollectionException;

/**
 * Clase que implementa los métodos para las colas.
 * Implementa la interfaz propia.
 * @author zgarciag
 * @param <T> tipo de datos.
 */
public class ArrayQueue<T> extends AbstractArrayLinearCollection<T> implements QueueADT<T> {
    

    /**
     * Constructor default.
     */
    public ArrayQueue(){
        super();
    }
    /**
     * Constructor con una capacidad inicial dada.
     * @param initialCapacity capacidad inicial de la cola.
     */
    public ArrayQueue(int initialCapacity){
        capacity=initialCapacity;
        clear();
    }
    /**
     * Médoto que regresa el elemento en el tope de la cola.
     * @return el elemento en el tope, tipo T.
     */
    @Override
    public T first(){
        if(isEmpty())
            throw new EmptyCollectionException("Cola");
        return array[0];
    }
    /**
     * Método que agrega un elemento a la cola.
     * @param element a agregar.
     */
    @Override
    public void enqueue(T element){
        if(nextLast==capacity)
            expandCapacity();
        array[nextLast]=element;
        nextLast++;
    }
    /**
     * Método que expande la capacidada de la cola.
     */
    @Override
    public void expandCapacity(){
        int capacidadExpandida=capacity*2;
        T[] mayor=(T[]) new Object[capacidadExpandida];
        System.arraycopy(array, 0, mayor, 0, capacity);
        array=mayor;
        capacity=capacidadExpandida;
    }
    /**
     * Método que elimina y regresa el elemento en el tope de la pila.
     * @return elemento tipo T.
     * @throws EmptyCollectionException si la cola está vacía. 
     */
    @Override
    public T dequeue() throws EmptyCollectionException{
        T element;
        if(!isEmpty()){
            element=array[0];
            for(int i=0;i<nextLast-1;i++)
                array[i]=array[i+1];
            nextLast--;
        }else{
            throw new EmptyCollectionException("cola");
        }
        return element;
    }
    /**
     * Método que regresa el elemento en el tope de la pila. Ivoca dequeue.
     * @return elemento tipo T.
     */
    @Override
    public T remove(){
        return dequeue();
    }

    /**
     * Añade un elemento a la cola. Llama al método enqueue.
     * @param element a añadir.
     */
    @Override
    public void add(T element){
        enqueue(element);
    }

    
}
