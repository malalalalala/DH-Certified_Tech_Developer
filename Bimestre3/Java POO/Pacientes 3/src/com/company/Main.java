/*
Mesa 4

Yury Paola Villa Franco
Leandro Ernesto Correa
Andres Felipe Monterrosa Alarcon
Juan Sebastian Velasquez Cardona
Julieta Elizabeth Ayala
Natacha Martinez Germain
*/


package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        try {
            Paciente paciente=new Paciente("Juan","Perez","12345",new Date(2021 - 1900, 01, 01));
            paciente.darAlta (new Date(2028 - 1900, 02, 01));
            //paciente.darAlta (new Date(2020 - 1900, 02, 01));
            //Paciente pacienteMal=new Paciente("Jose","Gutierrez","12346",new Date(2025 - 1900, 01, 01));
        } catch (DateException e) {
            e.printStackTrace();
        }

    }
}
