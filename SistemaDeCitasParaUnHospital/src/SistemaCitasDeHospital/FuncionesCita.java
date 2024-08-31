package SistemaCitasDeHospital;

import java.util.ArrayList;
import java.util.Date;

public class FuncionesCita {
    public ArrayList<Cita>citas= new ArrayList<>();
    
    public ArrayList<Cita> getCitas (){
        return citas;
    }
    public void setCitas (ArrayList<Cita> citas){
        this.citas=citas;
    }
    private int buscarCita(String id){
        int indexOf = 0;
           for (Cita c : citas) {
               if(c.getIdDeCita().equals(id)){
                   indexOf = citas.indexOf(c);
               }
           }
           return indexOf;
    }
    public void actualizarCita(String id, String nombreDelPaciente, String idDelPaciente,
            String especialidad, Date fechayHora, boolean estado){
        citas.get(buscarCita(id)).setEspecialidad(especialidad);
        citas.get(buscarCita(id)).isEstado(estado);
        citas.get(buscarCita(id)).setFecha(fechayHora);
        citas.get(buscarCita(id)).setIdDelPaciente(idDelPaciente);
        citas.get(buscarCita(id)).setNombre(nombreDelPaciente);
    }
}