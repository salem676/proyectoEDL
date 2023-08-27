/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsjf;

/**
 * Interface de lista ordenada. Hereda de List.
 * @author zgarciag
 * @param <T> datos a utilizar.
 */
public interface OrderedListADT<T> extends List<T> {
    /**
     * Añade el elemento en el lugar que le está designado.
     * @param element el elemento a ingresar. 
     */
    @Override
    public void add(T element);

    /**
     * Método que elimina un elemento dado.
     * @param element a eliminar.
     * @return el elemento.
     */
    @Override
    public T remove(T element);

}
