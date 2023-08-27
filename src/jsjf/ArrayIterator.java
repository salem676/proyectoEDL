package jsjf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Implementa un iterador para estructuras implementadas con arreglos.
 * implementa la interface Iterator.
 * @author zgarciag
 * @param <T> tipo de datos utilizado.
 */
public class ArrayIterator<T> implements Iterator<T>{

    private final T[] items; //elementos en la colección.
    private final int count; //posición actual del iterador.
    private int current;
    /**
     * Constructor ArrayIterator. El índice current se inicializa en 0.
     * @param array inicializa items con un arreglo dado.
     * @param elementos inicializa el contador de posición
     * del iterador con los elementos del arreglo.
     */
    public ArrayIterator(T[] array, int elementos){
        items = array;
        count = elementos;
        current = 0;
    }
    /**
     * Método que regresa un boolean si existe un elemento siguiente.
     * @return valor boolean.
     */
    @Override
    public boolean hasNext() {
        return current < count;
    }
    /**
     * Método next regresa el siguiente elemento marcado por el índice current.
     * @return el siguiente elemento.
     * @throws NoSuchElementException al haber siguiente elemento. 
     */
    @Override
    public T next() throws NoSuchElementException{
        if(!hasNext())
            throw new NoSuchElementException();
//        T elem = items[current];
//        current++;
        current++;
//        return elem;
        return items[current-1];
    }
    /**
     * Función que elimina el elemento en el índice current.
     * @throws UnsupportedOperationException si no siguiente elemento.
     */
    @Override
    public void remove() throws UnsupportedOperationException{
        if(!hasNext())
            throw new UnsupportedOperationException();
        items[current]=null;
    }
    
}
