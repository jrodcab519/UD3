import java.util.Random;

public class Contador {
    int cantidad;
    Contador() {
        Random r = new Random();
        this.cantidad = r.nextInt(11) + 1;
    }

    Contador(int cantidad){
        this.cantidad = cantidad;
    }
    void incrementar() {
        cantidad++;
    }
    void decrementar() {
        cantidad--;
    }
}
