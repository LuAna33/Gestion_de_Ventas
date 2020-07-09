
public class ArticuloVenta extends Articulo{
  
     int cantidad;
     int cantidadMinima;
     double descuentoPorcentaje;
          
    public  ArticuloVenta (String nombreArticulo, int codArt, double preciounit,int cantidad, int cantidadMinima, double descuentoPorcentaje ){
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
    
    public int getCantidadMinima(){
          return cantidadMinima;
    }
    
     public void setCantidadMinima (int cantidadMinima){
        this.cantidadMinima = cantidadMinima;
    }
    public double getDescuentoPorcentaje(){
          return descuentoPorcentaje;
    }
    
     public void setDescuentoPorcentaje (double descuentoPorcentaje){
        this.descuentoPorcentaje = descuentoPorcentaje;
    }
    
}   