package Figuras;

public class Elipse {

    double a;
    double b;

    public Elipse() throws Exception {

        this(1,1);
    }

    public Elipse(double radio) throws Exception {

        this.a = radio;
        this.b = radio;
    }

    public Elipse(double a, double b) throws Exception {

        if(a <= 0 || b <= 0){
            throw new Exception("Tiene que ser mayor que 0");
        }
        this.a = a;
        this.b = b;
    }

    public double calcularArea(double a, double b){

       return Math.PI*a*b;
    }

    public double calcularPerimetro(double a, double b){

       return (a+b)*Math.PI;
    }
}
