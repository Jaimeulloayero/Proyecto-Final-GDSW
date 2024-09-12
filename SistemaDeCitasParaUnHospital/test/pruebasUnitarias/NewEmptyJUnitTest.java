package pruebasUnitarias;

import SistemaCitasDeHospital.Cita;
import SistemaCitasDeHospital.Informacion;
import SistemaCitasDeHospital.Paciente;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import junit.framework.Assert;
import org.junit.Test;

public class NewEmptyJUnitTest {

    @Test
    public void pruebaAddCita() {
        Informacion info = new Informacion();

        ArrayList<Cita> lista = new ArrayList<>();

        Cita cita = new Cita();

        lista.add(cita);

        Assert.assertTrue(!lista.isEmpty());
    }

    @Test
    public void pruebraLista() {
        ArrayList<Cita> listaCitas = new ArrayList<>();
        ArrayList<Paciente> listaPacientes = new ArrayList<>();
        Informacion info = new Informacion(listaCitas, listaPacientes);
        
        Cita cita = new Cita();
        
        listaCitas.add(cita);
        
        ArrayList<Cita> listaCitasResultado = info.ListaCita();
        
        Assert.assertTrue(!listaCitasResultado.isEmpty());
        
        
    }

}
