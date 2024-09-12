package SistemaCitasDeHospital;
import java.util.ArrayList;
import java.util.List;
public class Informacion {
    ArrayList<Cita>cita = new ArrayList<>();
    ArrayList<Paciente> paciente = new ArrayList<>();

    public Informacion() {
    }
    public Informacion(ArrayList<Cita> cita , ArrayList<Paciente> paciente){
        this.cita = cita ;
        this.paciente = paciente;
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
    public ArrayList<Cita> ListaCita(){
        ArrayList<Cita> lista = new ArrayList<>();
    for(Cita c : cita){
        lista.add(c);
    }
    return lista;
  }
   public ArrayList<Paciente> ListaPaciente(){
        ArrayList<Paciente> lista = new ArrayList<>();
    for(Paciente p : paciente){
        lista.add(p);
    }
    return lista;
  }
}