package enumeraciones;

public class ElectrodomesticoEnum {
    private  double precioBase = 100;
    private Colores color = Colores.blanco;
    private ConsumoEnergetico consumoEnergetico = ConsumoEnergetico.F;
    private  double peso = 5;

    public ElectrodomesticoEnum() {
    }

    public ElectrodomesticoEnum(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public ElectrodomesticoEnum(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        //this.color = color;
        comprobarColor(color);
        //this.consumoEnergetico = consumoEnergetico;
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }


    public double getPrecioBase() {
        return precioBase;
    }

    public Colores getColor() {
        return color;
    }

    public ConsumoEnergetico getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }


    public String toString(){
        return "Electrodoméstico con precio base de: " + getPrecioBase() + ", color: " + getColor() + ", consumo energético de tipo: " + getConsumoEnergetico() + " y peso: " + getPeso();
    }


    private void comprobarConsumoEnergetico(char letra) {

        ConsumoEnergetico ef = ConsumoEnergetico.F;
        try {
            ef = ConsumoEnergetico.valueOf(String.valueOf(letra));
        }catch (IllegalArgumentException e){
            ef = ConsumoEnergetico.F;
        }
        /*
        switch (ef){
            case A,B,C,D,E,F:
                this.consumoEnergetico = ef;
                break;
            default:
                this.consumoEnergetico = ConsumoEnergetico.F;
        }

         */
    }

    private void comprobarColor(String color) {


    try {
        switch (Colores.valueOf(String.valueOf(color))) {
            case blanco:
            case negro:
            case azul:
            case rojo:
            case gris:
                this.color = Colores.valueOf(color);
                break;
            default:
                this.color = Colores.blanco;
        }
    } catch (Exception e){
        this.color = Colores.blanco;
    }
/*
        Colores c = Colores.valueOf(color);

        if (c != null){
            this.color = Colores.valueOf(color);
        } else {
            this.color = Colores.blanco;
        }

 */
    }

    public double precioFinal(){

        double precio = 0;
        switch (this.consumoEnergetico){
            case A:
                precio =  this.precioBase + 100;
                break;
            case B:
                precio =  this.precioBase + 80;
                break;
            case C:
                precio =  this.precioBase + 60;
                break;
            case D:
                precio =  this.precioBase + 50;
                break;
            case E:
                precio =  this.precioBase + 30;
                break;
            case F:
                precio =  this.precioBase + 10;
                break;
        }
        return precio;
    }
}
