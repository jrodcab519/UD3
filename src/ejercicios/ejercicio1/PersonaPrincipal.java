package ejercicios.ejercicio1;

import java.util.Scanner;

public class PersonaPrincipal {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un nombre:");
        String nombre = s.nextLine();

        System.out.println("Introduce una edad:");
        int edad = s.nextInt();

        System.out.println("Introduce el sexo (H para hombre y M para mujer):");
        char sexo = s.next().charAt(0);

        System.out.println("Introduce un peso en Kg:");
        double peso = s.nextDouble();

        System.out.println("Introduce una altura en metros (por ejemplo: 1,75) :");
        double altura = s.nextDouble();

        Persona a = new Persona(nombre, edad, sexo, peso, altura);
        a.generarDNI();
        a.comprobarSexo();

        Persona b = new Persona( "Patricia", 17, 'M');
        b.generarDNI();

        Persona c = new Persona();

        c.setNombre("José");
        c.setEdad(21);
        c.setSexo('H');
        c.setPeso(75);
        c.setAltura(1.82);
        c.generarDNI();
        c.comprobarSexo();

        System.out.println("¿Es " + nombre + " mayor de edad? " + a.mayorEdad());
        System.out.println("¿Es " + nombre + " mayor de edad? " + b.mayorEdad());
        System.out.println("¿Es José mayor de edad? " + c.mayorEdad());

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        comprobarIMC(a);
        comprobarIMC(b);
        comprobarIMC(c);

    }

    private static void comprobarIMC(Persona persona){
        int imc = persona.calcularIMC();
        if(imc == 0){
            System.out.println(persona.getNombre() + " está en su peso ideal");
        } else if (imc == -1) {
            System.out.println(persona.getNombre() + " está por debajo de su peso ideal");
        } else {
            System.out.println(persona.getNombre() + " tiene sobrepeso");
        }
    }
}
