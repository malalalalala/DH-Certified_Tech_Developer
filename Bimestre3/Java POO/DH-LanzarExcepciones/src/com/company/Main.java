package com.company;

public class Main {

//    public static void main(String[] args) throws Exception {
//	 Fecha1 fecha1=new Fecha1(10,2556,42121541);
//     Fecha2 fecha2=new Fecha2(10,2556,42121541);
//    }

    public static void main(String[] args)  {
	    Fecha1 fecha1=new Fecha1(10,2,42121541);
         try {
             Fecha2 fecha2=new Fecha2(10,2556,42121541);
         }catch (Exception e){
             System.err.println("no son valores validos F2en main");
         }
    }

//    public static void main(String[] args)  {
////        Fecha1 fecha1=new Fecha1(10,2556,42121541);
//        try {
//            Fecha2 fecha2=new Fecha2(10,2556,42121541);
//        }catch (Exception e){
//            System.err.println("no son valores validos");
//        }
//    }
}
