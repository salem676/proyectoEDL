/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsjf;

import java.util.Iterator;
import java.util.Random;
import jsjf.exceptions.EmptyCollectionException;

/**
 * Implementación de lista desordenada con arreglos.
 * @author Zuriel
 * @param <T> tipo de datos utilizado.
 */
public class ArrayUnorderedList<T> extends AbstractArrayLinearCollection<T> implements LinearCollectionIterable<T> {
    /**
     * Constructor que hace llamada al súper.
     */
    public ArrayUnorderedList(){
        super();
    }
    /**
     * Constructor que inicializa la capacidad dada. Hace una llamada al metodo clear
     * de la superclase.
     * @param initialCapacity capacidad dada.
     */
    public ArrayUnorderedList(int initialCapacity){
        capacity=initialCapacity;
        super.clear();
    }
    /**
     * Método que remueve un elemento dado por el índice.
     * @param index índice especificado.
     * @return elemento T.
     */
    public T remove(int index) {
        T element;
        element=array[index];
        array[index]=null;
        return element;
    }
    /**
     * Método que remueve un elemento especificado.
     * @param element elemento especificado.
     * @return el elemento T.
     */
    @Override
    public T remove(T element){
        T object;
        int index=indexOf(element);
        object=array[index];
        array[index]=null;
        return object;
    }
    /**
     * Método que añade en una posición el elemento dado.
     * @param element a añadir.
     */
    public void addLast(T element) {
        add(element);
    }
    /**
     * Mètodo que añade un elemento al principio de la lista.
     * @param element a añadir.
     */
    public void addFirst(T element){
        if(isFull()){
            expandCapacity();
        }
        for(int i=0;i<array.length;i++){
            array[i]=array[i+1];
        }
        array[0]=element;
        nextLast++;
    }
    /**
     * Método que regresa un booleano si la lista contiene al elemento.
     * @param element T a buscar.
     * @return elemento T.
     */
    @Override
    public boolean contains(T element) {
      int i=0;
      boolean res=false;
      while(i<=size()&&!res){
          if(array[i].equals(element)){
              res=true;
          }else{
              i++;
          }
      }
      return res;
    }
    /**
     * Método que regresa un elemento por medio de su índice.
     * @param index para buscar.
     * @return elemento T.
     */
    public T get(int index) {
        T element=array[index];
         array[index]=null;
         return element;
    }
    /**
     * Método que regresa el índice del elemento especificado.
     * @param element T a buscar.
     * @return índice.
     */
    public int indexOf(T element) {
        int index=-1,i=0;
        if(contains(element)){
            if(array[i].equals(element)){
                index=0;
            }else{
                while(i<=size()&&!array[i].equals(element)){
                    i++;
                    if(array[i].equals(element))
                        index=i;
                }
            }
        }
        return index;
    }
    /**
     * Método que ingresa un elemento a la lista por medio de su índice.
     * @param index para ingresar el método.
     * @param element a ingresar.
     */
    public void set(int index, T element) {
        if(index<array.length){
            array[index]=element;
        }
    }
    /**
     * Método que regresa el tamaño de la lista.
     * @return entero del tamaño.
     */
    @Override
    public int size(){
        return nextLast;
    }
    /**
     * Método que regresa un iterador con utilizando el array y el tamaño de la lista. 
     * @return iterador.
     */
    @Override
    public Iterator<T> iterator() {
       return new ArrayIterator(array,size());
    }
    /**
     * Método remove que regresa un elemento en la lista al azar.
     * @return elemento T. 
     */
    @Override
    public T remove()throws EmptyCollectionException{
        if(!isEmpty()){
            Random r=new Random();
            int n=r.nextInt(nextLast);
            T var=array[n];
            array[n]=array[nextLast-1];
            array[nextLast-1]=null;
            nextLast--;
            return var;
        }else{
            throw new EmptyCollectionException("Conjunto");
        }
    }

}
