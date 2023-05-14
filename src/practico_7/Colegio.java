package practico_7;

public class Colegio {

    public static void main(String[] args) {
        //a) Crear las materias:
        Materia ingles1 = new Materia(1,"Inglés 1",1);
        Materia matematicás1 = new Materia(2,"Matemáticas 2",1);
        Materia Laboratorio1 =new Materia(3,"Laboratorio 1",1);
        
        //b) Crear Los Alumnos:
        
        Alumno martinL= new Alumno(1001,"Lopez","Martin");
        Alumno brendaM= new Alumno(1002,"Martinez","Brenda");
        
        //c)Inscribir a Lopez en las tres materias.
        
        martinL.agregarMateria(ingles1);
        martinL.agregarMateria(matematicás1);
        martinL.agregarMateria(Laboratorio1);
        
        //d)Inscribir a Martinez en las tres materias.
        
        brendaM.agregarMateria(ingles1);
        brendaM.agregarMateria(matematicás1);
        brendaM.agregarMateria(Laboratorio1);
        brendaM.agregarMateria(Laboratorio1);
        
        
       //e)Visualizar la cantidad de materias a las que está inscripto cada alumno.
       
        System.out.println("Martin Lopez tiene: "+martinL.cantidadMaterias()+" Materias");
        System.out.println("Brenda Martinez tiene: "+brendaM.cantidadMaterias()+" Materias");
       
    }
    
}
