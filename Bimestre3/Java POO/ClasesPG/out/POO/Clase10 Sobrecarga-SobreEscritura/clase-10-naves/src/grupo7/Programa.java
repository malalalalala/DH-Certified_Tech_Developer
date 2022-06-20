import grupo7.entidadesEspaciales.Asteroide;
import grupo7.entidadesEspaciales.Nave;

public class Programa {
    public static void main(String[] args) {
        Nave nave1 = new Nave(0, 0, 'N', 150, 100);
        Nave nave2 = new Nave(10, -5, 'N', 90, 100);
        Asteroide asteroide = new Asteroide(5, 15, 'S', 30);

        System.out.println("\nNave 1:\t" + nave1.toString());
        System.out.println("\tHashcode:\t" + nave1.hashCode());
        System.out.println("\nNave 2:\t" + nave2.toString());
        System.out.println("\tHashcode:\t" + nave2.hashCode());
        System.out.println("\nAsteroide:\t" + asteroide.toString());
        System.out.println("\tHashcode:\t" + asteroide.hashCode());

        System.out.println("\nIgualdades");
        System.out.println("\tNave 1 == Nave 2:\t" + nave1.equals(nave2));
        System.out.println("\tAsteroide == Nave 2:\t" + asteroide.equals(nave2));
        System.out.println("\tNave 1 == Asteroide:\t" + nave1.equals(asteroide));

        nave1.irA(1, 2, 'S');
        nave2.irA(9, -7, 'E');
        asteroide.irA(0, 15, 'O');

        System.out.println("\nNave 1:\t" + nave1.toString());
        System.out.println("\tHashcode:\t" + nave1.hashCode());
        System.out.println("\nNave 2:\t" + nave2.toString());
        System.out.println("\tHashcode:\t" + nave2.hashCode());
        System.out.println("\nAsteroide:\t" + asteroide.toString());
        System.out.println("\tHashcode:\t\t" + asteroide.hashCode());

        System.out.println("\nIgualdades");
        System.out.println("\tNave 1 == Nave 2:\t\t" + nave1.equals(nave2));
        System.out.println("\tAsteroide == Nave 2:\t" + asteroide.equals(nave2));
        System.out.println("\tNave 1 == Asteroide:\t" + nave1.equals(asteroide));

        nave2.irA(1, 2, 'S');
        asteroide.irA(1, 2, 'S');

        System.out.println("\nNave 1:\t" + nave1.toString());
        System.out.println("\tHashcode:\t" + nave1.hashCode());
        System.out.println("\nNave 2:\t" + nave2.toString());
        System.out.println("\tHashcode:\t" + nave2.hashCode());
        System.out.println("\nAsteroide:\t" + asteroide.toString());
        System.out.println("\tHashcode:\t" + asteroide.hashCode());

        System.out.println("\nIgualdades");
        System.out.println("\tNave 1 == Nave 2:\t\t" + nave1.equals(nave2));
        System.out.println("\tAsteroide == Nave 2:\t" + asteroide.equals(nave2));
        System.out.println("\tNave 1 == Asteroide:\t" + nave1.equals(asteroide));
    }
}
