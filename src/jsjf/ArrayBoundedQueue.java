package jsjf;

import jsjf.exceptions.EmptyCollectionException;

/**
 * Define una coleccion FIFO tipo "cola enlazada".
 * @author zgarciag
 * @param <T> Tipo de datos que maneja.
 */
public final class ArrayBoundedQueue <T> implements QueueADT <T>{
    private static final int DEFAULT_CAPACITY = 100;
    
    private T [] array;
    private int nextLast;
    private int capacity;
    
    /**
     * Construye una coleccion con capacidad por default.
     */
    public ArrayBoundedQueue(){
        this(DEFAULT_CAPACITY);
    }
    
    /**
     * Construye una coleccion con la capacidad que indique el usuario.
     * @param initialCapacity Recibe la capacidad inicial con que se instanciara la cola.
     */
    public ArrayBoundedQueue(int initialCapacity){
        capacity = initialCapacity;
        clear();
    }
    
    /**
     * Método que regresa un booleano si la cola está llena.
     * @return Regresa true si la capacidad es igual al índice nextLast.
     */
    public boolean isFull(){
        return (nextLast == capacity);
    }
    
    /**
     * Agrega el elemento especificado a la colección.
     * @param element Recibe el elemento que se agregara a la cola.
     */
    @Override
    public void enqueue(T element){
        if (isFull())
            expandCapacity();
        array[nextLast] = element;
        nextLast++;
    }
    
    /**
     * Duplica la capacidad de la coleccion cuando esta se ha llenado.
     */
    private void expandCapacity(){
        T [] aux = (T[]) new Object[capacity * 2];
        System.arraycopy(array, 0, aux, 0, capacity);
        array = aux;
        capacity = array.length;
    }
    
    /**
     * Elimina el elemento correspondiente de la cola.
     * @return Regresa el elemento eliminado
     * @throws EmptyCollectionException  si está vacía.
     */
    @Override
    public T dequeue() throws EmptyCollectionException{
        T element;
        if(isEmpty())
            throw new EmptyCollectionException("cola");
        element = array[0];
        for(int i = 0; i < nextLast - 1 ; i++){
            array [i] = array [i+1];
        }
        array[nextLast-1] = null;
        nextLast--;
        return element;
    }
    
    /**
     * Borra todo el contenido de la colección.
     */
    @Override
    public final void clear(){
        nextLast = 0;
        array = (T[]) (new Object [capacity]);
    }
    
    /**
     * Indica si está vacía la colección.
     * @return Regresa verdadero si la colección está vacía.
     */
    @Override
    public boolean isEmpty(){
        return nextLast == 0;
    }
    /**
     * Regresa el elemento que se encuentra en la primera posición. El próximo en salir.
     * @return Regresa el elemento en la primer posición.
     * @throws EmptyCollectionException si está vacía.
     */
    @Override
    public T first()throws EmptyCollectionException{
        if(isEmpty())
            throw new EmptyCollectionException("Cola");
        return array[0];
    }
    /**
     * Regresa el siguiente elemento.
     * @return El elemento T.
     */
    @Override
    public T remove(){
        return dequeue();
    }
    
    /**
     * Método que añade un nuevo elemento a la cola.
     * @param element Recibe el elemento que se agregara a la cola.
     */
    @Override
    public void add(T element){
        enqueue(element);
    }

    
}
