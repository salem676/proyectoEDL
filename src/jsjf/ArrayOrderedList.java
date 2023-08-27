/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsjf;

import java.util.Comparator;

/**
 * Clase que implementa una lista ordenada por medio de arreglos.
 * @author zgarciag
 * @param <T> tipo de datos a utilizar.
 */
public class ArrayOrderedList<T> extends AbstractArrayList<T> implements OrderedListADT<T>{
    private String order;
    private Comparator cmp;
    /**
     * Constructor que inicializa la variable en forma ascendente.
     * Hace una llamada a la superclase.
     * Asigna al comparador el valor nulo.
     */
    public ArrayOrderedList(){
        super();
        order="ascending";
        cmp=null;
    }
    /**
     * Constructor que inicializa la variable order para denotar el orden.
     * Llama al constructor de la superclase.
     * Asigna al comparador el valor nulo.
     * La lista es ascendente por default.
     * @param order variable a inicializar.
     */
    public ArrayOrderedList(String order){
        super();
        cmp=null;
        order=order.toLowerCase();
        if(order.equals("descending")){
            this.order=order;
        }else{
            this.order="ascending";
        }
    }
    /**
     * Método que llama al constructor de la superclase.
     * Asigna un comparador a la instancia del comparador.
     * @param cmp comparador a asignar.
     */
    public ArrayOrderedList(Comparator <T> cmp){
        super();
        this.cmp=cmp;
    }
    /**
     * Método que compara los dos elementos dados.
     * @param element a comparar.
     * @param reference con el que se comparará.
     * @return valor entero de la comparación.
     */
    private int comparaA(T element, T reference){
       int res;
       if(cmp==null){
           res=((Comparable)element).compareTo(reference);
       }else{
           res=cmp.compare(element, reference);
       }
       if(order.equals("ascending")){
           res=res*-1;
       }
       return res;
    }
    /**
     * Método que añade el elemento donde le es supuesto que debe ir.
     * @param element a agregar.
     */
    @Override
    public void add(T element){
        int i=0;
        if(isFull()){
            expandCapacity();
        }
        while(i<nextLast&&(comparaA(element,array[i]))<0){
            i++;
        }
        for(int j=nextLast;j>i;i--){
            array[j]=array[j-1];
        }
        array[i]=element;
        nextLast++;
        
    }
    /**
     * Método que adhiere un elemento a la lista.
     * Utiliza el método swap para ir intercambiando los elementos
     * a fin de encontrar su lugar dispuesto por medio del método comparaA.
     * @param element a agregar.
     */
    public void add2(T element){
        super.add(element);
        int i=nextLast-1;
        while(i>0&&comparaA(array[i],array[i-1])>0){
            swap(i,i-1);
            i--;
        }
        
    }
    /**
     * Método que intercambia dos elementos dados sus posiciones.
     * @param i índice del primero.
     * @param j índice del segundo.
     */
    private void swap(int i, int j){
        T temp1;
        temp1=array[i];
        array[i]=array[j];
        array[j]=temp1;
    }

    
}
