import java.util.Scanner;

public class OperacionesArray {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        //Se solicita al usuario que ingrese 10 numero enteros y validamos que no ingrese otro signo o letra.
        System.out.println("Ingrese 10 numero enteros.");
        for (int i = 0; i < array.length; i++){
            while (true) {
                try {
                    System.out.print("Número " + (i + 1) + ":");
                    array[i] = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada No Válida, Ingrese Un Número Entero.");
                }
            }

        }

        while (true) {
            System.out.println("\nMenu De Opciones.");
            System.out.println("1. Mostrar El Array Original.");
            System.out.println("2. Calcular La Suma De los ELementos.");
            System.out.println("3. Buscar El Numero Máximo Y Minimo.");
            System.out.println("4. Invertir El Array.");
            System.out.println("5. Salir.");
            System.out.print("Seleccione Una Opción.");

            int opcion;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada No Válida, Ingrese Un Número Del 1 Al 5.");
                continue;
            }

            //Ejecuta la opcion seleccionada.
            switch (opcion) {
                case 1:
                    mostrarArray(array);
                    break;
                case 2:
                    calcularSuma(array);
                    break;
                case 3:
                    buscarMaxMin(array);
                    break;
                case 4:
                    invertirArray(array);
                    break;
                case 5:
                    System.out.println("Saliendo del programa..");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opcion No Valida, Ingrese Un Número Del 1 Al 5.");
            }

        }  
    }

    public static void mostrarArray(int[] array) {
        System.out.print("Array: ");
        for (int num : array){
            System.out.print(num + " ");
        }
        System.out.println();
        
    }

    public static void calcularSuma(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        System.out.println("La suma de los elementos es: " + suma);
    }
    
    // Función para encontrar y mostrar el número máximo y mínimo en el array
    public static void buscarMaxMin(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Número máximo: " + max);
        System.out.println("Número mínimo: " + min);
    }
    
    // Función para invertir el array y mostrar el resultado
    public static void invertirArray(int[] array) {
        System.out.print("Array invertido: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}