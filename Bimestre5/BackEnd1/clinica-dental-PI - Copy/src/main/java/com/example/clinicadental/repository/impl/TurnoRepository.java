package com.example.clinicadental.repository.impl;

import com.example.clinicadental.model.Turno;
import com.example.clinicadental.repository.IDao;

import java.util.ArrayList;
import java.util.List;

public class TurnoRepository implements IDao<Turno> {
        private List<Turno> turnos=new ArrayList<>();


        @Override
        public Turno guardar(Turno turno) {
            turnos.add(turno);
            return turno;
        }

        @Override
        public Turno buscar(Integer id) {
            Turno turnoBuscado=null;
            for (Turno turno:turnos
            ) { if (turno.getId().equals(id)){
                return turnoBuscado=turno; }
            }

            return turnoBuscado;
        }

        @Override
        public void eliminar(Integer id) {
            Turno turno = buscar(id);
            turnos.remove(turno);
        }

        @Override
        public List<Turno> buscarTodos() {
            return turnos;
        }

        @Override
        public Turno actualizar(Turno turno) {
            Turno turnoAnterior=buscar(turno.getId());
            int indiceTurno= turnos.indexOf(turnoAnterior);
            turnos.set(indiceTurno,turno);
            return turno;
        /*eliminar(turno.getId());
        guardar(turno);
        return turno;
         */
        }


//    @Override
//    public Turno actualizar(Turno turno) {
//        int index = -1;
//        for (int i = 0; i < turnos.size(); i++) {
//            if (turnos.get(i).getId().equals(turno.getId())) {
//                index = i;
//            }
//        }
//        turnos.set(index, turno);
//        return turno;
//    }



}
