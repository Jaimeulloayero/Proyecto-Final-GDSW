
package pruebasUnitarias;

import SistemaCitasDeHospital.Cita;
import SistemaCitasDeHospital.Informacion;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import junit.framework.Assert;
import org.junit.Test;



public class NewEmptyJUnitTest {
    
    @Test
    public void pruebaAddCita(){
        Informacion info = new Informacion();
        
        ArrayList<Cita> lista = new ArrayList<>();
        
        Cita cita = new Cita();
        
        lista.add(cita);
        
        Assert.assertTrue(!lista.isEmpty());
        
        

        
    }

    
    
    
}
    
   