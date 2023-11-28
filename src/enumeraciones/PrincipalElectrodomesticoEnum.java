package enumeraciones;
public class PrincipalElectrodomesticoEnum {

    public static void main(String[] args) {

        ElectrodomesticoEnum e1 = new ElectrodomesticoEnum();

        ElectrodomesticoEnum e2 = new ElectrodomesticoEnum(100,20);

        ElectrodomesticoEnum e3 = new ElectrodomesticoEnum(84,"verde",'J',50);


        System.out.println("El precio final sería: " + e1.precioFinal());
        System.out.println("El precio final sería: " + e2.precioFinal());
        System.out.println("El precio final sería: " + e3.precioFinal());

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
