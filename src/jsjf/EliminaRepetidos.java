/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsjf;

/**
 *
 * @author zgarciag
 */
public class EliminaRepetidos {
    
    public static <T> void eliminaConsecutivos(StackADT<T>pila){
        StackADT<T>pilaAux=new ArrayStack();
        if(!pila.isEmpty()){
            pilaAux.add(pila.remove());
            while(!pila.isEmpty()){
                if(pila.peek().equals(pilaAux.peek()))
                    pila.remove();
                else
                    pilaAux.add(pila.remove());
            }
        }
        while(!pilaAux.isEmpty())
                pila.add(pilaAux.remove());
    }
    
    public static <T> void elimina(QueueADT<T>cola){
        QueueADT<T>aux1=new ArrayQueue();
        QueueADT<T>aux2=new ArrayQueue();
        T bas;
        while(!cola.isEmpty()){
            aux1.enqueue(cola.first());
            aux2.enqueue(cola.dequeue());
        }
        while(!aux2.isEmpty()){
            cola.enqueue(aux2.dequeue());
        }
        while(!aux1.isEmpty()){
            aux2.enqueue(aux1.dequeue());
            while(!cola.isEmpty()){
                if(!(aux2.first().equals(cola.first()))){
                    aux2.enqueue(cola.dequeue());
                }else{
                    bas=cola.dequeue();
                }
            }
            while(!aux2.isEmpty()){
                cola.enqueue(aux2.dequeue());
            }
        }
    }
    
    public static void main(String[]args){
        StackADT<Integer>pila=new ArrayStack<>();
        QueueADT<Integer>cola=new ArrayQueue<>();
        pila.push(1);
        pila.push(1);
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(3);
        pila.push(3);
        pila.push(4);
        System.out.println(Impresion.toStringND(pila));
        eliminaConsecutivos(pila);
        System.out.println(Impresion.toStringND(pila));
        cola.enqueue(1);
        cola.enqueue(1);
        cola.enqueue(1);
        cola.enqueue(2);
        cola.enqueue(3);
        cola.enqueue(4);
        cola.enqueue(3);
        cola.enqueue(3);
        System.out.println(Impresion.toStringND(cola));
        elimina(cola);
        System.out.println(Impresion.toStringND(cola));
    }
    
    
}
