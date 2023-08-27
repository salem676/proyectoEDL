/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsjf;
import java.util.Scanner;
import jsjf.StackADT;
import jsjf.ArrayStack;
import jsjf.QueueADT;
import jsjf.ArrayQueue;
/**
 *
 * @author Zuriel
 */
public class ExamenMockB {
    
    private static void analiza(String frase) { 
        if(esPalindromo(frase)) 
        System.out.println(frase+" es un palíndromo."); 
        else 
        System.out.println(frase+" no es un palíndromo."); 
    }

    
    private static boolean esPalindromo(String frase){
        Scanner lee=new Scanner(frase);
        boolean res=false;
        StackADT<Character>arre=new ArrayStack();
        QueueADT<Character>cola=new ArrayQueue();
        frase=minSinEsp(frase);
        char var;
        for (int i = 0;i <frase.length(); i++){
            var=frase.charAt(i);
            cola.enqueue(var);
            arre.push(var);
        }
        if(igualdad(cola,arre)){
            res=true;
        }
        return res;
        
    }
    private static boolean igualdad(QueueADT c,StackADT p){
        boolean band=true;
        while(band!=false&&!p.isEmpty()){
            if(!p.pop().equals(c.dequeue())){
                band=false;
            }
        }
        return band;
    }
    private static String minSinEsp(String frase){
        frase=frase.toLowerCase();
        frase=frase.replaceAll(" ", "");
        return frase;
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
//        StackADT<String>arre=new ArrayStack();
//        QueueADT<String>cola=new ArrayQueue();
//        arre.push("1");
//        arre.push("2");
//        arre.push("1");
//        cola.enqueue("5");
//        cola.enqueue("2");
//        cola.enqueue("1");
//        System.out.println(igualdad(cola,arre));
//        String frase="1 2 1";
//        System.out.println(minSinEsp(frase));
    }

}
