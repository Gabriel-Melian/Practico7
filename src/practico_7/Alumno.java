package practico_7;

import java.util.HashMap;

public class Alumno {
    
    private int legajo;
    
    private String apellido;
    
    private String nombre;
    
    private HashMap<Integer,Materia> misMaterias;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        misMaterias = new HashMap<>();
    }

    public Alumno() {
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

    public HashMap<Integer, Materia> getMisMaterias() {
        return misMaterias;
    }

    public void setMisMaterias(HashMap<Integer, Materia> misMaterias) {
        this.misMaterias = misMaterias;
    }

    public boolean agregarMateria(Materia materia) {
        
        boolean agregado = false;
        if (!misMaterias.containsKey(materia.getIdMateria())) {
            misMaterias.put(materia.getIdMateria(), materia);
            agregado = true;
        }
        return agregado;
        
    }

    public int cantidadMaterias() {
        int tamanio = misMaterias.size();
        return tamanio;
    }
}
      
  

