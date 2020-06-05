

public class Venta { 
        int codVenta;
        int cantidad;
        int cantidadMinima;
        int descuentoPorcentaje;
        String continuarComprando;
        Cliente cliente;
        Articulo articulo;
        GestionArticulos articulos;
       
    public Venta (int codVenta,int cantidad,int cantidadMinima,int descuentoPorcentaje, Articulo articulo){
        this.codVenta = codVenta;
        this.cantidad = cantidad;
        this.cantidadMinima = cantidadMinima;
        this.descuentoPorcentaje = descuentoPorcentaje;
        this.articulo = articulo;
    }
                       
      int calcularPrecioCantidad(){
           return cantidad * this.getArticulo().getPreciounit();       
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
    
      int getCodVenta(){
            return codVenta;
      }
         
      void setCodVenta(int codVenta ){
            this.codVenta = codVenta;
      }
         
      int getCantidad(){
            return cantidad;
      }
    
      void setCantidad (int cantidad){
            this.cantidad = cantidad;  
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
                  
    public void imprimirVenta (){
        
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<DETALLE DE LA VENTA>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println ("///El codigo de venta ingresado es N°" + getCodVenta() +"///");
            System.out.println ("///La cantidad de articulos es..." + getCantidad() + "///");
            System.out.println ("///La cantidad minima para acceder al descuento es..." + getCantidadMinima() + "///");
            System.out.println ("///El porcentaje de descuento por cantidad es..." + getDescuentoPorcentaje() + "///");
            System.out.println ("///El monto final es ///$" + calcularPrecioFinal()+ "///");
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            getCliente().imprimirCliente();
            getArticulo().imprimirArticulo();
   }
   
}

  
    
    

