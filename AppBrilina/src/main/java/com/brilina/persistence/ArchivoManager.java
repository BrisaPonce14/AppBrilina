package com.brilina.persistence;

import com.brilina.model.Venta;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoManager {

    private static final String ARCHIVO = "ventas.csv";

    public static void guardarVenta(Venta venta) {
        try (FileWriter writer = new FileWriter(ARCHIVO, true)) {
            writer.write(venta.toCSV() + "\n");
        } catch (IOException error) {
            System.out.println("Error al guardar la venta.");
        }
    }
}
