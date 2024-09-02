/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SistemaCitasDeHospital;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Doralis
 */
public class Informacion {
    ArrayList<Cita>cita = new ArrayList<>();
    ArrayList<Paciente> paciente = new ArrayList<>();

    public Informacion() {
    }
    
    public ArrayList<Cita> getCita() {
        return cita;
    }

    public void setCita(ArrayList<Cita> cita) {
        this.cita = cita;
    }
    public ArrayList<Paciente> getPaciente() {
        return paciente;
    }

    public void setPaciente(ArrayList<Paciente> paciente) {
        this.paciente = paciente;
    }
    public void addCita (Cita c){
        cita.add(c);
    }
    public void addPaciente (Paciente p){
        paciente.add(p);
    }
    private int buscarCita(String id){
        int indexOf = 0;
           for (Cita c : cita) {
               if(c.getIdDeCita().equals(id)){
                   indexOf = cita.indexOf(c);
               }
           }
           return indexOf;
    }
    public void actualizarCita(String id,String especialidad, Date fechayHora, boolean estado){
        cita.get(buscarCita(id)).setEspecialidad(especialidad);
        cita.get(buscarCita(id)).isEstado(estado);
        cita.get(buscarCita(id)).setFecha(fechayHora);
    }
    public void actualizarPaciente(String id, String idPaciente, String nombre){
        paciente.get(buscarCita(id)).setIdPaciente(idPaciente);
        paciente.get(buscarCita(id)).setNombre(nombre);
    }
    public void obtenerCitasProgramadas(){
        ArrayList<Cita> citasProgramadas = new ArrayList<>();
        for (Cita cita : cita){
            if(cita.isEstado()){
                System.out.println(cita);;
            }
        }
    }
}
