package ejercicios.encapsulacion;

public class Principal {

    public static void main(String[] args) {

        Cumpleanios c1 = new Cumpleanios("Juan", 20, 11, 1996);

        System.out.println(c1);

        Grupo g1 = new Grupo("1º ASIR", 14, 2);

        System.out.println(g1);

        Localidad l1 = new Localidad("Linares","Jaén",23,47500);

        System.out.println(l1);

        Docente d1 = new Docente("Juan", "Perez", "Programación", "12234A");

        System.out.println(d1);

        Estudiante e1 = new Estudiante("José", "Díaz",262916);

        System.out.println(e1);







    }
}
