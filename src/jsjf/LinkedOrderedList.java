/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsjf;


/**
 * Implementación de una lista ordenada ligada.
 * @author Zuriel García.
 * @param <T> datos a utilizar.
 */
public class LinkedOrderedList<T> extends AbstractLinkedList<T> implements OrderedListADT<T> {
    /**
     * Constructor de la lista ordenada ligada.
     * Hace llamada al constructor de la súperclase.
     * Asigna orden ascendente.
     */
    public LinkedOrderedList(){
        super();
    }
    /**
     * Método añadir que hace llamada a método recursivo.
     * @param element a añadir.
     */
    @Override
    public void add(T element){
        DoubleNode nuevo=new DoubleNode(element);
        addR(element,head.getSiguiente(),nuevo);
    }
    /**
     * Método recursivo añadir.
     * Revisa el lugar donde debe ir el elemento a añadir.
     * @param element
     * @param nodo
     * @param nuevo
     */
//    private void addR(T element,DoubleNode nodo,DoubleNode nuevo){
//        if(isEmpty()){
//            head.setSiguiente(nuevo);
//            nuevo.setAnterior(head);
//            nuevo.setSiguiente(tail);
//            tail.setAnterior(nuevo);
//            count++;
//        }else{
//            if(((Comparable)element).compareTo((Comparable)nodo.getElement()) < 0){
//                    DoubleNode<T> anterior=nodo.getAnterior();
//                    DoubleNode<T> siguiente=nodo;
//                    anterior.setSiguiente(nuevo);
//                    nuevo.setSiguiente(siguiente);
//                    siguiente.setAnterior(nuevo);
//                    nuevo.setAnterior(anterior);
//                    count++;
//            }else{
//                if(nodo.getSiguiente() == tail){
//                    nodo.setSiguiente(nuevo);
//                    nuevo.setSiguiente(tail);
//                    nuevo.setAnterior(nodo);
//                    tail.setAnterior(nuevo);
//                }else
//                    addR(element,nodo.getSiguiente(),nuevo);
//            }
//        }
//    }
// 
    private void addR(T element, DoubleNode<T>node, DoubleNode<T>nuevo){
        if(node==tail){
            DoubleNode<T>anterior=node.getAnterior();
            anterior.setSiguiente(nuevo);
            nuevo.setSiguiente(tail);
            tail.setAnterior(nuevo);
            nuevo.setAnterior(anterior);
            count++;
        }else{
            if(((Comparable)element).compareTo((Comparable)node.getElement())<0){
                DoubleNode<T>anterior=node.getAnterior();
                nuevo.setSiguiente(node);
                node.setAnterior(nuevo);
                nuevo.setAnterior(anterior);
                anterior.setSiguiente(nuevo);
                count++;
            }else
                addR(element,node.getSiguiente(),nuevo);
        }
    }
}
