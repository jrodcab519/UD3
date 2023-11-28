package ejercicios.encapsulacion;

public class Docente {
    private String nombre;
    private String apellidos;
    private String especialidad;
    private String nrp;

    public Docente(String nombre, String apellidos, String especialidad, String nrp) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
        this.nrp = nrp;
    }

    public Docente() {
    }

    public String toString(){
        return " Nombre : " + nombre + ", Apellidos " + apellidos + ", Especialidad: " + especialidad + ", NRP: " + nrp;
    }
}
