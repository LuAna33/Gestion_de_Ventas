
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmpleadoTest{
    
    Empleado empleado1;
    PuestoEmpleado puestoEmpleado1;    
    @Before
    public void setUp(){
        
        empleado1 = new Empleado ("Luisa", 2746, puestoEmpleado1);
              
    }  
    
    @Test
    public void getNombreTest(){
        //dado
        String nombreReal = "Luisa";
        //When
        String nombreEsperado = empleado1.getNombre();
        //Then
        assertEquals(nombreEsperado,nombreReal);
    }
    
    @Test
    public void setNombreTest(){
        //dado
        String nombreEsperado = "Julia";
        //When
        empleado1.setNombre(nombreEsperado); 
        String nombreReal = empleado1.getNombre();
        //Then
        assertEquals(nombreEsperado,nombreReal);
    }
    
    @Test
    public void getDniTest(){
        //dado
        int dniReal = 2746;
        //When
        int dniEsperado = empleado1.getDni();
        //Then
        assertEquals(dniEsperado,dniReal);
    }
    
    @Test
    public void setDniTest(){
        //dado
        int dniEsperado =2649 ;
        //When
        empleado1.setDni(dniEsperado); 
        int dniReal = empleado1.getDni();
        //Then
        assertEquals(dniEsperado,dniReal);
    }
}
