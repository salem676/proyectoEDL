/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsjf.exceptions;

/**
 *Representa la situación en la que una colección está vacía.
 * @author zgarciag
 */
public class EmptyCollectionException extends RuntimeException {
    /**
     * Da de alta la excepción con un mensaje apropiado.
     * @param Pila el nombre la colección.
     */
    public EmptyCollectionException(String Pila){
        super("La "+Pila+ " está vacía.");
    }
    
}
