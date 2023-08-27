package jsjf;

/**
 * Examen 2do Parcial
 * @author Enrique Valencia
 */
public class EjerciciosRecursividad {
    
    public static int suma (int [] arre){ 
        return suma(arre, arre.length-1);
    }
    
    /*
    private static int sumaRec (int [] arre, int index, int sum){ 
        if(index==arre.length)
            return sum;
        else
            return sumaRec(arre, index+1, sum + arre[index]);
    }
    */
    
    private static int suma(int [] arre, int indice){
        if(indice == 0)
            return arre[0];
        else
            return arre[indice] + suma(arre, indice-1);
    }
    
    public static <T> int busquedaSecuencial (T [] arre, T elem){
        return busquedaSecuencial(arre, elem, 0);
    }
    
    /*
    private static <T> int busquedaRec (T[] arre, T elem, int index, int pos){
        pos = -1; 
        if((index == arre.length) || pos != -1)
             return pos;
        else{
            if (elem.equals(arre[index])){
                return index;
            }
            else
                return busquedaRec(arre,elem,index+1, pos);
        }
    }
    */
    
    public static <T> int busquedaSecuencial(T [] vector, T buscado, int pos){
        if(pos == vector.length)
            return -1;
        else if ( buscado.equals(vector[pos]))
            return pos;
        else
            return busquedaSecuencial(vector, buscado, pos+1);
            
    }
    
    
    public static void main (String [] args){
        
        System.out.println("Ejercicio 1: SUMA RECURSIVA\n");
        int [] arre1 = {1,2,3,4,5};
        System.out.println(suma(arre1));
        
        System.out.println("\n\nEjercicio 2: BUSQUEDA SECUENCIAL RECURSIVA\n");
        Integer [] arre = {1,2,3,4,5};
        Integer elem = 8;
        Integer elem1 = 3;
        int res = busquedaSecuencial(arre,elem);
        int res1 = busquedaSecuencial(arre,elem1);
        System.out.println(res);
        System.out.println(res1);
        
        System.out.println("\n\nEjercicio 3: CONVIERTE BASE\n");
        //int n = 12341;
        //int base = 4;
        //res2 = convierteBase(n,base);
        //System.out.println(res2);
        
    }
    
}
