/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsjf;

/**
 * Lista indexada implementada por medio de arreglos.
 * @author ZGARCIAG
 * @param <T> tipo de datos.
 */
public class ArrayIndexedList<T> extends AbstractArrayList<T> implements IndexedListADT<T> {
    /**
     * Regresa el elemento del índice especificado.
     * @param index a utilizar.
     * @return T elemento.
     */
    @Override
    public T get(int index) throws IndexOutOfBoundsException{
        if(index<0||index>=size()){
            throw new IndexOutOfBoundsException("lista indexada");
        }
        return array[index];
        
    }
    /**
     * Método que da el valor del nuevo elemento a un espacio especificado por el índice.
     * @param index a donde se va a ingresar el elemento.
     * @param element a ingresar.
     */
    @Override
    public void set(T element, int index){
        if(index<0||index>=size()){
            throw new IndexOutOfBoundsException("lista indexada");
        }
        array[index]=element;
    }
    /**
     * Método que llama al método indexOf de la superclase AbstractArrayLinearCollectionIterable.
     * @param element a buscar el índice.
     * @return el entero índice.
     */
    @Override
    public int indexOf(T element){
        return super.indexOf(element);
    }
    /**
     * Método que agrega en una posición determinada, un elemento.
     * @param index como referencia para la inserción.
     * @param element a insertar.
     * @throws IndexOutOfBoundsException si el índice no corresponde al tamaño de la lista.
     */
    @Override
    public void add(T element, int index) throws IndexOutOfBoundsException{
        if(index<0||index>size()){
            throw new IndexOutOfBoundsException("lista indexada");
        }
        if(isFull()){
            expandCapacity();
        }
        for(int j=nextLast;j>index;j--){
            array[j]=array[j-1];
        }
        array[index]=element;
        nextLast++;
    }
    /**
     * Método que remueve un elemento en un índice determinado.
     * @param index a buscar.
     * @return elemento en índice. 
     */
    @Override
    public T remove(int index){
        T element;
        if(index<0||index>size()){
            throw new IndexOutOfBoundsException("lista indexada");
        }
        element=array[index];
        for(int i=index;i<nextLast-1;i++){
            array[i]=array[i+1];
        }
        nextLast--;
        return element;
    }

    
}
