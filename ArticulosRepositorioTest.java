

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArticulosRepositorioTest{
    
    ArticulosRepositorio articulosRepositorio;
    Articulo articuloReal, articulo1;
            
    @Before
    public void setUp(){
        articulosRepositorio = new ArticulosRepositorio(2);
        articuloReal= new Articulo ("pan");
        articulo1 = new Articulo ("lapiz");
       
    }  
        
    @Test
    public void agregarArticuloTest(){
        //TO DO: En cada test solo se probar un solo metodo y usar solo ese metodo la clase q se prueba
        // mas adelante mockear los objetos para no usar objetos reales
        //given       
        Articulo articuloEsperado = new Articulo ("pan");
        Articulo articuloPrueba = null;
            
        //when
        boolean agregado = articulosRepositorio.agregarArticulo(articuloReal);
        //then
        if (agregado){
            articuloPrueba = articulosRepositorio.obtenerArticulo(0);
        }
        assertEquals(articuloEsperado, articuloPrueba);
    }
   
    
    @Test
    public void getCantidadArticulosTest(){
        //Dado
        int cantidadEsperada = 2;
        //When
        int cantidadReal = articulosRepositorio.cantidadArticulos();
        //Then
        assertEquals(cantidadEsperada,cantidadReal);
    }
    
    @Test
    public void eliminarArticuloTest(){
        //Dado
        Articulo articuloEsperado = null;
        Articulo articuloPrueba = null;        
        boolean articuloAgre= articulosRepositorio.agregarArticulo(articulo1);
        
        //When
        if (articuloAgre){
        boolean eliminado = articulosRepositorio.eliminarArticulo(0);
            if (eliminado){
                articuloPrueba = articulosRepositorio.obtenerArticulo(0);
            }
        }
        
        //Then
        assertNull(articuloPrueba);
    }
    
    
}