/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SistemaCitasDeHospital;

import java.util.ArrayList;
import java.util.Date;
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
public class FuncionesCitaTest {
    
    public FuncionesCitaTest() {
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
     * Test of getCitas method, of class FuncionesCita.
     */
    @Test
    public void testGetCitas() {
        System.out.println("getCitas");
        FuncionesCita instance = new FuncionesCita();
        ArrayList<Cita> expResult = null;
        ArrayList<Cita> result = instance.getCitas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCitas method, of class FuncionesCita.
     */
    @Test
    public void testSetCitas() {
        System.out.println("setCitas");
        ArrayList<Cita> citas = null;
        FuncionesCita instance = new FuncionesCita();
        instance.setCitas(citas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarCita method, of class FuncionesCita.
     */
    @Test
    public void testActualizarCita() {
        System.out.println("actualizarCita");
        String id = "";
        String nombreDelPaciente = "";
        String idDelPaciente = "";
        String especialidad = "";
        Date fechayHora = null;
        boolean estado = false;
        FuncionesCita instance = new FuncionesCita();
        instance.actualizarCita(id, nombreDelPaciente, idDelPaciente, especialidad, fechayHora, estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
