package SistemaCitasDeHospital;
public class Cita {
    private String idDeCita;
    private String nombre;
    private String idDelPaciente;
    private String especialidad;
    private String fecha;
    private String hora;
    private boolean estado;
    
    public Cita(){
    }
    
    public Cita(String idDecita, String nombre,
            String idDelPaciente, String especialidad, String fecha, String hora,
            boolean estado){
        this.especialidad=especialidad;
        this.estado=estado;
        this.fecha=fecha;
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
    public String getFecha(){
        return fecha;
    }
    public String getHora(){
        return hora;
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
    public void setFecha(String fecha){
        this.fecha=fecha;
    }
    public void setHora(String hora){
        this.hora=hora;
    }
    public void isEstado(boolean estado){
        this.estado=estado;
    }
    @Override
    public String toString(){
        return "Cita{"+"nombre del paciente: " +nombre+ "id Del Paciente: "+idDelPaciente+
                "/ id De Cita: "+idDeCita+"/ Fecha: "+fecha+"/ Hora: "+hora+"/ especialidad: "
                +especialidad+"/ estado: "+estado+" }";
    }
}