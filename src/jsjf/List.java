/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsjf;

/**
 * Interface de la lista. Hereda de LinearCollectionIterable.
 * @author zgarciag
 * @param <T> tipo de datos utilizado.
 */
public interface List<T> extends LinearCollectionIterable<T>{
    /**
     * Quita el primer elemento.
     * @return Regresa el elemento.
     */
    public T removeFirst();
    /**
     * Quita el último el elemento.
     * @return Regresa el elemento.
     */
    public T removeLast();
    /**
     * Regresa el primer elemento.
     * @return primer elemento.
     */
    public T first();
    /**
     * Regresa el último elemento.
     * @return elemento último.
     */
    public T last();
}
