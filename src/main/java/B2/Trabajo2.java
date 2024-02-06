package B2;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCompras {

        public static void main(String[] args) {
                ArrayList<String> listaCompras = new ArrayList<>();
                Scanner scanner = new Scanner(System.in);
                int opcion;

                do {
                        System.out.println("----- Lista de Compras -----");
                        System.out.println("1. Agregar elemento");
                        System.out.println("2. Mostrar lista");
                        System.out.println("3. Eliminar elemento");
                        System.out.println("4. Salir");
                        System.out.print("Seleccione una opción: ");

                        opcion = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea pendiente

                        switch (opcion) {
                                case 1:
                                        System.out.print("Ingrese el elemento a agregar: ");
                                        String elemento = scanner.nextLine();
                                        agregarElemento(listaCompras, elemento);
                                        break;
                                case 2:
                                        mostrarLista(listaCompras);
                                        break;
                                case 3:
                                        System.out.print("Ingrese el elemento a eliminar: ");
                                        String elementoEliminar = scanner.nextLine();
                                        eliminarElemento(listaCompras, elementoEliminar);
                                        break;
                                case 4:
                                        System.out.println("Saliendo del programa. ¡Hasta luego!");
                                        break;
                                default:
                                        System.out.println("Opción no válida. Por favor, seleccione una opción correcta.");
                        }

                } while (opcion != 4);

                scanner.close();
        }

        private static void agregarElemento(ArrayList<String> lista, String elemento) {
                lista.add(elemento);
                System.out.println("Elemento agregado: " + elemento);
        }

        private static void mostrarLista(ArrayList<String> lista) {
                if (lista.isEmpty()) {
                        System.out.println("La lista de compras está vacía.");
                } else {
                        System.out.println("Lista de Compras:");
                        for (int i = 0; i < lista.size(); i++) {
                                System.out.println((i + 1) + ". " + lista.get(i));
                        }
                }
        }

        private static void eliminarElemento(ArrayList<String> lista, String elemento) {
                if (lista.contains(elemento)) {
                        lista.remove(elemento);
                        System.out.println("Elemento eliminado: " + elemento);
                } else {
                        System.out.println("El elemento no existe en la lista de compras.");
                }
        }
}
