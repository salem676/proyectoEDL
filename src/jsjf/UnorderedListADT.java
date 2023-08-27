/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsjf;

/**
 * Interfaz de la lista desordenada. Hereda de la interfaz List.
 * @author zgarciag
 * @param <T> tipo de datos.
 */
public interface UnorderedListADT<T> extends List<T> {
    /**
     * Añade un elemento a la lista, después del elemento especificado.
     * @param element Elemento a añadir.
     * @param target Elemento de referencia.
     */
    public void addAfter(T target,T element);
    /**
     * Añade un elemento al frente de la lista.
     * @param element Elemento a añadir.
     */
    public void addFirst(T element);
    /**
     * Añade un elemento al final de la lista.
     * @param element Elemento a añadir.
     */
    public void addLast(T element);
    /**
     * Elimina un elemento especificado.
     * @param element a eliminar.
     * @return 
     */
    @Override
    public T remove(T element);
}
