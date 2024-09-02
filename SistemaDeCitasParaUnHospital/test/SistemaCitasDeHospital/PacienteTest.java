/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SistemaCitasDeHospital;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jaime
 */
public class PacienteTest {
    
    public PacienteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIdPaciente method, of class Paciente.
     */
    @Test
    public void testGetIdPaciente() {
        System.out.println("getIdPaciente");
        Paciente instance = null;
        String expResult = "";
        String result = instance.getIdPaciente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdPaciente method, of class Paciente.
     */
    @Test
    public void testSetIdPaciente() {
        System.out.println("setIdPaciente");
        String idPaciente = "";
        Paciente instance = null;
        instance.setIdPaciente(idPaciente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Paciente.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Paciente instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Paciente.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Paciente instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCitas method, of class Paciente.
     */
    @Test
    public void testGetCitas() {
        System.out.println("getCitas");
        Paciente instance = null;
        List<Cita> expResult = null;
        List<Cita> result = instance.getCitas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCitas method, of class Paciente.
     */
    @Test
    public void testSetCitas() {
        System.out.println("setCitas");
        List<Cita> citas = null;
        Paciente instance = null;
        instance.setCitas(citas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addpaciente method, of class Paciente.
     */
    @Test
    public void testAddpaciente() {
        System.out.println("addpaciente");
        Paciente a = null;
        Paciente instance = null;
        instance.addpaciente(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCitasProgramadas method, of class Paciente.
     */
    @Test
    public void testObtenerCitasProgramadas() {
        System.out.println("obtenerCitasProgramadas");
        Paciente instance = null;
        instance.obtenerCitasProgramadas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
