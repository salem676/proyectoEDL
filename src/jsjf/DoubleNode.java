/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsjf;

/**
 * Clase nodo doble que se implementa mediante otros dos nodos last y next y un elemento T.
 * @author Zuriel García García.
 * @param <T> datos a usar.
 */
public class DoubleNode<T> {
    private DoubleNode<T> last;
    private DoubleNode<T> next;
    private T element;
    /**
     * Constructo que inicializa en null los apuntadores last y next, y al elemento con el parámetro.
     * @param element a ingresar.
     */
    public DoubleNode(T element){
        last=null;
        next=null;
        this.element=element;
    }
    /**
     * Constructor que inicializa en nulo.
     */
    public DoubleNode(){
        last=null;
        next=null;
        element=null;
    }
    /**
     * Método setElement que da un parámetro al elemento.
     * @param element a añadir.
     */
    public void setElement(T element){
        this.element=element;
    }
    /**
     * Método que regresa el elemento del nodo.
     * @return el elemento.
     */
    public T getElement(){
        return element;
    }
    /**
     * Método que regresa el nodo anterior
     * @return nodo last.
     */
    public DoubleNode<T>getAnterior(){
        return last;
    }
    /**
     * Método que hace set al nodo anterior
     * @param last es a donde apuntará.
     */
    public void setAnterior(DoubleNode<T> last){
        this.last=last;
    }
    /**
     * Método getSiguiente que regresa el siguiente nodo.
     * @return el nodo siguiente.
     */
    public DoubleNode<T>getSiguiente(){
        return next;
    }
    /**
     * Método que hace set al apuntador siguiente.
     * @param next al que apuntará.
     */
    public void setSiguiente(DoubleNode<T>next){
        this.next=next;
    }
    /**
     * Método String que imprime los nodos empezando por delante.
     * @return String del nodo.
     */
    public String toStringF(){
        if(next==null){
            return toString();
        }else{
            return toString()+" "+next.toString();
        }
    }
    /**
     * Método que regresa un string del nodo.
     * @return String nodo.
     */
    @Override
    public String toString(){
        if(element==null){
            return "";
        }
        return element.toString();
    }
    /**
     * Método que imprime en reversa los nodos.
     * @return String de los nodos.
     */
    public String toStringB(){
        if(getAnterior()==null){
            return toString();
        }else{
            return getElement().toString()+" "+getAnterior().toString();
        }
    }
    /**
     * Método que revisa si el nodo es igual a otro por medio de elemento.
     * @param other otro nodo a comparar.
     * @return valor boolean.
     */
    public boolean equals(DoubleNode<T> other){
        return element.equals(other.element);
    }
}
