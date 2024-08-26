package SistemaCitasDeHospital;
public class InformacionPaciente {
    private String idDeCita;
    private String nombreDelPaciente;
    private String idDelPaciente;
    private String especialidad;
    private String fecha;
    private String hora;
    private boolean estado;
    
    public InformacionPaciente(String idDecita, String nombreDelPaciente,
            String idDelPaciente, String especialidad, String fecha, String hora,
            boolean estado){
        this.especialidad=especialidad;
        this.estado=estado;
        this.fecha=fecha;
        this.idDeCita=idDecita;
        this.idDelPaciente=idDelPaciente;
        this.nombreDelPaciente=nombreDelPaciente;
        this.estado=false;
    }
    public String getIdDeCita(){
        return idDeCita;
    }
    public String getNombreDelPaciente(){
        return nombreDelPaciente;
    }
    public String getIdDelPaciente(){
        return idDelPaciente;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    public String getFecha(){
        return fecha;
    }
    public String getHora(){
        return hora;
    }
    public boolean getEstado(){
        return estado;
    }
    public void setIdDeCita(String idDeCita){
        this.idDeCita=idDeCita;
    }
    public void setNombreDelPaciente(String nombreDelPaciente){
        this.nombreDelPaciente=nombreDelPaciente;
    }
    public void setIdDelPaciente(String idDelPaciente){
        this.idDelPaciente=idDelPaciente;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad=especialidad;
    }
    public void setFecha(String fecha){
        this.fecha=fecha;
    }
    public void setHora(String hora){
        this.hora=hora;
    }
    public void setEstado(boolean estado){
        this.estado=estado;
    }
}