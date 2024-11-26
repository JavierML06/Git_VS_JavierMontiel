import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        mostrarNumerosAleatorios();
    }

    public static void mostrarNumerosAleatorios() {
        Random rand = new Random();
        for (int i = 0; i < 30; i++) {
            System.out.println(rand.nextInt(10) + 1);
        }
    }
}
