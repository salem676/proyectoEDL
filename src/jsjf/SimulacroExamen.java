package jsjf;

import jsjf.ArrayQueue;
import jsjf.ArraySet;
import jsjf.ArrayStack;
import jsjf.ArrayDropOutStack;
import jsjf.QueueADT;
import jsjf.StackADT;

/**
 * Clase que incluye ejercicios de repaso para el Examen(1er Parcial).
 * @author EVALENCIC
 */
public class SimulacroExamen<T> {
    
    public static int cuentaImparesPila(ArrayStack<Integer> pila){
        StackADT<Integer> aux = new ArrayStack<>();
        int cont = 0;
        int dato;
        if(!pila.isEmpty())
            while(!pila.isEmpty()){
                dato = pila.remove();
                aux.add(dato);
                if(dato%2 != 0)
                    cont++;
            }
        while(!aux.isEmpty())
            pila.add(aux.remove());
        return cont;
    }
    
    public static boolean esPalindromo(String cadena){
        boolean res = true;
        StackADT<Character> pila = new ArrayStack<>();
        QueueADT<Character> cola = new ArrayQueue<>();
        cadena = cadena.replaceAll(" ", "");
        cadena = cadena.toLowerCase();
        char dato;
        for(int i = 0; i < cadena.length(); i++){
            dato = cadena.charAt(i);
            pila.add(dato);
            cola.add(dato);
        }
        while((!pila.isEmpty()) && res)
            if(!pila.remove().equals(cola.remove()))
                res = false;
        return res;
    }
    
    public static <T> void sinFondo(ArrayStack<T> pila, T element, int n){
        int i=0;
        StackADT<T> aux = new ArrayStack<>();
        if(!pila.isEmpty())
            while(!pila.isEmpty()){
                i++;
                aux.add(pila.remove());
            }
        if(i == n){
            aux.remove();
            while(!aux.isEmpty())
                pila.add(aux.remove());
            pila.add(element);
        }
        else
            while(!aux.isEmpty())
                pila.add(aux.remove());
    }
    
    private static void analiza(String frase) { 
        if(esPalindromo(frase)) 
            System.out.println(frase+" es un palíndromo."); 
        else 
            System.out.println(frase+" no es un palíndromo."); 
    }
    
    public static <T> String toStringND(LinearCollectionADT<T> coleccion){
        StringBuilder resul = new StringBuilder();
        LinearCollectionADT<T> aux;
        T dato;
        if(coleccion instanceof StackADT)
            aux = new ArrayStack();
        else
            if(coleccion instanceof QueueADT)
                aux = new ArrayQueue();
            else
                aux = new ArraySet();
        while(!coleccion.isEmpty()){
            dato = coleccion.remove();
            aux.add(dato);
            resul.append(dato);
        }
        while(!aux.isEmpty())
            coleccion.add(aux.remove());
        return resul.toString();
    }
    
    public static <T> AbstractArrayLinearCollection eliminaRepetidos(AbstractArrayLinearCollection<T> coleccion){
        if(!coleccion.isEmpty())
            if(coleccion instanceof ArrayStack){
                eliminaRepPila((ArrayStack<T>) coleccion);
            }
            else{
                eliminaRepCola((ArrayQueue<T>)coleccion);
            }    
        return coleccion;
    }
    
    public static<T> String invierteCadena(String cad){
        StackADT<Character> pila = new ArrayStack<>();
        StringBuilder resp = new StringBuilder();
        int tam = cad.length();
        char dato;
        for(int i = 0; i < tam; i++){
            dato = cad.charAt(i);
            pila.add(dato);
        }
        for(int j = 0; j < tam; j++){
            dato = pila.remove();
            resp.append(dato);
        }
        return resp.toString();
    }
    
    public static<T> int cuentaPila(ArrayStack<T> pila){
        StackADT<T> aux = new ArrayStack<>();
        int cont = 0;
        if(!pila.isEmpty()){
            while(!pila.isEmpty()){
                aux.add(pila.remove());
                cont++;
            }
            while(!aux.isEmpty()){
                pila.add(aux.remove());
            }
        }
        return cont;
    }

    public static<T> boolean contiene(ArrayStack<T> p1, ArrayStack<T> p2){
        StackADT<T> aux = new ArrayStack<>();
        boolean resp = true;
        T dato;
        if(!p1.isEmpty() && !p2.isEmpty()){
            while(!p2.isEmpty() && resp){
                dato = p2.remove();
                aux.add(dato);
                if(!find(p1,dato)){
                    resp = false;
                }
            }
            while(!aux.isEmpty())
                p2.add(aux.remove());
        }
        return resp;
    }
    
    public static <T> boolean find(ArrayStack<T> pila, T element){
        StackADT<T> aux = new ArrayStack<>();
        boolean resp = true;
        if(!pila.isEmpty()){
            while(!pila.isEmpty() && !element.equals(pila.peek()))
                aux.add(pila.remove());
            if(pila.isEmpty())
                resp = false;
        }
        while(!aux.isEmpty())
            pila.add(aux.remove());
        return resp;
    }
    
