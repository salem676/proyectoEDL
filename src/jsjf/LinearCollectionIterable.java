/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsjf;

/**
 * Colección lineal iterable.
 * @author zgarciag
 * @param <T> tipo de datos utilizado.
 */
public interface LinearCollectionIterable<T> extends LinearCollectionADT<T>,Iterable<T>{
    /**
     * Remueve el elemento T especificado.
     * @param element a remover.
     * @return el elemento.
     */
    public T remove(T element);
    /**
     * Método que regresa valor booleano si se contiene al elemento.
     * @param element a comprobar si está contenido.
     * @return valor boolean.
     */
    public boolean contains(T element);
    /**
     * Método que regresa el tamaño de la colección linea.
     * @return tamaño entero.
     */
    public int size();
    /**
     * Método que regresa los objetos de la colección en forma de String.
     * @return String.
     */
    @Override
    public String toString();

}
