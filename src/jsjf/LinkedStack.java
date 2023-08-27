/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsjf;

import jsjf.exceptions.EmptyCollectionException;

/**
 *
 * @author Zuriel
 * @param <T> datos a utilizar.
 */
public class LinkedStack<T> implements StackADT<T> {
    private LinearNode<T> top;
    private int count;

    public LinkedStack() {
        clear();
    }
    
    public LinearNode<T> getTop() {
        return top;
    }

    public void setTop(LinearNode<T> top) {
        this.top = top;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    
    @Override
    public void push(T element) {
        LinearNode<T>newNode=new LinearNode(element);
        newNode.setNext(top);
        top=newNode;
        count++;
    }

    @Override
    public T pop() throws EmptyCollectionException {
        if(isEmpty()){
            throw new EmptyCollectionException("Linked Stack vacía");
        }
        T element=top.getElement();
        top=top.getNext();
        count--;
        return element;
    }

    @Override
    public T peek() throws EmptyCollectionException {
        if(isEmpty()){
            throw new EmptyCollectionException("Linked Stack empty");
        }
        return top.getElement();
    }
    @Override
    public boolean isEmpty() {
        return count==0;
    }

    @Override
    public void clear(){
        top=null;
        count=0;
    }

    @Override
    public void add(T element) {
        push(element);
    }

    @Override
    public T remove() {
        return pop();
    }
    
}
