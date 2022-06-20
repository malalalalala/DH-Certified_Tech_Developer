package com.company.unidadesFuncionales;

import java.util.ArrayList;
import java.util.List;

public class Shopping extends UnidadFuncional{
    private List<Local> locales= new ArrayList<>();

    public Shopping(String direccion, String nombreDueño, double m2Totales, int impuestoShopping) { //
        super(direccion, nombreDueño, m2Totales, impuestoShopping);
    }

    @Override
    public double calcularExpensas() {
        double expensasParciales = 0;
        double impuestoAplicado;
        for (Local local: this.locales) {
            expensasParciales+= local.calcularExpensas();
        }
        impuestoAplicado = expensasParciales * super.getImpuesto()/100;
        return expensasParciales + impuestoAplicado;
    }


    public void agregarLocal(UnidadFuncional local){
        this.locales.add((Local) local);
    }

    @Override
    public String toString() {
        return "Dueño: " + super.getNombreDueño() + " - Tipo: " + this.getClass().getSimpleName() +" - Expensas: $" + this.calcularExpensas();
    }
}
