/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsjf;



/**
 *
 * @author ZGARCIAG
 */
public class Impresion {
    private static void llenaColeccion(LinearCollectionADT col){
        for(int i=0;i<5;i++){
            col.add(i);
        }
    }
    private static String toStringD(LinearCollectionADT col){
        StringBuilder sb=new StringBuilder();
        while(!col.isEmpty())
            sb.append(col.remove());
        return sb.toString();
    }
    static<T> String toStringND(LinearCollectionADT<T> col){
        LinearCollectionADT<T> aux;
        StringBuilder sb=new StringBuilder();
        T var;
        if(col instanceof StackADT){
            aux=new ArrayStack();
        }else{
            if(col instanceof QueueADT){
                aux=new ArrayCircularQueue();
            }else{
                aux=new ArraySet();
            }
        }
        
        while(!col.isEmpty()){
            var=col.remove();
            sb.append(var);
            aux.add(var);
        }
        while(!aux.isEmpty()){
            col.add(aux.remove());
        }
        return sb.toString();
    }

    public static void main(String args[]){
        StackADT<Integer> arre=new ArrayStack();
        QueueADT<Integer> cola=new ArrayCircularQueue();
        SetADT<Integer>conjunto=new ArraySet();
        llenaColeccion(arre);
        System.out.println("pila:"+toStringD(arre));
        llenaColeccion(cola);
        System.out.println("cola:"+toStringD(cola));
        llenaColeccion(conjunto);
        System.out.println("conjunto:"+toStringND(conjunto));
        System.out.println("conjunto:"+toStringD(conjunto));

    }
    
}
