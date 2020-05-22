

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VentaTest{
    
    Venta venta1;
    Venta venta2;
    
    @Before
    public void setUp(){
        venta1= new Venta(123, 10, 100, 1,10);
        venta2= new Venta(123, 10, 100, 200,10);
    }  
    
    @Test
    public void precioCantidadTest(){
    
        int resultadoReal = venta1.calcularPrecioCantidad();
        int resultadoEsperado = 1000;
        assertEquals(resultadoEsperado,resultadoReal);
    }
    
    @Test
    public void descuentoCantidadTest(){
        
        int resultadoReal= venta1.calcularDescuentoCantidad();
        int resultadoEsperado = 100;
        assertEquals(resultadoEsperado, resultadoReal);
       
    }
    
    
    @Test
    public void precioFinalTest(){
        
        int resultadoReal1=venta1.calcularPrecioFinal();//Venta1 Cumple con las condiciones para el descuento por cantidad//
        int resultadoEsperado1 = 900;
        assertEquals(resultadoEsperado1,resultadoReal1);
        
        int resultadoReal2=venta2.calcularPrecioFinal();//Venta2 NO cumple con las condiciones para el descuento por cantidad//
        int resultadoEsperado2 = 1000;
        assertEquals(resultadoEsperado2,resultadoReal2);
        
    }  
}
