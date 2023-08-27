package jsjf;

import jsjf.exceptions.ElementNotFoundException;



/**
 *
 * @author Enrique Valencia
 */
public class Alumno implements Comparable<Alumno>{
    
    private String nombre;
    private final ArrayIndexedList<Materia> listaMaterias;
    private static int clave = 110000;
    private final int claveUnica;
    
    public Alumno(String nombre){
        clave++;
        claveUnica = clave;
        this.nombre = nombre;
        listaMaterias = new ArrayIndexedList();
    }
    
    public void cambiaNombre(String nuevo){
        nombre = nuevo;
    }
    
    public void altaMateria(Materia alta){
        if(!listaMaterias.contains(alta))
            listaMaterias.add(alta);
    }
    
    public Materia bajaMateria(Materia baja){
        Materia res = null;
        if (listaMaterias.contains(baja))
            res = listaMaterias.remove(baja);
        return res;
    }
    
    public double getPromedio(){
        double cont = 0;
        for(int i = 0; i < listaMaterias.size(); i++)
            cont = cont + listaMaterias.get(i).getCalif();
        return cont / listaMaterias.size();
    }
    
    public Materia getMateria(Materia mat) throws ElementNotFoundException{
        Materia res;
        int index;
        if(!listaMaterias.contains(mat))
            throw new ElementNotFoundException("Materia");
        else{
            index = listaMaterias.indexOf(mat);
            res = listaMaterias.get(index);
        }
        return res;
    }
    
    @Override
    public int compareTo(Alumno otro){
        return claveUnica - otro.claveUnica;
    }
    
    public boolean equals(Alumno otro){
        return claveUnica == otro.claveUnica;
    }
    
    @Override
    public String toString(){
        return "\nAlumno: " + nombre + "    Clave Única: " + claveUnica + "\n"  + "\n" + listaMaterias.toString() + "\n";
    }
}
