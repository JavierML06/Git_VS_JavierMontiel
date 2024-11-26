import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        obtenerNumerosEntreDos();
    }

    public static void obtenerNumerosEntreDos() {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        // Solicitar al usuario que introduzca dos números
        System.out.print("Introduce el primer número: ");
        num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2 = scanner.nextInt();

        // Validar que los números son distintos
        if (num1 == num2) {
            System.out.println("Los números deben ser distintos.");
            scanner.close(); // Cerrar el scanner antes de salir
            return;
        }

        // Determinar el menor y el mayor
        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);

        // Imprimir los números desde el menor hasta el mayor, incrementando de 7 en 7
        System.out.println("Números entre " + menor + " y " + mayor + ":");
        for (int i = menor; i <= mayor; i += 7) {
            System.out.println(i);
        }

        // Cerrar el scanner al final
        scanner.close();
    }
}