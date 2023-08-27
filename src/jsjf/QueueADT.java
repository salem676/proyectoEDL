/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsjf;

/**
 * Interfaz para la implementación de la cola.
 * @author zgarciag.
 * @param <T> Datos a utilizar.
 */
public interface QueueADT<T> extends LinearCollectionADT <T>{
    
    /**
     * Método que agrega un elemento a la cola.
     * @param element T a ingresar.
     */
    public void enqueue(T element);
    /**
     * Método que elimina y regresa el elemento al inicio de la cola.
     * @return elemento T.
     */
    public T dequeue();
    /**
     * Método que regresa el objeto de la cola que está marcado, sin eliminar el objeto.
     * @return elemento T.
     */
    public T first();
    /**
     * Método que regresa si la cola está llena.
     * @return valor boolean. 
     */
    @Override
    public boolean isEmpty();


    
}
