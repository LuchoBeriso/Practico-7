
package practico.pkg7;

import java.util.HashSet;


public class Alumno {
    HashSet<Materia> materias= new HashSet<>();
    
    private int legajo;
    private String apellido;
    private String nombre;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   

    public void agregarMateria(Materia materia) {
      
        if(materias.add(materia)){
            System.out.println("Se agrego la materia "+materia.getNombre()+" a la lista de materias de "+apellido+" correctamente.");
        }else{
            System.out.println("No se pudo agregar la materia "+materia.getNombre()+" porque ya se encuentra en la lista de "+apellido+".");
        }
    }

    public int cantidadMaterias() {
        return materias.size();
    }
}

