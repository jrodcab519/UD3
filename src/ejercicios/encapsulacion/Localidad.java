package ejercicios.encapsulacion;

public class Localidad {
    private String nombreLocalidad ;
    private String nombreProvincia;
    private int codigoNumerico;
    private int numeroHabitantes;

    public Localidad(String nombreLocalidad, String nombreProvincia, int codigoNumerico, int numeroHabitantes) {
        this.nombreLocalidad = nombreLocalidad;
        this.nombreProvincia = nombreProvincia;
        this.codigoNumerico = codigoNumerico;
        this.numeroHabitantes = numeroHabitantes;
    }

    public Localidad() {
    }

    public String toString(){
        return "Localidad: " + nombreLocalidad + ", Provincia: " +  nombreProvincia + ", Código numérico: " + codigoNumerico + ", Número de habitantes: " + numeroHabitantes;
    }
}
