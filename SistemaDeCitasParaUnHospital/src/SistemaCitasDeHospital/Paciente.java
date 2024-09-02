package SistemaCitasDeHospital;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String idPaciente;
    private String nombre;
    private List<Cita> citas;
 //   private List<Paciente> pacientes;
    
    public Paciente(String idPaciente, String nombre){
        this.citas= new ArrayList<>();
        this.idPaciente=idPaciente;
        this.nombre=nombre;
      //  this.pacientes= new ArrayList<>();
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
}
