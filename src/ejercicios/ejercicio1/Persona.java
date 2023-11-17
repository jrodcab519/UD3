package ejercicios.ejercicio1;

public class Persona {
    private String nombre;
    private int edad;
    private char sexo;
    private String dni;
    private double peso;
    private double altura;

    private final int SOBREPESO = 1;
    private final int BAJO_PESO_IDEAL = -1;
    private final int PESO_IDEAL = 0;
    private final String letras = "TRWAGMYFPDXBNJZSQVHLCKE";



    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public String getDni() {
        return dni;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int calcularIMC() {
        double imc = (int) (peso / (altura*altura));
        if(imc < 20){
            return BAJO_PESO_IDEAL;
        }else if (imc > 25){
            return SOBREPESO;
        }else {
            return PESO_IDEAL;
        }
    }

    public boolean mayorEdad(){
        if (edad >= 18){
            return true;
        }else {
            return false;
        }
    }

    private boolean comprobarSexo(){
        if(sexo != 'H' || sexo != 'M'){
            return true;
        }
        else{
            return false;
        }
    }

    public void generarDNI(){

        int numero = (int) (Math.random()*100000000);
        int indice = numero % 23;
        char letra = letras.charAt(indice);

        this.dni = String.valueOf(numero) + letra;

    }


    public String toString(){
        return nombre + " con DNI: " + dni + ", de " + edad + "años, una altura de " + altura + ", un peso de " + peso;
    }
}
