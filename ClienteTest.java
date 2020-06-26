

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClienteTest{
    
    Cliente cliente1;
    TipoCliente tipoCliente; 
    
    @Before
    public void setUp(){
        cliente1 = new Cliente ("Raul", 2965, tipoCliente);
               
    }  
    
    @Test
    public void getNombreTest(){
        //dado
        String nombreEsperado = "Raul";
        
        // When
        
        String nombreReal = cliente1.getNombre();
        
        //entonces
        assertEquals(nombreEsperado,nombreReal);
    
    }
         
    @Test
    public void setNombreTest(){
        //Dado        
        String nombreEsperado = "Juan";
                
        //Cuando
        cliente1.setNombre(nombreEsperado);
        String nombreReal= cliente1.getNombre();
        
        //Entonces
        assertEquals(nombreEsperado,nombreReal);
    }
        
    @Test
    public void getDniTest(){
        //Dado        
        int dniEsperado = 2965 ;
                
        //when
        int dniReal = cliente1.getDni();
        
        //Entonces
        assertEquals(dniEsperado, dniReal);
    }
    
    @Test
    public void setDniTest(){
         //Dado        
        int dniEsperado = 2746;
                
        //when
        cliente1.setDni(dniEsperado);
        int dniReal = cliente1.getDni();
        
        //Entonces
        assertEquals(dniEsperado, dniReal);
    }
}