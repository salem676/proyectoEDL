/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsjf;

import jsjf.exceptions.EmptyCollectionException;

/**
 * Clase que implementa una cola con arreglo circular.
 * @author zgarciag
 * @param <T> datos a utilizar.
 */
public class ArrayCircularQueue<T> implements QueueADT<T> {
      
    private final static int DEFAULT_CAPACITY=20;
    private int rear;
    private int front;
    private int count;
    private T array[];
    private int capacity;
    /**
     * Constructor default.
     */
    public ArrayCircularQueue(){
        this(DEFAULT_CAPACITY);
    }
    /**
     * Constructor con una capacidad inicial dada.
     * @param initialCapacity denota la capacidad con que se inicializa.
     */
    public ArrayCircularQueue(int initialCapacity){
        capacity=initialCapacity;
        clear();
    }
    /**
     * Método que da cambia los valores del arreglo a los de una arreglo vacío.
     */
    @Override
    public void clear(){
        rear=0;
        array=(T[])(new Object[capacity]);
    }
    /**
     * Método que regresa si la cola está vacía.
     * @return valor boolean.
     */
    @Override
    public boolean isEmpty(){
        return count==0;
    }
    /**
     * Método que regresa si la cola está llena.
     * @return valor boolean
     */

    public boolean isFull(){
        return count==capacity;
    }
    
    /**
     * Método que regresa el elemento que está en el índice front..
     */
    @Override
    public T first(){
        if(isEmpty())
            throw new EmptyCollectionException("Cola");
        return array[front];
    }
    /**
     * Método que agrega un elemento a la cola.
     * @param element el elemento a agregar.
     */
    @Override
    public void enqueue(T element){
        if(isFull())
            expandCapacity();
        array[rear]=element;
        rear=(rear+1)%array.length;
        count++;
    }
    /**
     * Método que expande la capacidad de la cola.
     */
    private void expandCapacity(){
        T[] mayor=(T[]) new Object[array.length*2];
        for(int i=0;i<count;i++){
            mayor[i]=array[front];
            front=(front+1)%array.length;
        }
        front=0;
        array=mayor;
        rear=count;
    }
    /**
     * Método que elimina el elemento del marcador de la cola.
     */
    @Override
    public T dequeue() throws EmptyCollectionException{
        T element;
        if(!isEmpty()){
            element=array[front];
            array[front]=null;
            front=(front+1)%array.length;
            count--;
        }else{
            throw new EmptyCollectionException("cola");
        }
        return element;
    }
    /**
     * Método que remueve y regresa el elemento del marcador de la cola.
     * @return elemento a remover.
     */
    @Override
    public T remove(){
        return dequeue();
    }
    /**
     * Método que añade el elemento a la cola.
     * @param element a añadir.
     */
    @Override
    public void add(T element){
        enqueue(element);
    }

}
