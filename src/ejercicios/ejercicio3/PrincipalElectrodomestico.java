package ejercicios.ejercicio3;

public class PrincipalElectrodomestico {

    public static void main(String[] args) {

        Electrodomestico e1 = new Electrodomestico();

        Electrodomestico e2 = new Electrodomestico(100,20);

        Electrodomestico e3 = new Electrodomestico(84,"Rojo",'J',50);


        System.out.println("El precio final sería: " + e1.precioFinal());
        System.out.println("El precio final sería: " + e2.precioFinal());
        System.out.println("El precio final sería: " + e3.precioFinal());

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
