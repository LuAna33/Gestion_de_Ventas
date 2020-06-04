
import java.util.Scanner;
 public class GestionArticulos {
        
        Articulo[]articuloColeccion = {null, null, null, null };
                   
           
    public void listarArticuloColeccion(){ 
        
        for (int i = 0; i < articuloColeccion.length; i++){
           
           System.out.println (articuloColeccion[i]);//no imprimir nulls - to string para ver el detalle del articulo
          
        } 
    }
    
    public boolean  agregarArticulo(Articulo nuevoArticulo){
        
        for (int i = 0; i < 4; i++){//idem eliminar
                     
           if(articuloColeccion[i] == null){ 
                 articuloColeccion[i] = nuevoArticulo;
                 return true;
           } 
        }
        return false;
    }     
    
    public boolean eliminarAriculo(int posicion){
        boolean a = false;
        
        if (posicion < 4){//cambiar numero estatico por longitud
             articuloColeccion[posicion] = null;
             a = true;     
        }    
        return a;
    }
    
    public boolean actualizarArticulo(int posicion, Articulo articuloActualizado){
        boolean a = false;
        
        if (posicion < 4){//cambiar numero estatico x longitud
             articuloColeccion[posicion] = articuloActualizado;
             a = true;     
        }    
        return a;
    }
        
    // Metodo que muestre espacios libres
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
