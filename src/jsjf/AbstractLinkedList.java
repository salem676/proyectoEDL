/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsjf;

import java.util.Iterator;
import jsjf.exceptions.ElementNotFoundException;
import jsjf.exceptions.EmptyCollectionException;

/**
 * Clase abstracta linked list.
 * @author Zuriel
 * @param <T> datos a utilizar.
 */
public class AbstractLinkedList<T> implements List<T> {
    protected DoubleNode<T> head, tail;
    protected int count;
    /**
     * Constructor que llama a clear para inicializar.
     */
    public AbstractLinkedList(){
        clear();
    }
    /**
     * Método clear que inicializa head y tail.
     */
    @Override
    public void clear(){
        head=new DoubleNode<>();
        tail=new DoubleNode<>();
        head.setSiguiente(tail);
        tail.setAnterior(head);
        count=0;
    }
    /**
     * Método que añade un nuevo elemento al inicio de la lista.
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
     * Método que añade un elemento nuevo al final de la lista.
     * @param element a añadir.
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
     * Método que elimina el último elemento de la lista.
     * @return el elemento al final.
     * @throws EmptyCollectionException si está vacía. 
     */
    @Override
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
     * Método que quita el primer elemento de la lista.
     * @return dado elemento.
     * @throws EmptyCollectionException si está vacía. 
     */
    @Override
    public T removeFirst()throws EmptyCollectionException{
        if(isEmpty()){
            throw new EmptyCollectionException("Linked list vacía");
        }
        DoubleNode<T>aEliminar=head.getSiguiente();
        DoubleNode<T>antes=aEliminar.getAnterior();
        DoubleNode<T>despues=aEliminar.getSiguiente();
        antes.setSiguiente(despues);
        despues.setAnterior(antes);
        count--;
        return aEliminar.getElement();
    }
    /**
     * Método remove que llama a removeFirst.
     * @return el elemento dado al principio.
     */
    @Override
    public T remove(){
        return removeFirst();
    }
    /**
     * Método que regresa el primer elemento sin eliminarlo.
     * @return el elemento primero.
     * @throws EmptyCollectionException si está vacía. 
     */
    @Override
    public T first()throws EmptyCollectionException {
        if(isEmpty())
            throw new EmptyCollectionException("lista");
        DoubleNode<T>primero=head.getSiguiente();
        return primero.getElement();
    }
    /**
     * Método que regresa el último elemento de la lista.
     * @return el último elemento.
     * @throws EmptyCollectionException si está vacía. 
     */
    @Override
    public T last()throws EmptyCollectionException {
        if(isEmpty())
            throw new EmptyCollectionException("lista");
        DoubleNode<T>ultimo=tail.getAnterior();
        return ultimo.getElement();
    }
    /**
     * Método que elimina un elemento determinado de la lista.
     * Es un método recursivo que hace llamada a removeR.
     * @param element a buscar y eliminar.
     * @return el elemento dado.
     * @throws EmptyCollectionException si está vacía. 
     */
    @Override
    public T remove(T element)throws EmptyCollectionException{
        if(isEmpty()){
            throw new EmptyCollectionException(" vacía ");
        }
        return removeR(element,head.getSiguiente());
    }
    /**
     * Método recursivo que elimina un elemento y lo busca.
     * @param element a buscar.
     * @param nodo siguiente a head.
     * @return elemento a buscar.
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
    /**
     * Método que busca un nodo en el que se halle el elemento dado.
     * @param node a buscar.
     * @param element a buscar.
     * @return el nodo buscado.
     */
    protected DoubleNode<T> buscaNodo(DoubleNode<T> node, T element) {
        if (node == tail) {
            return null;
        } else if (node.getElement().equals(element)) {
            return node;
        } else {
            return buscaNodo(node.getSiguiente(), element);
        }
    }
    /**
     * Método que regresa valor boolean si se contiene el elemento.
     * @param element a buscar.
     * @return valor boolean.
     */
    @Override
    public boolean contains(T element) {
        return buscaNodo(head.getSiguiente(),element)!=null;
    }
    /**
     * Método que regresa el tamaño.
     * @return entero tamaño.
     */
    @Override
    public int size(){
        return count;
    }
    /**
     * Método que regresa valor boolean si está lleno.
     * @return valor boolean.
     */
    @Override
    public boolean isEmpty(){
        return count==0;
    }
    /**
     * Método add
     * @param element a añadir.
     */
    @Override
    public void add(T element) {
        DoubleNode<T>nuevo=new DoubleNode(element);
        DoubleNode<T>antes=tail.getAnterior();
        DoubleNode<T>despues=tail;
        nuevo.setAnterior(antes);
        nuevo.setSiguiente(despues);
        despues.setAnterior(nuevo);
        antes.setSiguiente(nuevo);
        count++;

    }
    /**
     * Método toString forward que imprime desde el frente los nodos.
     * @return cadenas.
     */
    public String toStringF(){
        return head.getSiguiente().toStringF();
    }
    /**
     * Método toString backwards que imprime hacia atrás los nodos.
     * @return cadenas String.
     */
    public String toStringB(){
        return tail.getAnterior().toStringB();
    }
    /**
     * Método String que imprime el nodo head.
     * @return cadena String.
     */
    @Override
    public String toString(){
        return toString(head.getSiguiente());
    }
    /**
     * Método String que imprime desde un nodo determinado.
     * @param node a comenzar a imprimir.
     * @return  cadenas String.
     */
    public String toString(DoubleNode<T> node){
        if(node==tail){
            return "";
        }
        return node.getElement()+" "+toString(node.getSiguiente());
        
    }
    /**
     * Método iterador.
     * @return iterador.
     */
    @Override
    public Iterator<T> iterator() {
        return new LinkedIterator<>(head.getSiguiente(),size());
    }
    
    
}
