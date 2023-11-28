package ejercicios.encapsulacion;

public class Grupo {

    private String nombre;
    private int numero;
    private int planta;
    private Docente tutor;
    private Estudiante[] alumnado;
    private int numeroEstudiantes;

    public Grupo(String nombre, int numero, int planta) {
        this.nombre = nombre;
        this.numero = numero;
        this.planta = planta;
    }

    public Grupo() {
    }

    public String toString(){
        return " Nombre grupo: " + nombre + ", Número de aula " + numero + ", Planta: " + planta;
    }

    public Grupo(String nombre, int numero, int planta, Docente tutor){
        this.alumnado = new Estudiante[38];
        this.numeroEstudiantes = 0;
    }







}
