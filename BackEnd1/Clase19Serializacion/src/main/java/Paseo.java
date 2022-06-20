import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Paseo {

    public static void main(String[] args) {

        //1-Creo colección perros
        Perro firulais=new Perro("firulais","callejero",1237,"cra 123");
        Perro titan=new Perro("titan","lobo",1236,"cra 123");
        Perro paticas=new Perro("paticas","pincher",1235,"cra 123");
        Perro manchas=new Perro("machas","dalmata",1234,"cra 123");

        List<Perro> lunes= new ArrayList<Perro>();
        List<Perro> martes= new ArrayList<Perro>();
        List<Perro> miercoles= new ArrayList<Perro>();
        List<Perro> jueves= new ArrayList<Perro>();
        List<Perro> viernes= new ArrayList<Perro>();

        lunes.add(firulais);
        miercoles.add(firulais);
        viernes.add(firulais);

        lunes.add(titan);
        martes.add(titan);
        miercoles.add(titan);
        jueves.add(titan);

        miercoles.add(paticas);
        jueves.add(paticas);
        viernes.add(paticas);

        lunes.add(manchas);
        martes.add(manchas);
        miercoles.add(manchas);
        jueves.add(manchas);
        viernes.add(manchas);


        //creo un obejto de salida

        //2 Guardar la colección en un archivo
        FileOutputStream file= null;
        try {
            file=new FileOutputStream("perros.dat");
            ObjectOutputStream archivo= new ObjectOutputStream(file);

            archivo.writeObject(lunes);
            archivo.writeObject(martes);
            archivo.writeObject(miercoles);
            archivo.writeObject(jueves);
            archivo.writeObject(viernes);

            archivo.close();

            FileInputStream fileInput= new FileInputStream("perros.dat");
            ObjectInputStream archivoIn=new ObjectInputStream(fileInput);

            ArrayList<Perro> dia;

            for (int i=0;i<5;i++){
                System.out.println("Dia " +i+1);
                System.out.println("***************************");
                dia= (ArrayList<Perro>) archivoIn.readObject();
                for (Perro p:dia
                     ) {
                    System.out.println(p);
                }

            }

            archivoIn.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }





}
