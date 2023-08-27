package jsjf;

/**
 * Pila implementada, en la cual el pop está modificado. Si la pila está llena
 * al ingresar un nuevo dato, se eliminará el dato en la base de la pila.
 * @author zgarciag
 * @param <T> tipo de datos.
 */
public class ArrayDropOutStack<T> extends ArrayLIFO<T>{
    
    /**
     * Método que adhiere el nuevo elemento a la pila.
     * Si está llena, el elemento en la base se elimina.
     * @param element a ingresar.
     */
    @Override
    public void add(T element){
        StackADT<T> aux = new ArrayStack<>();
        if(isFull()){
            aux.add(element);
            while(!this.isEmpty())
                aux.add(this.remove());
            aux.remove();
            while(!aux.isEmpty())
                this.add(aux.remove());
        }
        else
            super.add(element);
    }
   /**
    * Método que sobreescribe el método de la superclase.
    * Regresa true si la pila está llena.
    * @return valor boolean.
    */ 
    @Override
    public boolean isFull(){
        return super.isFull();
    }
    /**
     * Método que adhiere un elemento a la pila.
     * @param element  a añadir.
     */
    @Override
    public void push(T element){
        if(isFull()){
            for(int i=0;i<nextLast-1;i++)
                array[i]=array[i+1];
            nextLast--;

        }
        super.push(element);
    }


}
