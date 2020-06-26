import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonaTest{
    
    Persona persona1;
       
    @Before
    public void setUp(){
        persona1 = new Persona ("Emanuel",5635 );
        int dni = 5635;
        
    }  
    
    @Test
    public void getNombreTest(){
        //Dado        
        String nombreEsperado = "Emanuel";
                
        //when
        String nombreReal = persona1.getNombre();
        
        //Entonces
        assertEquals(nombreEsperado,nombreReal);
    }
    
    @Test
    public void setNombreTest(){
        //Dado        
        String nombreEsperado = "Raul";
                
        //Cuando
        persona1.setNombre(nombreEsperado);
        String nombreReal= persona1.getNombre();
        //Entonces
        assertEquals(nombreEsperado,nombreReal);
    }
    @Test
    public void getDniTest(){
        //Dado        
        int dniEsperado = 5635;
                
        //when
        int dniReal = persona1.getDni();
        
        //Entonces
        assertEquals(dniEsperado,dniReal);
    }
    
    @Test
    public void setDniTest(){
        //Dado        
         int dniEsperado = 2746;
                
        //Cuando
        persona1.setDni(dniEsperado);
        int dniReal= persona1.getDni();
        //Entonces
        assertEquals(dniEsperado,dniReal);
    }
}