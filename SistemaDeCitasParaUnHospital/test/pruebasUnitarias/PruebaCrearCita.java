package pruebasUnitarias;

import SistemaCitasDeHospital.Cita;
import SistemaCitasDeHospital.Informacion;
import SistemaCitasDeHospital.Paciente;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Date;

public class PruebaCrearCita {
    @Test
    public void testAddCita() {
        // Crear una instancia de tu clase y un objeto Cita
        Informacion informacion = new Informacion();
        Cita cita = new Cita("C123", "Cardiología", new Date(), true);

        // Agregar la cita
        informacion.addCita(cita);

        // Verificar que la cita se haya agregado correctamente
        assertEquals(1, informacion.getCita().size()); // Asumiendo que getCita() devuelve la lista de citas
        assertEquals(cita, informacion.getCita().get(0));
    }

    @Test
public void testAddCitaNull() {
    Informacion informacion = new Informacion();
    assertThrows(NullPointerException.class, () -> informacion.addCita(null));
}

    @Test
    public void testAddCitaDuplicado() {
        // Crear una instancia de tu clase y agregar una cita dos veces
        Informacion informacion = new Informacion();
        Cita cita = new Cita("C123", "Cardiología", new Date(), true);
        informacion.addCita(cita);
        assertThrows(IllegalArgumentException.class, () -> informacion.addCita(cita)); // Asumiendo que no se permiten duplicados
    }

    @Test
    public void testAddPaciente() {
        // Crear una instancia de tu clase y un objeto Paciente
        Informacion informacion = new Informacion();
        Paciente paciente = new Paciente("P456", "Juan Pérez");

        // Agregar el paciente
        informacion.addPaciente(paciente);

        // Verificar que el paciente se haya agregado correctamente
        assertEquals(1, informacion.getPaciente().size()); // Asumiendo que getPaciente() devuelve la lista de pacientes
        assertEquals(paciente, informacion.getPaciente().get(0));
    }

    @Test
    public void testAddPacienteNull() {
        // Crear una instancia de tu clase e intentar agregar un paciente nulo
        Informacion informacion = new Informacion();
        assertThrows(NullPointerException.class, () -> clase.addPaciente(null));
    }
}
    
    
    
}
