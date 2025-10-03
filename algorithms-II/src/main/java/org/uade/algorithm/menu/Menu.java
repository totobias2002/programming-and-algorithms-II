package org.uade.algorithm.menu;

import java.util.Scanner;

public class Menu {

    public Menu() {
        // Constructor vacío
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("==== SISTEMA DE RESTAURANTE ====");
            System.out.println("1. Registrar pedido");
            System.out.println("2. Preparar platos");
            System.out.println("3. Asignar pedido a repartidor");
            System.out.println("4. Generar reportes");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> System.out.println("Registrar pedido seleccionado.");
                case 2 -> System.out.println("Preparar platos seleccionado.");
                case 3 -> System.out.println("Asignar pedido a repartidor seleccionado.");
                case 4 -> System.out.println("Generar reportes seleccionado.");
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida");
            }

            System.out.println(); // salto de línea

        } while (opcion != 0);

        scanner.close();
    }
}
