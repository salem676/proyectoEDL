/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsjf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Clase iterador para el HashSet.
 * @author Zuriel García.
 * @param <T>
 */
public class HashSetIterator<T> implements Iterator<T> {

    private final LinkedIndexedList<T>[]table;//tabla de listas indexadas.
    private final int count; //posición actual del iterador.
    private int indexTable;
    private int indexList;
    private int read;
        /**
     * Constructor ArrayIterator. El índice current se inicializa en 0.
     * @param array inicializa items con un arreglo dado.
     * @param elementos inicializa el contador de posición
     * del iterador con los elementos del arreglo.
     */
    public HashSetIterator(LinkedIndexedList<T>[]array, int elementos){
        table = array;
        count = elementos;
        read=0;
        indexList=0;
        indexTable=0;
    }
    /**
     * Método que regresa un boolean si existe un elemento siguiente.
     * @return valor boolean.
     */
    @Override
    public boolean hasNext() {
        return read < count;
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
        while(table[indexTable].isEmpty()){
            indexTable++;
        }
        T element=table[indexTable].get(indexList);
        read++;
        indexList++;
        if(indexList==table[indexTable].size());{
            indexTable++;
            indexList=0;
        }
        return element;
    }


}

