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
public class LinkedQueue<T> implements QueueADT<T> {
    private LinearNode<T> front;
    private LinearNode<T> rear;
    private int count;

    public LinkedQueue(){
        clear();
    }

    @Override
    public void enqueue(T element) {
        LinearNode<T> newNode=new LinearNode(element);
        if(isEmpty()){
            front=newNode;
        }
        rear.setNext(newNode);
        rear=newNode;
        count++;
    }

    @Override
    public T dequeue() throws EmptyCollectionException {
        if(isEmpty()){
            throw new EmptyCollectionException("Linked Queue empty");
        }
        T element=front.getElement();
        front=front.getNext();
        count--;
        if(isEmpty())
            rear=null;
        return element;
    }

    @Override
    public T first() throws EmptyCollectionException {
        if(isEmpty()){
            throw new EmptyCollectionException("Linked Queue empty");
        }
        return front.getElement();
    }

    @Override
    public boolean isEmpty() {
        return count==0;
    }

    @Override
    public void clear() {
        front=new LinearNode();
        rear=new LinearNode();
        count=0;
    }

    @Override
    public void add(T element) {
        enqueue(element);
    }

    @Override
    public T remove() {
        return dequeue();
    }
    
}
