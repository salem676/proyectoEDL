/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsjf;

/**
 * Implementación de una lista indexada ligada por nodos.
 * @author Zuriel García.
 * @param <T> datos a utilizar.
 */
public class LinkedIndexedList<T> extends AbstractLinkedList<T> implements IndexedListADT<T> {

    public LinkedIndexedList() {
        super();
    }
    private T getR(int index,DoubleNode<T>node, int i){
        if(index==i){
            T element=node.getElement();
            return element;
        }
        return getR(index,node.getSiguiente(),i+1);
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException{
        if(index<0||index>=size()){
            throw new IndexOutOfBoundsException("lista indexada");
        }
        return getR(index,head.getSiguiente(),0);
    }

    @Override
    public T remove(int index)throws IndexOutOfBoundsException {
        if(index<0||index>=count){
            throw new IndexOutOfBoundsException("double node");
        }
        return removeR(index, head.getSiguiente(),0);
    }
    private T removeR(int index, DoubleNode<T>node, int i){
        if(index==i){
            DoubleNode<T>antes=node.getAnterior();
            DoubleNode<T>despues=node.getSiguiente();
            T element=node.getElement();
            antes.setSiguiente(despues);
            despues.setAnterior(antes);
            count--;
            return element;
        }else{
            return removeR(index, node.getSiguiente(),i+1);
        }
        
    }

    private void setR(int index,T element,DoubleNode<T>node, int i) {
        if(index==i){
            node.setElement(element);
        }else{
            setR(index,element,node.getSiguiente(),i+1);
        }
    }
    @Override
    public void set(T element, int index)throws IndexOutOfBoundsException{
        if(index<0||index>=count){
            throw new IndexOutOfBoundsException();
        }
        setR(index,element,head.getSiguiente(),0);
        
    }

    @Override
    public int indexOf(T element) {
        return indexOfR(element,head.getSiguiente(),0);
    }
    private int indexOfR(T element, DoubleNode<T>node, int i){
        if(node==tail)
            return -1;
        if(element.equals(node.getElement()))
            return i;
        else
            return indexOfR(element,node.getSiguiente(),i+1);
    }

    private void addR(T element, int index, DoubleNode<T> node, int i) {
        if(index==i){
            DoubleNode<T>antes,despues;
            antes=node.getAnterior();
            despues=node;
            DoubleNode<T>nuevoNodo=new DoubleNode<>(element);
            nuevoNodo.setAnterior(antes);
            nuevoNodo.setSiguiente(despues);
            despues.setAnterior(nuevoNodo);
            antes.setSiguiente(nuevoNodo);
            count++;
        }else{
            addR(element,index,node.getSiguiente(),i+1);
        }
    }

    @Override
    public void add(T element, int index) throws IndexOutOfBoundsException {
        if(index<0||index>count)
            throw new IndexOutOfBoundsException("índice fuera de rango");
        addR(element,index, head.getSiguiente(),0);
    }


    
}
