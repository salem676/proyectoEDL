/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsjf;

/**
 *  Interface del conjunto. Hereda de LinearCollectionIterable e Iterable.
 * @author zgarciag
 * @param <T> datos a utilizar.
 */
public interface SetADT<T> extends LinearCollectionIterable<T>,Iterable<T> {
    /**
     * Método que remueve un elemento al azar.
     * @return elemento T.    
    */
    @Override
    public T remove();
    /**
     * Método que compara dos conjuntos.
     * @param set conjunto a comparar.
     * @return valor boolean.
     */
    public boolean equals(SetADT<T> set);


    
}
