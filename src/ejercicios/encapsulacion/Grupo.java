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
        this.alumnado = new Estudiante[38];
        this.numeroEstudiantes = 0;
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

    public void añadirEstudiante(Estudiante estudiante){
       if(numeroEstudiantes < 38){
           alumnado[numeroEstudiantes] = estudiante;
           numeroEstudiantes++;
       }else {
           System.out.println("No se pueden añadir más alumnos, se ha llegado al máximo de 38");
       }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public Docente getTutor() {
        return tutor;
    }

    public void setTutor(Docente tutor) {
        this.tutor = tutor;
    }

    public Estudiante[] getAlumnado() {
        return alumnado;
    }

    public void setAlumnado(Estudiante[] alumnado) {
        this.alumnado = alumnado;
    }

    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    public void setNumeroEstudiantes(int numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public Estudiante estudianteSegunNumero(int numero) {
        if (numero > 0 && numero <= numeroEstudiantes) {
            return alumnado[numero - 1];
        } else {
            System.out.println("Número de estudiante inválido.");
            return null;
        }
    }
}
