import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        obtenerNumerosEntreDos();
    }

    public static void obtenerNumerosEntreDos() {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;

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

        // Solicitar al usuario que introduzca un tercer número
        System.out.print("Introduce un tercer número: ");
        num3 = scanner.nextInt();

        // Imprimir los números desde el menor hasta el mayor, incrementando de 7 en 7
        System.out.println("Números entre " + menor + " y " + mayor + ":");
        for (int i = menor; i <= mayor; i += 7) {
            System.out.println(i);
        }

        // Verificar si el tercer número está entre el menor y el mayor
        if (num3 > menor && num3 < mayor) {
            System.out.println("El tercer número " + num3 + " se encuentra entre " + menor + " y " + mayor + ".");
        } else {
            System.out.println("El tercer número " + num3 + " no se encuentra entre " + menor + " y " + mayor + ".");
        }

        // Cerrar el scanner al final
        scanner.close();
    }
}