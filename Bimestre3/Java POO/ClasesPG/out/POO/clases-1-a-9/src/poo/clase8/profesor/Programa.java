public class Programa {
    public static void main(String[] args) {
        Socio pepa = new Socio("A0001", "Pepa", 2000, "Gimnasio");
        Socio pepe = new Socio("A0001", "Pepe", 3000, "Pesas");
        SocioHabilitado pepo = new SocioHabilitado("A0002", "Pepo", 3500, "Natacion", 500);

        System.out.println(pepa.toString());
        System.out.println("Hash pepa: " + pepa.hashCode());
        System.out.println("Cuota mensual pepa: " + pepa.cuotaMensual());

        System.out.println(pepe.toString());
        System.out.println("Hash pepe: " + pepe.hashCode());
        System.out.println("Cuota mensual pepe: " + pepe.cuotaMensual());

        System.out.println(pepo.toString());
        System.out.println("Hash pepo: " + pepo.hashCode());
        System.out.println("Cuota mensual pepo: " + pepo.cuotaMensual());
        pepo.setHabilitado(true);
        System.out.println("Cuota mensual pepo: " + pepo.cuotaMensual());

        System.out.println("\nPepa es igual a pepo: " + pepa.equals(pepo));
        System.out.println("Pepe es igual a pepa: " + pepe.equals(pepa));
    }
}
