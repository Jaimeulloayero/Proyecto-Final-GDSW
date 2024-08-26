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
}
