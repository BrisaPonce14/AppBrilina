package com.brilina.logic;

import com.brilina.model.Venta;
import com.brilina.persistence.ArchivoManager;

import java.util.ArrayList;

public class GestorVentas {

    private ArrayList<Venta> ventasDelDia;

    public GestorVentas() {
        ventasDelDia = new ArrayList<>();
    }

    public void registrarVenta(Venta venta) {
        ventasDelDia.add(venta);
        ArchivoManager.guardarVenta(venta);
    }

    public double calcularTotal() {
        double total = 0;
        for (Venta venta : ventasDelDia) {
            total += venta.getMonto();
        }
        return total;
    }

    public void mostrarVentas() {
        for (Venta venta : ventasDelDia) {
            System.out.println(venta);
        }
    }
}
