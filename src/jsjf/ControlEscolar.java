package jsjf;

import jsjf.exceptions.ElementNotFoundException;

/**
 *
 * @author Zuriel García
 */
public class ControlEscolar {
    
    private ArrayIndexedList<Alumno> listaAlumnos;
    
    public ControlEscolar(){
        listaAlumnos = new ArrayIndexedList<>();
    }
    
    public ControlEscolar(ArrayIndexedList<Alumno> listaAlumnos){
        this.listaAlumnos = listaAlumnos;
    }
    
    public void altaAlumno(Alumno alta){
        if(!listaAlumnos.contains(alta))
            listaAlumnos.add(alta);
    }
    
    public Alumno bajaAlumno(Alumno baja){
        Alumno res = null;
        if(listaAlumnos.contains(baja))
             listaAlumnos.remove(baja);
        return res;
    }
    
    public Alumno getAlumno(Alumno al) throws ElementNotFoundException{
        int index;
        Alumno res;
        if(!listaAlumnos.contains(al))
            throw new ElementNotFoundException("Element");
        else{
            index = listaAlumnos.indexOf(al);
            res = listaAlumnos.get(index);
        }
        return res;
    }
    
    @Override
    public String toString(){
        return listaAlumnos.toString();
    }
    
    public static void main (String [] args){
        Alumno a1 = new Alumno("Hugo");
        Alumno a2 = new Alumno("Paco");
        Alumno a3 = new Alumno("Luis");
        Materia m1 = new Materia("Economía", 7);
        Materia m2 = new Materia("Historia", 10);
        Materia m3 = new Materia("Ética", 5);
        Materia m4 = new Materia("Economía", 9);
        Materia m5 = new Materia("Historia", 9);
        Materia m6 = new Materia("Ética", 9);
        Materia m7 = new Materia("Economía", 7);
        Materia m8 = new Materia("Historia", 6);
        Materia m9 = new Materia("Ética", 10);
        a1.altaMateria(m3);
        a1.altaMateria(m2);
        a1.altaMateria(m1);
        a2.altaMateria(m6);
        a2.altaMateria(m5);
        a2.altaMateria(m4);
        a3.altaMateria(m9);
        a3.altaMateria(m8);
        a3.altaMateria(m7);
        ControlEscolar ce = new ControlEscolar();
        System.out.println("SE DAN DE ALTA CUATRO ALUMNOS(SI ALGUNO EXISTE,YA NO LO AGREGA)");
        ce.altaAlumno(a1);
        ce.altaAlumno(a2);
        ce.altaAlumno(a3);
        ce.altaAlumno(a1);
        System.out.println(ce);
        System.out.println("SE DAN DE BAJA A UN ALUMNO");
        ce.bajaAlumno(a2);
        System.out.println(ce);
        System.out.println("SE CAMBIA LA CALIFICACIÓN DE UNA MATERIA DE UN ALUMNO");
        ce.getAlumno(a1).getMateria(m3).setCalif(10);
        System.out.println(ce);
        System.out.println("SE DA DE BAJA UNA MATERIA DE UN ALUMNO");
        ce.getAlumno(a3).bajaMateria(m7);
        System.out.println(ce);
        System.out.println("SE IMPRIME EL PROMEDIO DE LOS ALUMNOS");
        System.out.println(a1.toString() + "PROMEDIO: " + a1.getPromedio());
        System.out.println(a3.toString() + "PROMEDIO: " + a3.getPromedio());
    }
    
}
