
public class Venta { 
        int codVenta;
        int preciounit;
        int cantidad;
        int cantidadMinima;
        int descuentoPorcentaje;
        Cliente cliente;
        Articulo articulo;
            
    public Venta (int codVenta, int preciounit, int cantidad,int cantidadMinima,int descuentoPorcentaje){
        this.codVenta = codVenta;
        this.preciounit = preciounit;
        this.cantidad = cantidad;
        this.cantidadMinima = cantidadMinima;
        this.descuentoPorcentaje = descuentoPorcentaje;
    }
         
    public int calcularPrecioCantidad(){
        return preciounit * cantidad;        
    }
    
    public int calcularDescuentoCantidad (){
        return calcularPrecioCantidad() * descuentoPorcentaje / 100;
    }
    
    public int calcularPrecioFinal (){
        int precioCantidad = calcularPrecioCantidad();
        int descuentoCantidad = calcularDescuentoCantidad(); 
           
        if (cantidad >= cantidadMinima){
            return precioCantidad - descuentoCantidad;
        }else{
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
    
    int getPreciounit(){
        return preciounit;
    }
    
    void setPreciounit(int preciounit){
        this.preciounit = preciounit;
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
            System.out.println ("¡¡¡Gracias por su compra!!!");
            
            getCliente().imprimirCliente();
            getArticulo().imprimirArticulo();
    }
}        
    
    

