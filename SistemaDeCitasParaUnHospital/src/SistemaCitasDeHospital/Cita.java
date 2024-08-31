package SistemaCitasDeHospital;

import java.util.ArrayList;
import java.util.Date;

public class Cita {
    private String idDeCita;
    private String nombre;
    private String idDelPaciente;
    private String especialidad;
    private Date fechayHora;
    private boolean estado;
    private ArrayList<FuncionesCita> funciones = new ArrayList<>();
    
    public Cita(){
    }
    
    public Cita(String idDecita, String nombre,
            String idDelPaciente, String especialidad, Date fecha,
            boolean estado){
        this.especialidad=especialidad;
        this.estado=estado;
        this.fechayHora=fechayHora;
        this.idDeCita=idDecita;
        this.idDelPaciente=idDelPaciente;
        this.nombre=nombre;
        this.estado=true;
    }
    
    public String getIdDeCita(){
        return idDeCita;
    }
    public String getNombre(){
        return nombre;
    }
    public String getIdDelPaciente(){
        return idDelPaciente;
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
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setIdDelPaciente(String idDelPaciente){
        this.idDelPaciente=idDelPaciente;
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

    public ArrayList<FuncionesCita> getFunciones() {
        return funciones;
    }

    public void setFunciones(ArrayList<FuncionesCita> funciones) {
        this.funciones = funciones;
    }
    
    @Override
    public String toString(){
        return String.valueOf(idDeCita);
    }
    
}