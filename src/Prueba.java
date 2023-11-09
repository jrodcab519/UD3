public class Prueba {
    public static void main(String[] args) throws Exception {

        Rectangulo r = new Rectangulo();
        r.base = 10;
        r.altura = 5;

        System.out.println(r);

        System.out.println("El rectángulo r1 tiene: base = " + r.base + " y altura = " + r.altura);

        Rectangulo r2 = new Rectangulo();

        System.out.println("El rectángulo r2 tiene: base = " + r2.base + " y altura = " + r2.altura);

        Rectangulo r3 = new Rectangulo(8,7);

        System.out.println("El rectángulo r3 tiene: base = " + r3.base + " y altura = " + r3.altura);

        Rectangulo r4 = new Rectangulo(8);

        System.out.println("El rectángulo r4 tiene: base = " + r4.base + " y altura = " + r4.altura);

        System.out.println("El área de r1 es : " + r.calcularArea());
        System.out.println("El perímetro de r1 es : " + r.calcularPerimetro());

        Persona p = new Persona();
        p.nombre = "Juan Diego";
        p.apellidos = "Rodríguez Cabrero";
        p.dni = "12345678P";

        System.out.println(p.nombre + " " + p.apellidos + ", DNI: " + p.dni);

        p.imprimirDatos();

        Contacto c = new Contacto();
        c.nombre = " Juan Diego";
        c.telefono = "12345678P";

        System.out.println(c);

        Punto p1 = new Punto();
        p1.x = 1;
        p1.y = 2;

        System.out.println(p1);

        p1.moverA(3,4);

        System.out.println(p1);

    }
}
