/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsjf;
import java.util.Iterator;

/**
 * Clase que implementa una colección lineal abstracta por medio de arreglos.
 * Extiende a AbstractArrayLinearCollection.
 * Nota: no es necesario implementar a iterable, pero si se quiere utilizar el for each, debe implementar.
 * @author zgarciag
 * @param <T> datos a utilizar.
 */
public abstract class AbstractArrayLinearCollectionIterable<T> extends AbstractArrayLinearCollection<T> {
    protected final int NOT_FOUND=-1;
    /**
     * Método que regresa el tamaño de la colección
     * por medio de el método homólogo en súper.
     * @return entero tamaño.
     */
    @Override
    public int size(){
        return super.size();
    }
    /**
     * Método que convierte a un string los elementos de la colección.
     * @return cadena String.
     */
    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<nextLast;i++){
            sb.append(array[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
    /**
     * Regresa el índice del elemento especificado.
     * @param element a buscar.
     * @return entero índice.
     */
    protected int indexOf(T element){
        int i=0,pos;
        while(i<nextLast&&!array[i].equals(element)){
            i++;
        }
        if(i>=nextLast){
            pos=NOT_FOUND;
        }else{
            pos=i;
        }
        return pos;
    }
    /**
     * Método que regresa un valor booleano si se contiene al elemento.
     * Hace una llamada al método indexOf.
     * @param element a buscar.
     * @return valor boolean.
     */
    public boolean contains(T element){
        return indexOf(element)!=NOT_FOUND;
    }
    /**
     * Método que regresa un iterador.
     * utiliza las variablea array y nextLast;
     * @return iterador.
     */
    public Iterator<T> iterator(){
        return new ArrayIterator(array,nextLast);
    }
    
}
