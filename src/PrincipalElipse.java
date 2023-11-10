import java.util.Scanner;

public class PrincipalElipse {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce radio mayor: ");
        double a = s.nextDouble();
        System.out.println("Introduce radio menor: ");
        double b = s.nextDouble();

        Elipse e = new Elipse();

        System.out.println("El area de la elipse es: " + e.calcularArea(a,b));

        System.out.println("El perímetro de la elipse es: " + e.calcularPerimetro(a,b));

        Elipse h = new Elipse();

        System.out.println("El area de la elipse es: " + h.calcularArea(a,b));

        System.out.println("El perímetro de la elipse es: " + h.calcularPerimetro(a,b));
    }
}
