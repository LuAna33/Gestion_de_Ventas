 
public class ServicioVentasMayorImpl implements ServicioVenta{
                                                              
       ArticuloVenta articulo; 
    
       public ServicioVentasMayorImpl (ArticuloVenta articulo){
        this.articulo=articulo;
       }
   
       public double calcularPrecioCantidad (){
           return articulo.getCantidad() * articulo.getPreciounit();  
       } 
       public double calcularDescuentoCantidad (){
            return calcularPrecioCantidad() * articulo.getDescuentoPorcentaje() / 100;
    }
    
    public double calcularPrecioFinal(){
           
           double precioCantidad = calcularPrecioCantidad();
           double descuentoCantidad = calcularDescuentoCantidad(); 
           
           if (articulo.getCantidad() >= articulo.getCantidadMinima()){
              return precioCantidad - descuentoCantidad;
           }
           else{
              return precioCantidad;
           }       
    } 
                     
   public void imprimirArticuloVenta(){
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>");
            System.out.println ("///CANTIDAD DE UNIDADES" + articulo.getCantidad() + "///");
            System.out.println ("///DESCUENTO %" + articulo.getDescuentoPorcentaje() + "///");
            //System.out.println ("///MONTO FINAL///$" + articulo.getCalcularPrecioFinal()+ "///");
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>");
   }
   
} 

    
    

    
    
    
    
    
    
    
    







