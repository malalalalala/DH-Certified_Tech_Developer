import org.jetbrains.annotations.NotNull;

public class Persona implements Comparable{
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void decirEdad(){
        System.out.println(this.edad);
    }

    @Override
    public int compareTo(@NotNull Object o) {
        Persona p=(Persona) o;
//        if(this.edad>p.getEdad()){
//            return 1;
//        }
//        else if(this.edad<p.getEdad()){
//            return -1;
//        }
//        return 0;

        return this.edad -p.getEdad();
    }
}
