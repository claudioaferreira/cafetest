package cafeTest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestAzuquero { // 

    Azuquero Azuquero; // 

    @Before
    public void setup() { // 
    	Azuquero = new Azuquero(10); // 
    }

    @Test
    public void deberiadevolverVerdaderoSiHaySuficienteAzucarEnElAzuquero() { // 
        boolean resultado = Azuquero != null; // 
        
        resultado = Azuquero.hasAzucar(10); // 
        assertEquals(true, resultado); // 
    }

    @Test
    public void deberiadevolverFalsoPorqueNoHaySuficienteAzucarEnElAzuquero() { // 
        boolean resultado = Azuquero.hasAzucar(15); // 
        assertEquals(false, resultado); // 
    }

    @Test
    public void deberiaRestarAzucarAlAzuquero() { // 
    	Azuquero.giveAzucar(5); // 
        assertEquals(5, Azuquero.getCantidadAzucar()); // 

        Azuquero.giveAzucar(2); // 
        assertEquals(3, Azuquero.getCantidadAzucar()); // 
    }
}