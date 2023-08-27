package jsjf;

/**
 * Clase abstracta de la cual heredan todas las clases que utilicen colecciones lineales.
 * @author zgarciag
 * @param <T> Tipo de objetos que maneja.
 */
public abstract class AbstractArrayLinearCollection<T> {
    
    private final static int DEFAULT_CAPACITY=100;
    protected int nextLast;
    protected T[] array;
    protected int capacity;
    
    /**
     * Crea una pila vacía utilizando la capacidad default.
     */
    public AbstractArrayLinearCollection(){
        this(DEFAULT_CAPACITY);
    }
    /**
     * Crea una pila vacía utilizando una capacidad dada.
     * @param initialCapacity capacidad inicial a ingresar.
     */
    public AbstractArrayLinearCollection(int initialCapacity){
        capacity=initialCapacity;
        clear();
    }
    /**
     * Vacía la pila.
     */
    public final void clear(){
        nextLast=0;
        array=(T[])(new Object[capacity]);
    }
    /**
     * Método size que regresa el tamaño de la colección.
     * @return valor entero tamaño.
     */
    protected int size(){
        return nextLast;
    }
    /**
     * Estamos implementando el método isEmpty que decía la interfaz.
     * @return valor boolean si está vacío.
     */
    public boolean isEmpty(){
        return nextLast==0;
    }
    /**
     * Implementando un método que retorna si el stack está lleno.
     * @return valor boolean si está lleno.
     */
    public boolean isFull(){
        return nextLast==capacity;
    }
    /**
     * Método que añade un nuevo objeto a la pila.
     * @param element a añadir.
     */
    public void add(T element){
        if(isFull())
            expandCapacity();
        array[nextLast]=element;
        nextLast++;
    }
    /**
     * Método que expande la capacidad.
     */
    protected void expandCapacity(){
        T[]aux=(T[])new Object[capacity*2];
        System.arraycopy(array,0,aux,0,capacity);
        array=aux;
        capacity=array.length;
    }


}
