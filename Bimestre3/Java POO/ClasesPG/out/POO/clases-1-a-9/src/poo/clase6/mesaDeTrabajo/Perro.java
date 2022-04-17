public class Perro {
    private String raza;
    private boolean estaEnAdopcion;
    private int anioNacimiento;
    private double pesoEnKg;
    private boolean tieneChip;
    private boolean estaLastimado;
    private String nombre;

    public Perro(String raza, boolean estaEnAdopcion, int anioNacimiento, double pesoEnKg, boolean tieneChip, boolean estaLastimado, String nombre) {
        this.raza = raza;
        this.estaEnAdopcion = estaEnAdopcion;
        this.anioNacimiento = anioNacimiento;
        this.pesoEnKg = pesoEnKg;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
        this.nombre = nombre;
    }

    public Perro(boolean estaEnAdopcion, double pesoEnKg, String nombre) {
        this.estaEnAdopcion = estaEnAdopcion;
        this.pesoEnKg = pesoEnKg;
        this.nombre = nombre;
        this.raza = "No tiene";
        this.tieneChip = false;
        this.estaLastimado = false;
        this.anioNacimiento = 0;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public double getPeso() {
        return pesoEnKg;
    }

    public void setPeso(double pesoEnKg) {
        this.pesoEnKg = pesoEnKg;
    }

    public boolean isTieneChip() {
        return tieneChip;
    }

    public void setTieneChip(boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    public boolean isEstaLastimado() {
        return estaLastimado;
    }

    public void setEstaLastimado(boolean estaLastimado) {
        this.estaLastimado = estaLastimado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarEdad() {
        if (this.edad(2021) != -1) {
            System.out.println("El perro " + this.nombre + " tiene " + this.edad(2021) + " años");
        } else {
            System.out.println("No podemos calcular la edad porque no sabemos el año estimado de nacimiento");
        }
    }

    public void mostrarPuedePerderse() {
        if (tieneChip) {
            System.out.println("El perro " + this.nombre + " no puede perderse, tiene chip");
        } else {
            System.out.println("El perro " + this.nombre + " puede perderse, no tiene chip");
        }
    }

    public void ponerEnAdopcion() {
        if(!this.estaLastimado && this.pesoEnKg > 5) {
            this.estaEnAdopcion = true;
            System.out.println("El perro " + this.nombre + " está en adopción!");
        } else {
            System.out.println("No podemos poner a este perro en adopción porque está lastimado o su peso es menor a 5kg");
        }
    }

    private int edad(int anioActual) {
        int edad = -1;
        if(this.anioNacimiento != 0 && this.anioNacimiento < anioActual) {
            edad = anioActual - this.anioNacimiento;
        }
        return edad;
    }
}