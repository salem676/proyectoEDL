/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsjf;

import jsjf.exceptions.EmptyCollectionException;

/**
 *  Estrcutra First in, first out implementada con arreglos.
 *  Hereda de la clase AbstractArrayLinearCollection e implementa
 *  la interfaz QueueADT.
 * @author zgarciag
 * @param <T> tipo de dato utilizado.
 */
public class ArrayFIFO<T> extends AbstractArrayLinearCollection<T> implements QueueADT<T> {
    /**
     * Método que devuelve el primer elemento de la estructura.
     * @return elemento tipo T.
     * @throws EmptyCollectionException si la colección está vacía. 
     */
    @Override
    public T first()throws EmptyCollectionException{
        if(isEmpty())
            throw new EmptyCollectionException("Cola");
        return array[0];
    }
    /**
     * Método que agrega un elemento a la cola.
     * @param element a añadir.
     */
    @Override
    public void enqueue(T element){
        add(element);
    }
    /**
     * Método que regresa saca el elemento hasta el frente de la cola.
     * @return el elemento tipo T.
     * @throws EmptyCollectionException si la colección está vacía. 
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
    }/**
     * Método que invoca al método dequeue.
     * @return el elemento al frente de la cola.
     */
    @Override
    public T remove(){
        return dequeue();
    }
}
