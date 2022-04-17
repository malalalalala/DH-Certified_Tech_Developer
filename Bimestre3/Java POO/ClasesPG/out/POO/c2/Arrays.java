package c2;

public class Arrays {
//    String[] nombres = new String[5];

//    String[] nombres = {"Juan","Mario","Marcelo"};
//
//    for(int i = 0; i < nombres.length  ; i++)
//        System.out.println(nombres[i]);
//    int i = 0;while(i < nombres.length)
//    {   System.out.println(nombres[i]);i++;}
//    for(String nombre : nombres)
//        System.out.println(nombre);

    public static void main(String[] args){
        String[] nombres = new String[5];
        nombres[0] = "Juan";
        nombres[1] = "Mario";
        nombres[3] = "Marcelo";
     for(int i = 0; i < nombres.length  ; i++)
        System.out.println(nombres[i]);
    int i = 0;while(i < nombres.length)
    {   System.out.println(nombres[i]);i++;}
    for(String nombre : nombres)
        System.out.println(nombre);
    }



}
