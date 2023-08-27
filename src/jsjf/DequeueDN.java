/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsjf;

import jsjf.exceptions.ElementNotFoundException;
import jsjf.exceptions.EmptyCollectionException;

/**
 * Cola implementada con doble nodo.
 * @author Zuriel
 * @param <T> datos a utilizar.
 */
public class DequeueDN<T> {
    /*
    Parámetros nodo cabeza y fin, y contador entero.
    */
    private DoubleNode<T> head, tail;
    private int count;
    /**
     * Constructor vacío que hace llamada al método clear.
     */
    public DequeueDN(){
        clear();
    }
    /**
     * Método clear, inicializa los nodos y apuntadores.
     */
    public void clear(){
        head=new DoubleNode<>();
        tail=new DoubleNode<>();
        head.setSiguiente(tail);
        tail.setAnterior(head);
        count=0;
    }
    /**
     * Método size entero que regresa el número de nodos.
     * @return valor entero tamaño.
     */
    public int size(){
        return count;
    }
    /**
     * Método boolean isEmpty.
     * @return valor boolean si está vacío.
     */
    public boolean isEmpty(){
        return count==0;
    }
    /**
     * Método addFirst, que añade al principio un elemento envuelto en un nuevo nodo.
     * @param element a añadir.
     */
    public void addFirst(T element){
        DoubleNode<T>nuevo=new DoubleNode<>(element);
        DoubleNode<T>antes=head;
        DoubleNode<T>despues=head.getSiguiente();
        
        antes.setSiguiente(nuevo);
        nuevo.setAnterior(antes);
        nuevo.setSiguiente(despues);
        despues.setAnterior(nuevo);
        count++;
    }
    /**
     * Método addLast que añade al final un elemento envuelto en un nodo.
     * @param element  a añadir.
     */
    public void addLast(T element){
        DoubleNode<T>nuevo=new DoubleNode<>(element);
        DoubleNode<T>antes=tail.getAnterior();
        DoubleNode<T>despues=tail;
        
        antes.setSiguiente(nuevo);
        nuevo.setAnterior(antes);
        nuevo.setSiguiente(despues);
        despues.setAnterior(nuevo);
        count++;
    }
    /**
     * Método removeLast que elimina un elemento al final.
     * @return el elemento al final.
     * @throws EmptyCollectionException si está vacío. 
     */
    public T removeLast()throws EmptyCollectionException{
        if(isEmpty()){
            throw new EmptyCollectionException("DequeueDN vacía");
        }
        DoubleNode<T>aEliminar=tail.getAnterior();
        DoubleNode<T>antes=aEliminar.getAnterior();
        DoubleNode<T>despues=aEliminar.getSiguiente();
        antes.setSiguiente(despues);
        despues.setSiguiente(antes);
        count--;
        return aEliminar.getElement();
    }
    /**
     * Método que regresa un elemento al principio, lo elimina además.
     * @return el elemento.
     * @throws EmptyCollectionException si está vacío. 
     */
    public T removeFirst()throws EmptyCollectionException{
        if(isEmpty()){
            throw new EmptyCollectionException("DequeueDN vacía");
        }
        DoubleNode<T>aEliminar=head.getSiguiente();
        DoubleNode<T>antes=aEliminar.getAnterior();
        DoubleNode<T>despues=aEliminar.getSiguiente();
        antes.setSiguiente(despues);
        despues.setSiguiente(antes);
        count--;
        return aEliminar.getElement();
    }
    /**
     * Método que elimina un elemento. Es un método que hace llamada a otro método recursivo.
     * @param element a eliminar.
     * @return el elemento dado.
     * @throws EmptyCollectionException si está vacío. 
     */
    public T remove(T element)throws EmptyCollectionException{
        if(isEmpty()){
            throw new EmptyCollectionException(" DequeueDN vacía ");
        }
        return removeR(element,head.getSiguiente());
    }/**
     * Método removeR recursivo que elimina un elemento dado.
     * @param element a eliminar.
     * @param nodo con el que se empieza la recursión.
     * @return elemento dado.
     * @throws ElementNotFoundException si no encuentra el elemento. 
     */
    private T removeR(T element, DoubleNode<T>nodo)throws ElementNotFoundException{
        if(nodo==tail)
            throw new ElementNotFoundException(" No se encontró el elemento "); 
        if(nodo.getElement().equals(element)){
            DoubleNode<T>antes=nodo.getAnterior();
            DoubleNode<T>despues=nodo.getSiguiente();
            antes.setSiguiente(despues);
            despues.setAnterior(antes);
            count--;
            return nodo.getElement();

        }else{
            return removeR(element,nodo.getSiguiente());
        }
        
    }
    
}
