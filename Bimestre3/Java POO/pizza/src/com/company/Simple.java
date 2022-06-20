package com.company;

public class Simple extends Pizza {
    private double precioBase;
    private boolean grande;

    public Simple(String nombre, String descripcion, double precioBase, boolean grande) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.grande = grande;
    }

    @Override
    public double calcularPrecio() {
        if (this.grande){
            return this.precioBase*2;
        }else{
            return this.precioBase;
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getNombre() + "Precio: " + this.calcularPrecio();
    }
}