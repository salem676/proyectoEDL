/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsjf;

/**
 *
 * @author Zuriel
 * @param <T> datos a utilizar.
 */
public class LinearNodePrint<T> extends LinearNode<T> {
    @Override
    public String toString(){
        if(next==null){
            return element.toString();
        }else{        
            return element.toString()+" "+next.toString();
        }
    }
}
