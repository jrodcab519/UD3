package ejercicios.ejercicio3;

public class PrincipalElectrodomestico {

    public static void main(String[] args) {

        Electrodomestico e1 = new Electrodomestico();

        Electrodomestico e2 = new Electrodomestico(80,6);

        Electrodomestico e3 = new Electrodomestico(84,"negro",'A',4);
        e3.comprobarColor();
        e3.comprobarConsumoEnergetico();

        System.out.println("El precio final sería: " + e1.precioFinal());
        System.out.println("El precio final sería: " + e2.precioFinal());
        System.out.println("El precio final sería: " + e3.precioFinal());

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
