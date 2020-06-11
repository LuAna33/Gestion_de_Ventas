
import java.util.Scanner;
public class GestionArticulos {
        
        Articulo[]articuloColeccion = {null, null, null, null };
                   
    public void listarArticuloColeccion(){ 
        
         for (int i = 0; i < articuloColeccion.length; i++){
           if (articuloColeccion[i] != null){
              System.out.println (articuloColeccion[i]);//no imprimir nulls - to string para ver el detalle del articulo
          
           } 
         }
    }
    
    public Articulo obtenerArticulo(int posicion) { 
       for (int i = 0; i < articuloColeccion.length; i++){
          if ( i == posicion){                   
             return articuloColeccion[posicion];
          }    
       } 
       return null;
    } 
    
    public boolean  agregarArticulo(Articulo nuevoArticulo){
        
        for (int i = 0; i < articuloColeccion.length; i++){//idem eliminar
                     
           if(articuloColeccion[i] == null){ 
               articuloColeccion[i] = nuevoArticulo;
               return true;
           } 
        }
        return false;
    }     
    
    public boolean eliminarArticulo(int posicion){
        boolean a = false;
        
        if (posicion <  articuloColeccion.length){//cambiar numero estatico por longitud
             articuloColeccion[posicion] = null;
             a = true;     
        }    
        return a;
    }
    
    public boolean actualizarArticulo(int posicion, Articulo articuloActualizado){
        boolean a = false;
        
        if (posicion < articuloColeccion.length){//cambiar numero estatico x longitud
             articuloColeccion[posicion] = articuloActualizado;
             a = true;     
        }    
        return a;
    }
     
    public int espacioDisponible (){
        
        int espacioLibre = 0;
        
        for (int i = 0; i < articuloColeccion.length; i++){
            if (articuloColeccion[i] == null){
                espacioLibre++;
            }
        }
        return  espacioLibre;
    }
    
    public int cantidadArticulos (){
        
        int cantidadArticulos = 0;
        
        for (int i = 0; i < articuloColeccion.length; i++){
            if (articuloColeccion[i] != null){
                  System.out.println (articuloColeccion [i]);
                  cantidadArticulos++;
            }
        }
        return  cantidadArticulos;
    } 
}    
