/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsjf;

import java.util.Iterator;
import java.util.Random;
import jsjf.exceptions.ElementNotFoundException;
import jsjf.exceptions.EmptyCollectionException;

/**
 *
 * @author Zuriel
 * @param <T> datos a utilizar.
 */
public class HashSet<T> implements SetADT<T> {
    private LinkedIndexedList<T>[]table;
    private final static int SIZE=20;
    private int count;
    private Random rand=new Random();
   
   public HashSet(){
       clear();
   }
    @Override
   public void clear(){
       table=new LinkedIndexedList[SIZE];
       for(int i=0;i<SIZE;i++){
           table[i]=new LinkedIndexedList<>();
       }
       count=0;
   }
    @Override
   public boolean isEmpty(){
       return size()==0;
   }
    @Override
   public int size(){
       return count;
   }
   private int indexOf(T element){
       return element.hashCode()%SIZE;
   }

    @Override
     public T remove(T element) throws EmptyCollectionException, ElementNotFoundException {
         if (isEmpty()) {
             throw new EmptyCollectionException("");
         }
         if(!contains(element)) {
             throw new ElementNotFoundException("");
         }
         return table[indexOf(element)].remove(element);
     }   
     
    @Override
     public T remove() throws EmptyCollectionException {
         if (isEmpty()) {
             throw new EmptyCollectionException("");
         }
         int position = rand.nextInt(SIZE);
         while(table[position].isEmpty()) {
             position = (position + 1) % SIZE;
         }
         return table[position].remove();
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


    @Override
    public boolean contains(T element) {
        return table[indexOf(element)].contains(element);
    }


    @Override
    public void add(T element) {
        if(!contains(element)){
            table[indexOf(element)].add(element);
            count++;
        }
    }
    @Override
    public String toString(){
        StringBuilder cad=new StringBuilder();
        for(T element:this){
            cad.append(element).append("\n");
        }
        return cad.toString();
    }
    public String toStringIt(){
        StringBuilder sb=new StringBuilder();
        Iterator it=this.iterator();
        while(it.hasNext()){
            sb.append(it.next()+"\n");
        }
        return sb.toString();
    }

    @Override
    public Iterator<T> iterator() {
        HashSetIterator iterator=new HashSetIterator(table,size());
        return iterator;
    }
    
    public static void main (String args[]){
        HashSet hash=new HashSet();
        hash.add("1");
        hash.add("2");
        hash.add("3");
        hash.add("4");
        hash.add("5");
        hash.add("6");
        hash.add("7");
        hash.add("8");
        hash.add("9");
        hash.add("10");
        hash.add("11");
        HashSet hash2=new HashSet();
        hash.add("1");
        hash.add("2");
        hash.add("3");
        hash.add("4");
        hash.add("5");
        hash.add("6");
        hash.add("7");
        hash.add("8");
        hash.add("9");
        hash.add("10");
        hash.add("11");
     
        System.out.println(hash.iterator().next());
        System.out.println(hash.iterator().hasNext());
        System.out.println(hash.iterator().next());
        System.out.println(hash.iterator().hasNext());
        System.out.println(hash.iterator().next());
        System.out.println(hash.iterator().hasNext());
//        System.out.println(hash.equals(hash2));

    }

}
