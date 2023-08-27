package jsjf;

import java.io.Serializable;

/**
 * Interfaz de la colección lineal.
 * Extiende a serializable.
 * @author zgarciag
 * @param <T> tipo de datos utilizado.
 */
public interface LinearCollectionADT <T> extends Serializable {
    /**
     * Regresa un valor booleano si la colección está vacía.
     * @return valor boolean.
     */
    public boolean isEmpty();
    /**
     * Borra e inicializa una lista.
     */
    public void clear();
    /**
     * Adiciona un elemento a la colección.
     * @param element a añadir.
     */
    public void add(T element);
    /**
     * Remueve y regresa un elemento de la colección.
     * @return elemento removido.
     */
    public T remove();
    

    
}