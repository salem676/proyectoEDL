/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsjf;

/**
 *
 * @author zgarciag
 * @param <T> datos a utilizar.
 */
public interface IndexedListADT<T> extends List<T> {
    
     /**
     * Regresa el elemento especificado. 
     * @param index índice del elemento.
     * @return elemento.
     */
    public T get(int index);
     /**
     * Remueve el elemento por el índice.
     * @param index a buscar.
     * @return elemento.
     */
    public T remove(int index);
     /**
     * Coloca un elemento dado en el lugar del índice correspondiente.
     * @param index en el cual se cambiará el elemento.
     * @param element a poner.
     */
    public void set(T element,int index);
    
    /**
     * Regresa el índice en el que se encuentra al elemento.
     * @param element a buscar el índice.
     * @return índice del elemento.
     */
    public int indexOf(T element);
    /**
     * Ingresa a la lista el elemento, utilizando el índice. Recorre los demás elementos.
     * @param element a añadir.
     * @param index índice en el que se añadirá elemento.
     */
    public void add(T element,int index);
}
