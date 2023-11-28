package ejercicios.encapsulacion;

public class Cumpleanios {

    private String nombre;
    private int dia;
    private int mes;
    private int anio;

    public Cumpleanios(String nombre, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Cumpleanios() {
    }

    public String toString(){
        return "nombre:" + nombre + "cumpleaños: " +  dia + "/" + mes + "/" + anio;
    }
}