    public static<T> void inviertePila(ArrayStack<T> pila){
        QueueADT<T> cola = new ArrayQueue<>();
        while(!pila.isEmpty())
            cola.add(pila.remove());
        while(!cola.isEmpty())
            pila.add(cola.remove());
    }
    
    public static<T> void invierteCola(ArrayQueue<T> cola){
        StackADT<T> pila = new ArrayStack<>();
        while(!cola.isEmpty())
            pila.add(cola.remove());
        while(!pila.isEmpty())
            cola.add(pila.remove());
    }
    
    public static<T> void eliminaRepCola(ArrayQueue<T> cola){
        StackADT<T> aux = new ArrayStack<>();
        StackADT<T> aux2 = new ArrayStack<>();
        if(!cola.isEmpty()){
            aux.add(cola.remove());
            while(!cola.isEmpty()){
               if(aux.peek().equals(cola.first()))
                   cola.remove();
               else
                   aux.add(cola.remove());
            }
            while(!aux.isEmpty())
                aux2.add(aux.remove());
            while(!aux2.isEmpty())
                cola.add(aux2.remove());
        }
    }
    
    public static <T> void eliminaRepPila(ArrayStack<T> pila){
        StackADT<T> aux = new ArrayStack<>();
        if(!pila.isEmpty()){
            aux.add(pila.remove());
            while(!pila.isEmpty()){
                if(aux.peek().equals(pila.peek()))
                    pila.remove();
                else
                    aux.add(pila.remove());
            }   
            while(!aux.isEmpty())
                pila.add(aux.remove());
        }
    }
    
