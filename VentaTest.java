

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VentaTest{
    
    Venta venta1;
    Venta venta2;
    Articulo articulo1;
    Articulo articulo2;
    @Before
    public void setUp(){
        Articulo articulo1 = new Articulo ( "Carpeta", 1523, 10);
        Articulo articulo2 = new Articulo ( "Carpeta", 1524, 10);
        venta1= new Venta(123, 100,1 ,10, articulo1);
        venta2= new Venta(123, 100, 200,10, articulo2);
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

