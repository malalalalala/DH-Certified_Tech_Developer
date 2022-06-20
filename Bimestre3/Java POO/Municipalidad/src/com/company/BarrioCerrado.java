package com.company;

import java.util.Set;

public class BarrioCerrado extends Propiedad{
    private int multiplicador;
    private Set<Casa> listaDeCasas;

    public BarrioCerrado(String calle, int numero, int multiplicador, Set<Casa> listaDeCasas) {
        super(calle, numero);
        this.multiplicador = multiplicador;
        this.listaDeCasas = listaDeCasas;
    }

    @Override
    public double calcularImpuesto() {
        double subTotalImpuestos = 0;
        for (Casa icasaCasaIndividual: listaDeCasas) {
            subTotalImpuestos += icasaCasaIndividual.calcularImpuesto();

        }
        return subTotalImpuestos* this.multiplicador;


    }

    @Override
    public String toString() {
        return "Calle: " + getCalle() +
                " - Calle: " + getNumero() +
                " - impuesto a pagar: " + this.calcularImpuesto();
    }
}
