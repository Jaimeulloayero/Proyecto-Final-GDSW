/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SistemaCitasDeHospital;

import java.util.ArrayList;

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
}