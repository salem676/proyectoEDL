/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsjf;

/**
 * Clase conjuntos algebráicos en los cuales es posible realizar ciertas operaciones.
 * Hereda de la clase ArraySet e implementa la interface SetADT.
 * @author Zuriel García
 * @param <T> tipo de datos a utilizar.
 */
public class ArrayAlgebraicSet<T> extends ArraySet<T> implements SetADT<T> {
    public ArrayAlgebraicSet(){
        super();
    }
    /**
     * Método de unión de conjuntos.
     * Crea un nuevo conjunto por medio de el conjunto y un parametro otro.
     * @param otro el otro conjunto a agregar.
     * @return nuevo conjunto.
     */
    @Override
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
     * @param otro conjunto a intersectar
     * @return un nuevo conjunto itersecado.
     */
    @Override
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
     * @param otro conjunto a restar.
     * @return Un nuevo conjunto resta.
     */
    @Override
    public SetADT<T>resta(SetADT<T>otro){
        SetADT<T>nuevo=new ArraySet();
        for(T i:this){
            if(!otro.contains(i))
                nuevo.add(i);
        }
        return nuevo;
    }
}
