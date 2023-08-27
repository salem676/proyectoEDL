package jsjf;

/**
 *
 * @author Zuriel García.
 */
public class Materia implements Comparable<Materia>{
    
    private final String materia;
    private int calif;
    
    public Materia(String nombre){
        materia = nombre;
        calif = 0;
    }
    
    public Materia(String materia, int calif){
        this.materia = materia;
        this.calif = calif;
    }
    
    public String getMateria(){
        return materia;
    }
    
    public int getCalif(){
        return calif;
    }
    
    public void setCalif(int calif){
        this.calif = calif;
    }
    
    @Override
    public String toString(){
        return "Materia: " + materia + "    Calificación: " + calif + "\n";
    }
    
    public boolean equals(Materia otra){
        return materia.equals(otra.materia);
    }
    @Override
    public int compareTo(Materia otra){
        return calif-otra.calif;
    }
//    @Override
//    public int compareTo(Materia otra){
//        return materia.compareTo(otra.materia);
//    }
    
}
