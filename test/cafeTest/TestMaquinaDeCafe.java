package cafeTest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestMaquinaDeCafe { 

    Cafetera cafetera; 
    Vaso vasosPequeno; 
    Vaso vasosMediano; 
    Vaso vasosGrande; 
    Azuquero Azuquero;
    MaquinaDeCafe maquinaDeCafe; 

    @Before
    public void setup() { // 
        cafetera = new Cafetera(50); 
        vasosPequeno = new Vaso(5, 3); 
        vasosMediano = new Vaso(5, 5); 
        vasosGrande = new Vaso(5, 7);  
        Azuquero = new Azuquero(20);
        maquinaDeCafe = new MaquinaDeCafe(); 

        maquinaDeCafe.setCafetera(cafetera); 
        maquinaDeCafe.setVasosPequeno(vasosPequeno);
        maquinaDeCafe.setVasosMediano(vasosMediano); 
        maquinaDeCafe.setVasosGrande(vasosGrande); // 
        maquinaDeCafe.setAzucarero(Azuquero); 
    }

    @Test
    public void deberiaDevolverUnVasoPequeno() { 
        Vaso vaso = maquinaDeCafe.getTipoDeVaso("pequeno");  
        assertEquals(maquinaDeCafe.vasosPequeno, vaso);  
    }

    @Test
    public void deberiaDevolverUnVasoMediano() { 
        Vaso vaso = maquinaDeCafe.getTipoDeVaso("mediano");
        assertEquals(maquinaDeCafe.vasosMediano, vaso);
    }

    @Test
    public void deberiaDevolverUnVasoGrande() { 
        Vaso vaso = maquinaDeCafe.getTipoDeVaso("grande");
        assertEquals(maquinaDeCafe.vasosGrande, vaso); 
    }

    @Test
    public void deberiaDevolverNoHayVasos() { 


        Vaso vaso = maquinaDeCafe.getTipoDeVaso("pequeno"); 
        String resultado = maquinaDeCafe.getVasoDeCafe(vaso, 10, 2); 
        assertEquals("No hay Vasos", resultado); 
    }

    @Test
    public void deberiaDevolverNoHayCafe() { 
        cafetera = new Cafetera(2); 
        maquinaDeCafe.setCafetera(cafetera); 
        Vaso vaso = maquinaDeCafe.getTipoDeVaso("pequeno"); 
        String resultado = maquinaDeCafe.getVasoDeCafe(vaso, 1, 2); 
        assertEquals("No hay Cafe", resultado);  
    }

    @Test
    public void deberiaDevolverNoHayAzucar() { 
    	Azuquero = new Azuquero(2); 
        maquinaDeCafe.setAzucarero(Azuquero); 
        Vaso vaso = maquinaDeCafe.getTipoDeVaso("pequeno"); 
        String resultado = maquinaDeCafe.getVasoDeCafe(vaso, 1, 3); 
        assertEquals("No hay Azucar", resultado); 
    }

    @Test
    public void deberiaRestarCafe() {  
        Vaso vaso = maquinaDeCafe.getTipoDeVaso("pequeno");
        maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);
        int resultado = maquinaDeCafe.getCafetera().getCantidadCafe(); 

        assertEquals(47, resultado);
    }

    @Test
    public void deberiaRestarVaso() { 
        Vaso vaso = maquinaDeCafe.getTipoDeVaso("pequeno"); 
        maquinaDeCafe.getVasoDeCafe(vaso, 1, 3); 
        int resultado = maquinaDeCafe.getVasosPequeno().getCantidadVasos(); 
        assertEquals(4, resultado); 
    }

    @Test
    public void deberiaRestarAzucar() { 
        Vaso vaso = maquinaDeCafe.getTipoDeVaso("pequeno"); 
        maquinaDeCafe.getVasoDeCafe(vaso, 1, 3); 
        int resultado = maquinaDeCafe.getAzucarero().getCantidadAzucar(); 
        assertEquals(17, resultado); 
    }

    @Test
    public void deberiaDevolverFelicitaciones() { 
        Vaso vaso = maquinaDeCafe.getTipoDeVaso("pequeno");
        String resultado = maquinaDeCafe.getVasoDeCafe(vaso, 1, 3); 
        assertEquals("Felicitaciones", resultado); 
    }
}