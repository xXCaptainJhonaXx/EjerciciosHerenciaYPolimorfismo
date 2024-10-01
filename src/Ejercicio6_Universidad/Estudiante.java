package Ejercicio6_Universidad;

public class Estudiante extends Persona {
    private String carrera;
    private String semestre;
    
    public Estudiante(String nombre, String direccion, String carrera, String semestre) {
        super(nombre, direccion);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    


    
}
