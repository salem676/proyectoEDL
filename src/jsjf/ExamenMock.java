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
public class ExamenMock {
    public static void main(String args[]) { 

        StackADT<Integer> pila=new ArrayStack<>(); 

        pila.push(new Integer(7)); 
        pila.push(new Integer(4)); 
        pila.push(new Integer(6)); 
        pila.push(new Integer(5)); 
        pila.push(new Integer(8)); 

        int cuantos = cuentaImparesPila(pila);
        System.out.println("La pila tiene "+ cuantos +" impares."); 

        System.out.print("Los datos en la pila son: "); 
        // El siguiente ciclo debería imprimir 8 5 6 4 7, en ese orden: 
        while(!pila.isEmpty()) 
        System.out.print(pila.pop()+" "); 
        System.out.println(""); 
}

    private static int cuentaImparesPila(StackADT<Integer> pila) {
        int cont=0;
        int var;
        StackADT<Integer>temp=new ArrayStack();
        while(!pila.isEmpty()){
            var=pila.pop();
            if(var%2!=0){
                cont++;
            }
            temp.push(var);
        }
        while(!temp.isEmpty()){
            pila.push(temp.pop());
        }
        return cont;
    }

    
}
