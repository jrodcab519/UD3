package Figuras;

public class Rectangulo {
    public  double base;
    public double altura;
    public Rectangulo() throws Exception{
        this(2,1);
    }

    public Rectangulo(double lado) throws Exception {

        this(lado, lado);
    }

    public Rectangulo(double altura, double base) throws Exception{
        if(base <= 0 || altura <= 0){
            throw new Exception("Dimensiones no válidas");
        }
        this.altura = altura;
        this.base = base;
    }
    public double calcularArea(){
        return base * altura;
    }

     public double calcularPerimetro(){
         return (base + altura)*2;
     }



}
