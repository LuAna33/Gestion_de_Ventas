public class ServicioVentasImpl implements ServicioVenta{
    
    ArticuloVenta articulo; 
    
    public ServicioVentasImpl (ArticuloVenta articulo){
        this.articulo=articulo;
    }
   
    public double calcularPrecioCantidad (){
           return articulo.getCantidad() * articulo.getPreciounit();  
    }   
    
    public double calcularDescuentoCantidad (){
            return calcularPrecioCantidad() * articulo.getDescuentoPorcentaje() / 100;
    }
    
    public double calcularPrecioFinal(){
           
           double calcularPrecioCantidad = calcularPrecioCantidad();
           double calcularDescuentoCantidad = calcularDescuentoCantidad(); 
           
           if (articulo.getCantidad() >= articulo.getCantidadMinima()){
              return calcularPrecioCantidad - calcularDescuentoCantidad;
           }
           else{
              return calcularPrecioCantidad;
           }       
    } 
      
} 
