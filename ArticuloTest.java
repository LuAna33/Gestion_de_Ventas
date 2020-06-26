

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArticuloTest{
    
    Articulo articulo1;
    
    @Before
    public void setUp(){
        articulo1 = new Articulo ( "Cuaderno", 5362,10.5 );
    }  
    
    @Test
    public void getNombreArticuloTest(){
        //Dado        
        String nombreArticuloEsperado = "Cuaderno";
                
        //Cuando
        String nombreArticuloReal = articulo1.getNombreArticulo();
        
        //Entonces
        assertEquals(nombreArticuloEsperado,nombreArticuloReal);
    }
    
    @Test
    public void setNombreArticuloTest(){
        //Dado        
        String nombreArticuloEsperado = "Carpeta";
                
        //Cuando
        articulo1.setNombreArticulo(nombreArticuloEsperado);
        String nombreArticuloReal= articulo1.getNombreArticulo();
        //Entonces
        assertEquals(nombreArticuloEsperado,nombreArticuloReal);
    }
        
    @Test
    public void getCodArtTest(){
        //Dado        
        int codArtEsperado = 5362;
                
        //when
        int codArtReal = articulo1.getCodArt();
        
        //Entonces
        assertEquals(codArtEsperado, codArtReal);
    }
    
    @Test
    public void setCodArtTest(){
        //Dado        
        int codArtEsperado = 3486;
                
        //Cuando
        articulo1.setCodArt(codArtEsperado);
        int codArtReal= articulo1.getCodArt();
        
        //Entonces
        assertEquals(codArtEsperado,codArtReal);
    }
    
    @Test
    public void getPreciounitTest(){
        //Dado        
        double preciounitEsperado = 10.5D;
        double margenError = 0.1D;
                
        //when
        double preciounitReal = articulo1.getPreciounit();
        
        //Entonces
        assertEquals(preciounitEsperado,preciounitReal, margenError);
    }
    
    @Test
    public void setPreciounitTest(){
        //Dado        
         double preciounitEsperado = 11.5D;
         double margenError = 0.1D;
                
        //Cuando
        articulo1.setPreciounit(preciounitEsperado);
        double preciounitReal= articulo1.getPreciounit();
        
        //Entonces
        assertEquals(preciounitEsperado,preciounitReal, margenError);
    }
}


   
