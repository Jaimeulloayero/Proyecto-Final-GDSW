package SistemaCitasDeHospital;
import java.util.Date;
public class Cita {
    private String idDeCita;
    private String especialidad;
    private Date fechayHora;
    private boolean estado;
    
    public Cita(String idDeCita, String especialidad, Date fechayHora) {
        this.idDeCita = idDeCita;
        this.especialidad = especialidad;
        this.fechayHora = fechayHora;
    }
    public Cita(){
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
    public String toString() {
        return "Cita{" + "idDeCita=" + idDeCita + ", especialidad=" + especialidad + ", fechayHora=" + fechayHora + ", estado=" + estado + '}';
    }
        
}