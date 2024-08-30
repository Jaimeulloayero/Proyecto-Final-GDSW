package SistemaCitasDeHospital;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String idPaciente;
    private String nombre;
    private List<Cita> citas;
    private List<Paciente> pacientes;
    
    public Paciente(String idPaciente, String nombre){
        this.citas= new ArrayList<>();
        this.idPaciente=idPaciente;
        this.nombre=nombre;
        this.pacientes= new ArrayList<>();
    }

    public Paciente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }
    
   
        public void addpaciente(Paciente a){
        pacientes.add(a);
    }
        
    public void obtenerCitasProgramadas(){
        List<Cita> citasProgramadas = new ArrayList<>();
        for (Cita cita : citas){
            if(cita.isEstado()){
                System.out.println(cita);;
            }
        }
    }
}
