public class Prueba {
    public static void main(String[] args) {

        Rectangulo r = new Rectangulo();
        r.base = 10;
        r.altura = 5;

        System.out.println(r);

        System.out.println("El rectángulo tiene: base = " + r.base + " y altura = " + r.altura);

        Rectangulo r2 = new Rectangulo();

        System.out.println("El rectángulo r2 tiene: base = " + r2.base + " y altura = " + r2.altura);

        System.out.println("El área es : " + r.calcularArea());
        System.out.println("El perímetro es : " + r.calcularPerimetro());

        Persona p = new Persona();
        p.nombre = "Juan Diego";
        p.apellidos = "Rodríguez Cabrero";
        p.dni = "12345678P";

        System.out.println(p.nombre + " " + p.apellidos + ", DNI: " + p.dni);

        p.imprimirDatos();

        Contacto c = new Contacto();
        c.nombre = " Juan Diego";
        c.telefono = "12345678P";

        System.out.println(c.toString());

    }
}
