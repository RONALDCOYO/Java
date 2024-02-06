package B1;

import java.util.Scanner;

public class Main {
    public static class CalculadoraSimple {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el primer número:");
            double numero1 = scanner.nextDouble();

            System.out.println("Ingrese el segundo número:");
            double numero2 = scanner.nextDouble();

            System.out.println("Seleccione la operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");

            int opcion = scanner.nextInt();

            double resultado = 0;

            switch (opcion) {
                case 1:
                    resultado = numero1 + numero2;
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    break;
                case 4:
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
                    return;
            }

            System.out.println("El resultado es: " + resultado);
        }
    }
}
