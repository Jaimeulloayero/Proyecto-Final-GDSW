package SistemaCitasDeHospital;

import java.util.ArrayList;

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
            String especialidad, String fecha, String hora, String estado){
        citas.get(buscarCita(id)).setEspecialidad(especialidad);
        citas.get(buscarCita(id)).setEstado(estado);
        citas.get(buscarCita(id)).setFecha(fecha);
        citas.get(buscarCita(id)).setHora(hora);
        citas.get(buscarCita(id)).setIdDelPaciente(idDelPaciente);
        citas.get(buscarCita(id)).setNombreDelPaciente(nombreDelPaciente);
    }
}