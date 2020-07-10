
public class ArticuloVenta extends Articulo{
  
     int cantidad;
     int cantidadMinima;
     double descuentoPorcentaje;
          
      public ArticuloVenta (String nombreArticulo, int codArt, double preciounit,int cantidad, int cantidadMinima, double descuentoPorcentaje ){

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
    
    double calcularPrecioCantidad(){
           return this.cantidad * this.getPreciounit();  
    }   
        
    double calcularDescuentoCantidad (){
            return calcularPrecioCantidad() * descuentoPorcentaje / 100;
    }
    
    double calcularPrecioFinal (){
           double precioCantidad = calcularPrecioCantidad();
           double descuentoCantidad = calcularDescuentoCantidad(); 
           
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
    
    double getDescuentoPorcentaje (){
         return descuentoPorcentaje;
    }
    
    void setDescuentoPorcentaje (double descuentoPorcentaje){
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

