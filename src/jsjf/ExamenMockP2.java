/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsjf;

import java.util.Scanner;
import static oracle.jrockit.jfr.events.Bits.charValue;

/**
 *
 * @author zgarciag
 */
public class ExamenMockP2 {
    
    private static void analiza(String frase) { 
        if(esPalindromo(frase)) 
        System.out.println(frase+" es un palíndromo."); 
        else 
        System.out.println(frase+" no es un palíndromo."); 
    }

    public static void main(String s[]) { 
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
    } 

    private static boolean esPalindromo(String frase) {
        boolean res=true;
        boolean band=true;
        char part;
        char a,b;
        QueueADT<Character>cola=new ArrayQueue();
        StackADT<Character>pila=new ArrayStack();
        frase=frase.toLowerCase();
        frase=frase.replaceAll(" ", "");


        for (int i = 0;i <frase.length(); i++){
            part=frase.charAt(i);
            cola.enqueue(part);
            pila.push(part);
        }
        while(!cola.isEmpty()||band==true){
            a=cola.dequeue();
            b=pila.pop();
            if(charValue(a)!=charValue(b)){
                res=false;
                band=false;
            }
        }
        return res;
    }

    
}
