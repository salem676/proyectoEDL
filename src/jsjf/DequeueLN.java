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
public class DequeueLN<T> {
    LinearNode<T>head,tail;
    int count;
    
    public DequeueLN(){
        clear();
    }
    public boolean isEmpty(){
        return count==0;
    }
    public void clear(){
        count=0;
        head=null;
        tail=null;
    }
    public void addFirst(T element){
        LinearNode<T>nuevo=new LinearNode(element);
        if(isEmpty()){
            tail=head=nuevo;
        }else{
            nuevo.setNext(head);
            head=nuevo;
        }
        count++;
    }
    public void addLast(T element){
        LinearNode<T>nuevo=new LinearNode(element);
        if(isEmpty()){
            head=tail=nuevo;
        }else{
            tail.setNext(nuevo);
            tail=nuevo;
        }
        count++;
    }
    public T removeFirst() throws EmptyCollectionException{
        if(isEmpty()){
            throw new EmptyCollectionException("cola vacía");
        }
        T res=head.getElement();
        head=head.getNext();
        count--;
        if(isEmpty()){
            head=tail=null;
        }
        return res;
    }
    public T removeLast() throws EmptyCollectionException{
        if(isEmpty()){
            throw new EmptyCollectionException("cola vacía");
        }
        T res=tail.getElement();
        LinearNode<T>aux=head;
        while(aux.getNext()!=tail){
            aux=aux.getNext();
        }
        tail=aux;
        count--;
        if(isEmpty()){
          head=tail=null;  
        }
        return res;
    }
//    public T remove(T element)throws EmptyCollectionException{
//        if(isEmpty()){
//            throw new EmptyCollectionException(" DequeueDN vacía ");
//        }
//        return removeR(element,head.getNext());
//    }
//    private T removeR(T element, LinearNode<T>nodo)throws ElementNotFoundException{
//        if(nodo==tail)
//            throw new ElementNotFoundException(" No se encontró el elemento "); 
//        if(nodo.getElement().equals(element)){
//            
//            despues.setAnterior(antes);
//            count--;
//            return nodo.getElement();
//
//        }else{
//            return removeR(element,nodo.getNext());
//        }
//
//    }
    
    
    
}
