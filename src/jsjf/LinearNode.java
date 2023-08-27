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
public class LinearNode<T>{
    protected T element;
    protected LinearNode<T> next;
    public LinearNode(){
    }
    public LinearNode(T element){
        this.element=element;
    }
    public LinearNode(T element, LinearNode<T> next){
        this.element=element;
        this.next=next;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public LinearNode<T> getNext() {
        return next;
    }

    public void setNext(LinearNode<T> next) {
        this.next = next;
    }
    
    
}
