/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsjf;

import jsjf.exceptions.ElementNotFoundException;
import jsjf.exceptions.EmptyCollectionException;

/**
 * Clase abstracta implementa una lista por medio de un arreglo.
 * Extiende a AbstractArrayLinearCollectionIterable.
 * @author zgarciag
 * @param <T> datos a utilizar.
 */
public abstract class AbstractArrayList<T> extends AbstractArrayLinearCollectionIterable<T> {
    /**
     * Regresa el primer elemento. Lanza una excepción si está vacía.
     * @return tipo T.
     */
    public T first() throws EmptyCollectionException{
        if(isEmpty()){
            throw new EmptyCollectionException("lista");
        }
        return array[0];
    }
    /**
     * Método que regresa el último elemento de la lista.
     * Lanza una excepción si está vacía.
     * @return elemento tipo T.
     */
    public T last(){
        if(isEmpty()){
            throw new EmptyCollectionException("lista");
        }
        return array[nextLast-1];
    }
    /**
     * Método que elimina y regresa el primer elemento de la lista.
     * @return el elemento T
     * @throws EmptyCollectionException si está vacío.
     */
    public T removeFirst() throws EmptyCollectionException{
        T res=first();
       for(int i=0;i<nextLast-1;i++){
           array[i]=array[i+1];
       }
       nextLast--;
       array[nextLast]=null;
       return res;
    }
    /**
     * Método que regresa y elimina el último elemento de la lista.
     * @return elemento T.
     * @throws EmptyCollectionException  si está vacío
     */
    public T removeLast() throws EmptyCollectionException{
        T res=last();
        nextLast--;
        array[nextLast]=null;
        return res;
    }
    /**
     * Método que remueve el primer elemento de la lista.
     * @return elemento T.
     * @throws EmptyCollectionException si está vacío.
     */
    public T remove() throws EmptyCollectionException{
        return removeFirst();
    }
    /**
     * Método que remueve un elemento especificado.
     * Hace llamada a los métodos isEmpty,indexOf.
     * @param element a buscar.
     * @return el elemento T.
     * @throws EmptyCollectionException si está vacío.
     * @throws ElementNotFoundException  si no lo encontró.
     */
    public T remove(T element) throws EmptyCollectionException,ElementNotFoundException{
        int index;
        T res;
        if(isEmpty()){
            throw new EmptyCollectionException("lista");
        }
        index=indexOf(element);
        if(index<0){
            throw new ElementNotFoundException("El elemento: "+element);
        }
        res=array[index];
        for(int i=index;i<nextLast-1;i++){
            array[i]=array[i+1];
        }
        nextLast--;
        array[nextLast]=null;
        return res;
    }
    
    
}
