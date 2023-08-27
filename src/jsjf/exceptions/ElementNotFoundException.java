/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsjf.exceptions;

/**
 *
 * @author zgarciag
 */
public class ElementNotFoundException extends RuntimeException {
    
    public ElementNotFoundException(String Conjunto){
        super("El"+Conjunto+" no encontró el elemento.");
    }
    
}
