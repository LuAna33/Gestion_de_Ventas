
public class ArticuloVenta extends Articulo{
  
     int cantidad;
     int cantidadMinima;
     int descuentoPorcentaje; 
     
    public ArticuloVenta (String nombreArticulo, int codArt, int preciounit,int cantidad,int cantidadMinima,int descuentoPorcentaje ){
        super(nombreArticulo,codArt,preciounit);
        this.cantidad = cantidad;
        this.cantidadMinima = cantidadMinima;
        this.descuentoPorcentaje = descuentoPorcentaje;
        
    }  
    
    public String toString(){
        return " NOMBRE DEL ARTICULO =  "  + nombreArticulo + " NUMERO DE CODIGO = " 
                + codArt+  " PRECIO POR UNIDAD = "  + preciounit + "CANTIDAD DE ARTICULOS"  + cantidad; 
    }
          
     public int getCantidad(){
          return cantidad;
    }
    
     public void setCantidad (int cantidad){
        this.cantidad = cantidad;
    }
    
    int calcularPrecioCantidad(){
           return this.cantidad * this.getPreciounit();  
    }   
        
    int calcularDescuentoCantidad (){
            return calcularPrecioCantidad() * descuentoPorcentaje / 100;
    }
    
    int calcularPrecioFinal (){
           int precioCantidad = calcularPrecioCantidad();
           int descuentoCantidad = calcularDescuentoCantidad(); 
           
           if (cantidad >= cantidadMinima){
              return precioCantidad - descuentoCantidad;
           }
           else{
              return precioCantidad;
           }       
    } 
                  
    int getCantidadMinima(){
        return cantidadMinima;
    }
      
    void setCantidadMinima(int cantidadMinima){
        this.cantidadMinima = cantidadMinima;
    }
    
    int getDescuentoPorcentaje (){
         return descuentoPorcentaje;
    }
    
    void setDescuentoPorcentaje (int descuentoPorcentaje){
        this.descuentoPorcentaje = descuentoPorcentaje;
    }
    
   public void imprimirArticuloVenta(){
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>");
            System.out.println ("///CANTIDAD DE UNIDADES" + getCantidad() + "///");
            System.out.println ("///DESCUENTO %" + getDescuentoPorcentaje() + "///");
            System.out.println ("///MONTO FINAL///$" + calcularPrecioFinal()+ "///");
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>");
   }
}