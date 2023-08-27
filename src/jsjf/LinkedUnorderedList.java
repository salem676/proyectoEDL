/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsjf;

import jsjf.exceptions.ElementNotFoundException;
import jsjf.exceptions.EmptyCollectionException;

/**
 * Lista dsordenada ligada
 * @author Zuriel García
 * @param <T> datos a utilizar.
 */
public class LinkedUnorderedList<T> extends AbstractLinkedList<T> implements UnorderedListADT<T> {
    /**
     * Constructor de la clase, llama al constructor de la súperclase.
     */
    public LinkedUnorderedList(){
        super();
    }
    /**
     * Método que añade un elemento despúes de otro especificado.
     * @param target es el elemento referencia.
     * @param element el elemento a añadir.
     */
//    @Override
//    public void addAfter(T target, T element)throws ElementNotFoundException {
//        DoubleNode<T> objetivo = head.getSiguiente();
//        DoubleNode<T> nuevo=new DoubleNode(element);
//        if(!contains(target)){
//           throw new ElementNotFoundException("lista");
//        }else{
//            while(!objetivo.getElement().equals(target))
//                objetivo = objetivo.getSiguiente();
//            nuevo.setSiguiente(objetivo.getSiguiente());
//            nuevo.setAnterior(objetivo);
//            objetivo.setSiguiente(nuevo);
//            nuevo.getSiguiente().setAnterior(nuevo);
//            count++;
//
//        }
//    }
    @Override
    public void addAfter( T target,T element)throws ElementNotFoundException,EmptyCollectionException{
        if(isEmpty()){
            throw new EmptyCollectionException("Lista vacía");
        }
        DoubleNode<T>buscado=buscaNodo(head.getSiguiente(),target);
        if(buscado==null)
            throw new ElementNotFoundException("");
        DoubleNode<T>nuevo=new DoubleNode(element);
        nuevo.setSiguiente(buscado.getSiguiente());
        nuevo.setAnterior(buscado);
        buscado.setSiguiente(nuevo);
        nuevo.getSiguiente().setAnterior(nuevo);
        count++;
    }
}
