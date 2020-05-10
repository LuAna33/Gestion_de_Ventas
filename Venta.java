
public class Venta { 
        int codventa = 0;
        int precio = 0;
        Cliente cliente;
        Articulo articulo;
        
        //Completar los getter y setter
        Cliente getCliente(){
            return cliente;
        }
        void setCliente(Cliente cliente){
             this.cliente = cliente;
        }
        Articulo getArticulo(){
              return articulo;
        }
        void setArticulo (Articulo articulo){
             this.articulo = articulo;
        }
        int getCodventa(){
            return codventa;
        }
        void setCodventa(int codventa ){
             this.codventa = codventa;
        }
        int getPrecio(){
            return precio;
        }
        void setPrecio (int precio){
             this.precio = precio;
        }
                     
                
}    
        
    
    

