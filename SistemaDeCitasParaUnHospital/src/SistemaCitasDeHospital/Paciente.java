package SistemaCitasDeHospital;

import java.util.List;

public class Paciente {
    private String idPaciente;
    private String nombre;
    private List<Cita> citas;
    
    public Paciente(String idPaciente, String nombre){
        this.citas=citas;
        this.idPaciente=idPaciente;
        this.nombre=nombre;
    }
    public void addCita(Cita a){
        citas.add(a);
    }
}
