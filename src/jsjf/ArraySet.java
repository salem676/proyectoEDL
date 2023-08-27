/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsjf;
import java.util.Iterator;
import java.util.Random;
import jsjf.exceptions.EmptyCollectionException;
import jsjf.exceptions.ElementNotFoundException;
/**
 * Clase que implementa mediante arreglos una estructura conjunto.
 * @author zgarciag
 * @param <T> tipo de datos utilizado.
 */
public class ArraySet<T> extends AbstractArrayLinearCollection<T> implements SetADT<T>  {
    private final static int NOT_FOUND=-1;
    /**
     * Constructor que llama a la superclase.
     */
    public ArraySet(){
        super();
    }
    /**
     * Método que remueve un elemento al azar del conjunto.
     * @return elemento tipo T.
     * @throws EmptyCollectionException si el conjunto es vacío. 
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
    /**
     * Método que remueve un elemento especificado.
     * @param element tipo T.
     * @return el elemento especificado.
     * @throws ElementNotFoundException si no se encuentra el elemento.
     * @throws EmptyCollectionException  si el conjunto está vacío.
     */
    @Override
    public T remove(T element)throws ElementNotFoundException,EmptyCollectionException{
        if(!isEmpty()){
            if(contains(element)){
                int indice=find(element);
                T var=array[indice];
                array[indice]=null;
                nextLast--;
                return var;
            }else{
                throw new ElementNotFoundException("Conjunto");
            }
        }else{
            throw new EmptyCollectionException("Conjunto");
        }
        
    }
    /**
     * Método que regresa un valor boolean si se contiene el elemento.
     * @param element para revisar que pertenezca al conjunto.
     * @return valor boolean.
     */
    @Override
    public boolean contains(T element) {
        boolean res=false;
        int i=find(element);
        if(i!=NOT_FOUND){
            res=true;
        }
        return res;
    }
    /**
     * Método que regresa el tamaño del conjunto.
     * @return valor entero.
     */
    @Override
    public int size() {
        return nextLast;
    }
    /**
     * Método que regresa el índice del elemento especificado.
     * @param element a buscar.
     * @return valor entero del índice del elemento.
     */
    public int find(T element){
        int scan=0;
        int result=NOT_FOUND;
        if(!isEmpty())
            while(result==NOT_FOUND&&scan<nextLast){
                if(element.equals(array[scan]))
                    result=scan;
                else
                    scan++;
            }
        return result;
    }
    /**
     * Método que añade un elemento al conjunto.
     * Utiliza el método de la superclase.
     * @param element T a añadir.
     */
    @Override
    public void add(T element){
        if(!contains(element)){
            super.add(element);
        }
    }
    /**
     * Método de unión de conjuntos.
     * Crea un nuevo conjunto por medio de el conjunto y un parametro otro.
     * @param otro el otro conjunto a agregar.
     * @return nuevo conjunto.
     */
    public SetADT<T> union(SetADT<T>otro){
        SetADT<T> nuevo=new ArraySet();
        for(T i: otro){
       
            nuevo.add(i);
        }
        for(T j:this){
            nuevo.add(j);
        }
        return nuevo;
    }
    /**
     * Mètodo que intersecta dos conjuntos.
     * @param otro con el que se intersecará
     * @return regresa conjunto intersecado.
     */
    public SetADT<T> intersection(SetADT<T>otro){
        SetADT<T> nuevo=new ArraySet();
        for(T i:otro){
            if(this.contains(i))
                nuevo.add(i);
        }
        for(T i:this){
            if(otro.contains(i)){
                nuevo.add(i);
            }
        }
        return nuevo;
    }
    /**
     * Mètodo que resta los elementos de uno a otro.
     * @param otro conjunto con el que se restará.
     * @return conjunto restado.
     */
    public SetADT<T>resta(SetADT<T>otro){
        SetADT<T>nuevo=new ArraySet();
        for(T i:this){
            if(!otro.contains(i))
                nuevo.add(i);
        }
        return nuevo;
    }
    /**
     * Método equals regresa boolean a si los conjuntos son iguales.
     * @param otro es el conjunto a comparar.
     * @return boolean si son iguales.
     */
    @Override
    public boolean equals(SetADT<T> otro){
        boolean res=true;
        Iterator<T>it=otro.iterator();
        T element;
        if(otro.size()==size()){
            while(it.hasNext()&&res){
                element=it.next();
                System.out.println(element);
                if(!contains(element))
                    res=false;
            }
        }
        else
            res=false;
        return res;
    }

    /**
     * Método Iterator que regresa un iterador con el arreglo y tamaño del conjunto.
     * @return un iterador.
     */
    @Override
    public Iterator<T> iterator() {
       return new ArrayIterator(array,size());
    }
    
    
    
    
}
