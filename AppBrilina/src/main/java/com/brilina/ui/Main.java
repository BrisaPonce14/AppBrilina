package com.brilina.ui;

import com.brilina.logic.GestorVentas;
import com.brilina.model.Venta;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GestorVentas gestor = new GestorVentas();
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\n1 - Cargar venta");
            System.out.println("2 - Mostrar ventas del día");
            System.out.println("3 - Mostrar total");
            System.out.println("0 - Salir");
            System.out.print("Opción: ");

            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Producto: ");
                    String producto = scanner.nextLine();

                    System.out.print("Monto: ");
                    double monto = Double.parseDouble(scanner.nextLine());

                    String fecha = LocalDate.now().toString();

                    Venta venta = new Venta(fecha, producto, monto);
                    gestor.registrarVenta(venta);

                    System.out.println("Venta registrada.");
                    break;

                case "2":
                    gestor.mostrarVentas();
                    break;

                case "3":
                    System.out.println("Total del día: $" + gestor.calcularTotal());
                    break;
            }

        } while (!opcion.equals("0"));

        System.out.println("App cerrada.");
    }
}
