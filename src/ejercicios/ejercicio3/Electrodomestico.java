package ejercicios.ejercicio3;

public class Electrodomestico {
    private  double precioBase = 100;
    private String color = "blanco";
    private char consumoEnergetico = 'F';
    private  double peso = 5;

    public Electrodomestico() {
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        comprobarColor(color);
        this.consumoEnergetico = consumoEnergetico;
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }


    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }


    public String toString(){
        return "Electrodoméstico con precio base de: " + getPrecioBase() + ", color: " + getColor() + ", consumo energético de tipo: " + getConsumoEnergetico() + " y peso: " + getPeso();
    }


    private void comprobarConsumoEnergetico(char letra){
        switch (letra){
            case 'A','B','C','D','E','F':
                this.consumoEnergetico = letra;
                break;
            default:
                this.consumoEnergetico = 'F';
        }
    }

    private void comprobarColor(String color) {
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("gris")){
            this.color = color.toLowerCase();
        } else {
            this.color = "blanco";
        }
    }

    public double precioFinal(){

        double precio = 0;
        switch (this.consumoEnergetico){
            case 'A':
                precio =  this.precioBase + 100;
                break;
            case 'B':
                precio =  this.precioBase + 80;
                break;
            case 'C':
                precio =  this.precioBase + 60;
                break;
            case 'D':
                precio =  this.precioBase + 50;
                break;
            case 'E':
                precio =  this.precioBase + 30;
                break;
            case 'F':
                precio =  this.precioBase + 10;
                break;
        }
        return precio;
    }
}
