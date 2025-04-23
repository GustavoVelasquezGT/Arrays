import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;


public class OperacionesArraylist {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> listaCompras = new ArrayList<>();
            
            while (true) {
                System.out.println("\nMenú de Lista de Compras:");
                System.out.println("1. Agregar un producto a la lista");
                System.out.println("2. Mostrar la lista de compras");
                System.out.println("3. Eliminar un producto de la lista");
                System.out.println("4. Buscar un producto en la lista");
                System.out.println("5. Ordenar la lista alfabéticamente");
                System.out.println("6. Salir");
                System.out.print("Seleccione una opción: ");
                
                int opcion;
                try {
                    opcion = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Entrada no válida. Por favor, ingrese un número del 1 al 6.");
                    continue;
                }
                
                switch (opcion) {
                    case 1:
                        agregarProducto(scanner, listaCompras);
                        break;
                    case 2:
                        mostrarLista(listaCompras);
                        break;
                    case 3:
                        eliminarProducto(scanner, listaCompras);
                        break;
                    case 4:
                        buscarProducto(scanner, listaCompras);
                        break;
                    case 5:
                        ordenarLista(listaCompras);
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opción no válida. Ingrese un número entre 1 y 6.");
                }
            }
        }

            // Agregar un producto a la lista de compras
            public static void agregarProducto(Scanner scanner, ArrayList<String> lista) {
                System.out.print("Ingrese el nombre del producto: ");
                String producto = scanner.nextLine().trim();
                if (!producto.isEmpty()) {
                    lista.add(producto);
                    System.out.println("Producto agregado correctamente.");
                } else {
                    System.out.println("El nombre del producto no puede estar vacío.");
                }
            }
            
            // Mostrar todos los productos en la lista
            public static void mostrarLista(ArrayList<String> lista) {
                if (lista.isEmpty()) {
                    System.out.println("La lista de compras está vacía.");
                } else {
                    System.out.println("Lista de compras:");
                    for (String producto : lista) {
                        System.out.println("- " + producto);
                    }
                }
            }
            
            // Eliminar un producto de la lista
            public static void eliminarProducto(Scanner scanner, ArrayList<String> lista) {
                System.out.print("Ingrese el nombre del producto a eliminar: ");
                String producto = scanner.nextLine().trim();
                if (lista.remove(producto)) {
                    System.out.println("Producto eliminado correctamente.");
                } else {
                    System.out.println("El producto no se encuentra en la lista.");
                }
            }
            
            // Buscar un producto en la lista
            public static void buscarProducto(Scanner scanner, ArrayList<String> lista) {
                System.out.print("Ingrese el nombre del producto a buscar: ");
                String producto = scanner.nextLine().trim();
                if (lista.contains(producto)) {
                    System.out.println("El producto está en la lista.");
                } else {
                    System.out.println("El producto no se encuentra en la lista.");
                }
            }
            
            // Ordenar la lista de compras alfabéticamente
            public static void ordenarLista(ArrayList<String> lista) {
                if (lista.isEmpty()) {
                    System.out.println("La lista de compras está vacía.");
                } else {
                    Collections.sort(lista);
                    System.out.println("Lista de compras ordenada alfabéticamente:");
                    mostrarLista(lista);
                }
            }
}
