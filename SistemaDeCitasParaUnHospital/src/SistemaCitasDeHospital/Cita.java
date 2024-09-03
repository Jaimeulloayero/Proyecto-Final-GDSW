package SistemaCitasDeHospital;

import java.util.Date;

public class Cita {
    private String idDeCita;
    private String especialidad;
    private Date fechayHora;
    private boolean estado;

    public Cita(String idDeCita, String nombre, String idDelPaciente, String especialidad, Date fechayHora) {
        this.idDeCita = idDeCita;
        this.especialidad = especialidad;
        this.fechayHora = fechayHora;
    }
    
    public Cita(){
    }
    
    public Cita(String idDecita, String especialidad, Date fecha,
            boolean estado){
        this.especialidad=especialidad;
        this.estado=estado;
        this.fechayHora=fechayHora;
        this.idDeCita=idDecita;
        this.estado=true;
    }
    
    public String getIdDeCita(){
        return idDeCita;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    public Date getFecha(){
        return fechayHora;
    }
    public boolean isEstado(){
        return estado;
    }
    public void setIdDeCita(String idDeCita){
        this.idDeCita=idDeCita;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad=especialidad;
    }
    public void setFecha(Date fechayHora){
        this.fechayHora=fechayHora;
    }
    public void isEstado(boolean estado){
        this.estado=estado;
    }
    public Date getFechayHora() {
        return fechayHora;
    }
    public void setFechayHora(Date fechayHora) {
        this.fechayHora = fechayHora;
    }    
    @Override
    public String toString(){
        return String.valueOf(idDeCita);
    }
}