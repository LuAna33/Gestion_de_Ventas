
import java.util.Scanner;
public class ArticulosRepositorio {
        
    Articulo[] articuloColeccion;
        
    public ArticulosRepositorio (int cantidadArticulos){
        articuloColeccion = new Articulo [cantidadArticulos];
      
    }
   
    public int cantidadArticulos (){
        
        int cantidadArticulos = 0;
        
        for (int i = 0; i < articuloColeccion.length; i++){
            if (articuloColeccion[i] == null){
                  System.out.println (articuloColeccion [i]);
                  cantidadArticulos++;
            }
        }
        return cantidadArticulos;
    }

    public void listarArticuloColeccion(){ 
        
         for (int i = 0; i < articuloColeccion.length; i++){
           if (articuloColeccion[i] != null){
              System.out.println ("POSICION DEL ARTICULO:" + i );
              System.out.println(articuloColeccion[i]);//no imprimir nulls - to string para ver el detalle del articulo
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
     
    public boolean espacioDisponible (){
        
        boolean a = false;
                
       for (int i = 0; i < articuloColeccion.length; i++){
            if (articuloColeccion[i] == null){
            a = true;  
            }
       }
       return a;
    }
    
    public boolean posicionEncontrada(int posicion){
        boolean a = false;
        
        if (posicion <= articuloColeccion.length){
            a = true;
        } 
        return a;
    }    
 }    


