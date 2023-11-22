package ejercicios.ejercicio3;

public class Electrodomestico {
    private  double precioBase = 100;
    private static String color = "blanco";
    private static char consumoEnergetico = 'F';
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
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public  void setColor(String color) {
        Electrodomestico.color = color;
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

    public  void setConsumoEnergetico(char consumoEnergetico) {
        Electrodomestico.consumoEnergetico = consumoEnergetico;
    }

    public String toString(){
        return "Electrodoméstico con precio base de: " + getPrecioBase() + ", color: " + getColor() + ", consumo energético de tipo: " + getConsumoEnergetico() + " y peso: " + getPeso();
    }


    public boolean comprobarConsumoEnergetico(){
        if(this.getConsumoEnergetico() != 'A' || this.getConsumoEnergetico() != 'B' || this.getConsumoEnergetico() != 'C' || this.getConsumoEnergetico() != 'D' || this.getConsumoEnergetico() != 'E' || this.getConsumoEnergetico() != 'F' ){
            this.setConsumoEnergetico('F');
            return true;
        }
        else{
            return false;
        }
    }

    public boolean comprobarColor() {
        if (this.getColor() != "blanco" || this.getColor() != "negro" || this.getColor() != "rojo" || this.getColor() != "azul" || this.getColor() != "gris") {
            this.setColor("blanco");
            return true;
        } else {
            return false;
        }
    }

    public double precioFinal(){
      if (getConsumoEnergetico() == 'A') {
          return 100;
      } else if (getConsumoEnergetico() == 'B') {
          return 80;
      } else if (getConsumoEnergetico() == 'C') {
          return 60;
      } else if (getConsumoEnergetico() == 'D') {
          return 50;
      } else if (getConsumoEnergetico() == 'E') {
          return 30;
      } else {
          return 10;
      }
    }
}
