public class Rectangulo {
    double base;
    double altura;
    Rectangulo() throws Exception{
        this(2,1);
    }

    Rectangulo(double lado) throws Exception {

        this(lado, lado);
    }

    Rectangulo(double altura, double base) throws Exception{
        if(base <= 0 || altura <= 0){
            throw new Exception("Dimensiones no válidas");
        }
        this.altura = altura;
        this.base = base;
    }
    double calcularArea(){
        return base * altura;
    }

     double calcularPerimetro(){
         return (base + altura)*2;
     }



}
