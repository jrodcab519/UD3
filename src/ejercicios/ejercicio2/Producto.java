package ejercicios.ejercicio2;

public class Producto {

    private double precio;
    private String descripcion;
    public static double iva = 0.21;

    public Producto(){
    }
    public Producto(String descripcion, double precio) throws Exception{
        if(precio < 0){
            throw new Exception("El precio no puede ser negativo");
        }
        if(descripcion == null || descripcion.length() == 0){
            throw new Exception("La descripción no puede estar vacía");
        }
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String toString(){
        return "Descripción: " + this.descripcion + ", precio: " + this.precio ;
    }

    public double calcularPrecioNeto(){
        return this.precio * (1 + iva);
    }
}
