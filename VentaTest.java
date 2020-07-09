
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VentaTest{
    
    Venta venta1;
    GestionArticulos gestionArticulos;
    
    @Before
    public void setUp(){
        venta1 = new Venta (123,gestionArticulos);
               
    }  
    
    @Test
    public void getCodVentaTest(){
        //Dado
        int codVentaReal = 123;
        //When
        int codVentaEsperado = venta1.getCodVenta() ;
        //Then
        assertEquals(codVentaEsperado,codVentaReal);
    }
    
    @Test
    public void setCodVentaTest(){
        //Dado
        int codVentaEsperado = 345;
        //When
        venta1.setCodVenta(codVentaEsperado);
        int codVentaReal = venta1.getCodVenta() ;
        //Then
        assertEquals(codVentaEsperado,codVentaReal);
    }
}