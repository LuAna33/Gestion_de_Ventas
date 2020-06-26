

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArticuloVentaTest{
    
    ArticuloVenta articuloVenta1;
        
    @Before
    public void setUp(){
         articuloVenta1 = new ArticuloVenta ("Cuaderno",123, 10.5, 10, 5 , 50);
      
        
    }  
    
    @Test
    public void getCantidadTest(){
        //Dado
        int cantidadEsperada = 5;
        //When
        int cantidadReal = articuloVenta1.getCantidad();
        //Then
        assertEquals(cantidadEsperada,cantidadReal);
    }
    
    @Test
    public void SetCantidadTest(){
        //Dado
        int cantidadEsperada = 10;
        //When
        articuloVenta1.setCantidad(cantidadEsperada);
        int cantidadReal = articuloVenta1.getCantidad();
        
        assertEquals(cantidadEsperada,cantidadReal);
    }
    
    @Test
    public void getDescuentoPorcentajeTest(){
        //Dado
        double descuentoPorcentajeReal = 50D;
        double margenDeError = 0.1D;
        //When
        double descuentoPorcentajeEsperado = articuloVenta1.getDescuentoPorcentaje();
        //Then
        assertEquals(descuentoPorcentajeEsperado,descuentoPorcentajeReal, margenDeError);
    }
    
    @Test
    public void setDescuentoPorcentajeTest(){
        //Dado
        double descuentoPorcentajeEsperado = 75D;
        double margenDeError =0.1D;
        //When
        articuloVenta1.setDescuentoPorcentaje(descuentoPorcentajeEsperado);
        double descuentoPorcentajeReal = articuloVenta1.getDescuentoPorcentaje();
        
        assertEquals(descuentoPorcentajeEsperado,descuentoPorcentajeReal,margenDeError);
    }   
}    