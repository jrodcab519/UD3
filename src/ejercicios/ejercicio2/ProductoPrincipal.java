package ejercicios.ejercicio2;



public class ProductoPrincipal {
    public static void main(String[] args) throws Exception {
        Producto producto1 = new Producto("Teclado", 15.48);
        Producto producto2 = new Producto("Ratón", 6.52);

        System.out.println(producto1);
        System.out.println(producto2);

        System.out.println(producto1.calcularPrecioNeto());
        System.out.println(producto2.calcularPrecioNeto());
    }
}
