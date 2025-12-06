package com.brilina.model;

public class Venta {

    private String fecha;
    private String producto;
    private double monto;

    public Venta() {

    }

    public Venta(String fecha, String producto, double monto) {
        this.fecha = fecha;
        this.producto = producto;
        this.monto = monto;
    }
    public String toCSV() {
        return fecha + "," + producto + "," + monto;
    }

    public double getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return fecha + " - " + producto + " - $" + monto;
    }
}