package B3;

import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la temperatura:");
        double temperatura = scanner.nextDouble();

        System.out.println("Ingrese la unidad de temperatura (C para Celsius, F para Fahrenheit):");
        char unidad = scanner.next().charAt(0);

        if (unidad == 'C' || unidad == 'c') {
            // Convertir de Celsius a Fahrenheit
            double fahrenheit = celsiusToFahrenheit(temperatura);
            System.out.println(temperatura + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");
        } else if (unidad == 'F' || unidad == 'f') {
            // Convertir de Fahrenheit a Celsius
            double celsius = fahrenheitToCelsius(temperatura);
            System.out.println(temperatura + " grados Fahrenheit equivalen a " + celsius + " grados Celsius.");
        } else {
            System.out.println("Unidad de temperatura no válida. Por favor, ingrese 'C' o 'F'.");
        }

        scanner.close();
    }

    // Método para convertir de Celsius a Fahrenheit
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Método para convertir de Fahrenheit a Celsius
    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