    public static void main(String args[]) { 

        StackADT<Integer> pila = new ArrayStack<>();

        pila.add(7); 
        pila.add(4); 
        pila.add(6); 
        pila.add(5); 
        pila.add(8); 

        System.out.println("EJERCICIO 1: \n");
        
        int cuantos = cuentaImparesPila((ArrayStack<Integer>) pila);
        System.out.println("La pila tiene "+ cuantos +" impares."); 

        System.out.print("Los datos en la pila son: "); 
        // El siguiente ciclo debería imprimir 8 5 6 4 7, en ese orden: 
        while(!pila.isEmpty()) 
            System.out.print(pila.pop()+" "); 
        System.out.println(""); 
        
        System.out.println("\n\nEJERCICIO 2: \n");
        
        String frase="Anita lava la tina"; 		// Sí es palíndromo. 
        analiza(frase); 
        frase="123"; 					// No es palíndromo. 
        analiza(frase); 
        frase="aba"; 					// Sí es palíndromo. 
        analiza(frase); 
        frase="abba"; 					// Sí es palíndromo. 
        analiza(frase); 
        frase="Anatawa buta mitaini taberu"; 	// No es palíndromo. 
        analiza(frase); 
        frase="xxmnzz"; 					// No es palíndromo. 
        analiza(frase); 
        frase="a aa"; 					// Sí es palíndromo. 
        analiza(frase); 

        System.out.println("\n\nEJERCICIO 3: \n");
        
        StackADT<Integer> pilaSF = new ArrayStack<>(5);
        
        pilaSF.add(1);
        pilaSF.add(2);
        pilaSF.add(3);
        pilaSF.add(4);
        pilaSF.add(5);
        System.out.println(toStringND(pilaSF));
        sinFondo((ArrayStack<Integer>)pilaSF,6,5);
        System.out.println(toStringND(pilaSF));
        sinFondo((ArrayStack<Integer>)pilaSF,7,5);
        System.out.println(toStringND(pilaSF));
        
        System.out.println("\n\nEJERCICIO 4: \n");
        
        StackADT<Integer> pilaSR = new ArrayStack<>();
        
        pilaSR.add(1);
        pilaSR.add(2);
        pilaSR.add(3);
        pilaSR.add(3);
        pilaSR.add(3);
        pilaSR.add(4);
        pilaSR.add(4);
        pilaSR.add(5);
        pilaSR.add(6);
        pilaSR.add(7);
        System.out.println("Pila con repetidos: " + toStringND(pilaSR));
        eliminaRepetidos((ArrayStack<Integer>)pilaSR);
        System.out.println("Pila sin repetidos: " + toStringND(pilaSR));
        
        QueueADT<Integer> colaSR = new ArrayQueue<>();
        
        colaSR.add(1);
        colaSR.add(2);
        colaSR.add(3);
        colaSR.add(3);
        colaSR.add(3);
        colaSR.add(4);
        colaSR.add(4);
        colaSR.add(5);
        colaSR.add(6);
        colaSR.add(7);
        System.out.println("Cola con repetidos: " + toStringND(colaSR));
        eliminaRepetidos((ArrayQueue<Integer>)colaSR);
        System.out.println("Cola sin repetidos: " + toStringND(colaSR));
        
        System.out.println("\n\nEJERCICIO 5: \n");
        
        ArrayDropOutStack<Integer> pilaDOAS = new ArrayDropOutStack<>();
        
        pilaDOAS.add(1);
        pilaDOAS.add(2);
        pilaDOAS.add(3);
        pilaDOAS.add(4);
        pilaDOAS.add(5);
        System.out.println(toStringND(pilaDOAS));
        pilaDOAS.add(6);
        System.out.println(toStringND(pilaDOAS));
        pilaDOAS.add(7);
        System.out.println(toStringND(pilaDOAS));
        
        System.out.println("\n\nEJERCICIO 6: \n");
        
        System.out.println("Cadena Inicial: " + "abcdefghi");
        
        System.out.println("Cadena Invertida: " + invierteCadena("abcdefghi"));
        
        System.out.println("\n\nEJERCICIO 7: \n");
        
        StackADT<Integer> pilaCuenta = new ArrayStack<>();
        
        int elem;
        

        pilaCuenta.add(7); 
        pilaCuenta.add(4); 
        pilaCuenta.add(6); 
        pilaCuenta.add(5); 
        pilaCuenta.add(8); 
        
        elem = cuentaPila((ArrayStack<Integer>) pilaCuenta);
        System.out.println("La pila tiene "+ elem +" elementos.");
        
        System.out.println("\n\nEJERCICIO 8: \n");
        
        StackADT<Integer> p1 = new ArrayStack<>(5);
        
        p1.add(1);
        p1.add(2);
        p1.add(3);
        p1.add(4);
        p1.add(5);
        p1.add(6);
        p1.add(7);
        
        StackADT<Integer> p2 = new ArrayStack<>(5);
        
        
        p2.add(2);
        p2.add(4);
        p2.add(10);
        
        System.out.println(contiene((ArrayStack<Integer>)p1,(ArrayStack<Integer>)p2));
        
        System.out.println("\n\nEJERCICIO 9: \n");
        
        StackADT<Integer> pilaIN = new ArrayStack<>();
        
        pilaIN.add(1);
        pilaIN.add(2);
        pilaIN.add(3);
        pilaIN.add(3);
        pilaIN.add(3);
        pilaIN.add(4);
        pilaIN.add(4);
        pilaIN.add(5);
        pilaIN.add(6);
        pilaIN.add(7);
        System.out.println("Pila inicial: " + toStringND(pilaIN));
        inviertePila((ArrayStack<Integer>)pilaIN);
        System.out.println("Pila invertida: " + toStringND(pilaIN));
        
        System.out.println("\n\nEJERCICIO 10: \n");
        
        QueueADT<Integer> colaIN = new ArrayQueue<>();
        
        colaIN.add(1);
        colaIN.add(2);
        colaIN.add(3);
        colaIN.add(3);
        colaIN.add(3);
        colaIN.add(4);
        colaIN.add(4);
        colaIN.add(5);
        colaIN.add(6);
        colaIN.add(7);
        System.out.println("Cola inicial: " + toStringND(colaIN));
        invierteCola((ArrayQueue<Integer>)colaIN);
        System.out.println("Cola invertida: " + toStringND(colaIN));
        
        System.out.println("\n\nEJERCICIO 11: \n");
        
        QueueADT<Integer> colaSR1 = new ArrayQueue<>();
        
        colaSR1.add(1);
        colaSR1.add(2);
        colaSR1.add(3);
        colaSR1.add(3);
        colaSR1.add(3);
        colaSR1.add(4);
        colaSR1.add(4);
        colaSR1.add(5);
        colaSR1.add(6);
        colaSR1.add(7);
        System.out.println("Cola con repetidos: " + toStringND(colaSR1));
        eliminaRepCola((ArrayQueue<Integer>)colaSR1);
        System.out.println("Cola sin repetidos: " + toStringND(colaSR1));
        
        System.out.println("\n\nEJERCICIO 12: \n");
        
        StackADT<Integer> pilaSR1 = new ArrayStack<>();
        
        pilaSR1.add(1);
        pilaSR1.add(2);
        pilaSR1.add(3);
        pilaSR1.add(3);
        pilaSR1.add(3);
        pilaSR1.add(4);
        pilaSR1.add(4);
        pilaSR1.add(5);
        pilaSR1.add(6);
        pilaSR1.add(7);
        System.out.println("Pila con repetidos: " + toStringND(pilaSR1));
        eliminaRepPila((ArrayStack<Integer>)pilaSR1);
        System.out.println("Pila sin repetidos: " + toStringND(pilaSR1));
        
        System.out.println("\n\nEJERCICIO 13: \n");
        
        StackADT<Integer> p = new ArrayStack<>(5);
        
        p.add(1);
        p.add(2);
        p.add(3);
        p.add(4);
        p.add(5);
        p.add(6);
        p.add(7);
        
        System.out.println("Pila: " + toStringND(p));
        System.out.println(find((ArrayStack<Integer>)p, 11));
    }
}
