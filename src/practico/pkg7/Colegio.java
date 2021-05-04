
package practico.pkg7;


public class Colegio {

    public static void main(String[] args) {
         Materia a= new Materia(1);
        Materia b= new Materia(2);
        Materia c= new Materia(3);
        
        Alumno uno= new Alumno(1001,"Lopez","Martin");
        Alumno dos= new Alumno(1002,"Martinez","Brenda");
        
        uno.agregarMateria(a);
        uno.agregarMateria(b);
        uno.agregarMateria(c);
        
        dos.agregarMateria(a);
        dos.agregarMateria(b);
        dos.agregarMateria(c);
        dos.agregarMateria(c);
        
        System.out.println(""+uno.getNombre()+" está inscripto en: "+uno.cantidadMaterias()+" materias.");
        System.out.println(""+dos.getNombre()+" está inscripto en: "+dos.cantidadMaterias()+" materias.");
        
     
    }    
}
