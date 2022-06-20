package com.company.unidadesFuncionales;

import static com.company.administracion.Administracion.PRECIO_M2;

public class Cochera extends UnidadFuncional{
    @Override
    public double calcularExpensas() {
        double precioUnidad = super.getM2Totales() * PRECIO_M2;
        return  precioUnidad + precioUnidad * super.getImpuesto()/100;
    }



    public Cochera(String direccion, String nombreDueño, double m2Totales, int impuesto) {
        super(direccion, nombreDueño, m2Totales, impuesto);
    }

    @Override
    public String toString() {
        return "Dueño: " + super.getNombreDueño() + " Tipo: " +this.getClass().getSimpleName() + " Expensas: $" + this.calcularExpensas();
    }
}
