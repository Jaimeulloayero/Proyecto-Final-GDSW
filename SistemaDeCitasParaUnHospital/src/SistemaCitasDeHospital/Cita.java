package SistemaCitasDeHospital;
public class Cita {
    private String idDeCita;
    private String nombreDelPaciente;
    private String idDelPaciente;
    private String especialidad;
    private String fecha;
    private String hora;
    private String estado;
    
    public Cita(String idDecita, String nombreDelPaciente,
            String idDelPaciente, String especialidad, String fecha, String hora,
            String estado){
        this.especialidad=especialidad;
        this.estado=estado;
        this.fecha=fecha;
        this.idDeCita=idDecita;
        this.idDelPaciente=idDelPaciente;
        this.nombreDelPaciente=nombreDelPaciente;
        this.estado=estado;
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
    public String getEstado(){
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
    public void setEstado(String estado){
        this.estado=estado;
    }
    @Override
    public String toString(){
        return "Cita{"+"nombre del paciente: " +nombreDelPaciente+ "id Del Paciente: "+idDelPaciente+
                "/ id De Cita: "+idDeCita+"/ Fecha: "+fecha+"/ Hora: "+hora+"/ especialidad: "
                +especialidad+"/ estado: "+estado+" }";
    }
}