package com.company.unidadesFuncionales;

public abstract class UnidadFuncional{
    private String direccion;
    private String nombreDueño;
    private double m2Totales;
    private int impuesto;

    public UnidadFuncional(String direccion, String nombreDueño, double m2Totales, int impuesto) {
        this.direccion=direccion;
        this.nombreDueño=nombreDueño;
        this.m2Totales=m2Totales;
        this.impuesto=impuesto;
    }

    public abstract double calcularExpensas();

    public double getM2Totales() {
        return m2Totales;
    }

    public void setM2Totales(double m2Totales) {
        this.m2Totales = m2Totales;
    }

    public int getImpuesto() {
        return impuesto;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

}
