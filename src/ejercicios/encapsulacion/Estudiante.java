package ejercicios.encapsulacion;

public class Estudiante {
    private String nombre;
    private String apellidos;
    private int nie;

    public Estudiante(String nombre, String apellidos, int NIE) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nie = nie;
    }

    public Estudiante() {
    }

    public String toString(){
        return " Nombre: " + nombre + ", Apellidos " + apellidos + ", NIE: " + nie;
    }
}
