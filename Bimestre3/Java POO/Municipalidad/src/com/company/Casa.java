package com.company;

public class Casa extends Propiedad {
    private double montoBaseImpuesto;
    public static final String AV_SAN_MARTIN = "Av. San Martín";
    public static final double PORCENTAJE_10 = 1.1;

    public Casa(String calle, int numero, double montoBaseImpuesto) {
        super(calle, numero);
        this.montoBaseImpuesto = montoBaseImpuesto;
    }


    @Override
    public double calcularImpuesto() {
        return getCalle().equals(AV_SAN_MARTIN) ? this.montoBaseImpuesto*PORCENTAJE_10 : this.montoBaseImpuesto;
    }

    @Override
    public String toString() {
        return "Calle: " + getCalle() +
                " - Calle: " + getNumero() +
                " - montoBaseImpuesto: " + this.calcularImpuesto();
    }
}