
public class Venta { 
        
        int codVenta = 0;
        int preciounit = 0;
        int cantidad = 0;
        int cantidadMinima = 0;
        int descuentoPorcentaje = 0;
        int precioxCantidad = 0;
        int descuentoxCantidad = 0;    
        int precioFinal= 0;
        Cliente cliente;
        Articulo articulo;
    
        
    public Venta (int codVenta, int preciounit, int cantidad,int cantidadMinima,int descuentoPorcentaje){
        this.codVenta = codVenta;
        this.preciounit = preciounit;
        this.cantidad = cantidad;
        this.cantidadMinima = cantidadMinima;
        this.descuentoPorcentaje = descuentoPorcentaje;
        actualizarDatos(preciounit, cantidad, cantidadMinima, descuentoPorcentaje);
    }
        
    public void actualizarDatos(int preciounit, int cantidad,int cantidadMinima,int descuentoPorcentaje){
        
        this.preciounit = preciounit;
        this.cantidad = cantidad;
        this.cantidadMinima = cantidadMinima;
        this.descuentoPorcentaje = descuentoPorcentaje;
        //Calculables
        this.precioxCantidad = this.preciounit * this.cantidad;
        if (this.cantidad >= this.cantidadMinima){
        this.descuentoxCantidad = ((this.precioxCantidad * this.descuentoPorcentaje) / 100);
        this.precioFinal = this.precioxCantidad - this.descuentoxCantidad;
        System.out.println ("Dada la cantidad de unidades compradas es beneficiario de un descuento del " + descuentoPorcentaje + "%");
        }
        else{
            precioFinal = precioxCantidad;
        }
    }
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
        actualizarDatos(preciounit, cantidad, cantidadMinima, descuentoPorcentaje);   
    }
    
    int getPreciounit(){
        return preciounit;
    }
    
    void setPreciounit(int preciounit){
        this.preciounit = preciounit;
        actualizarDatos(preciounit, cantidad, cantidadMinima, descuentoPorcentaje);
    }
    
    int getPrecioxCantidad(){
        return precioxCantidad;
    }
    
    void setPrecioxCantidad (int precioxCantidad){
       this.precioxCantidad = this.preciounit * this.cantidad;
       actualizarDatos(preciounit, cantidad, cantidadMinima, descuentoPorcentaje);
    }
        
    int getDescuentoxCantidad(){
        return descuentoxCantidad;
    }
    void setDescuentoxCantidad (int descuentoxcantidad){
    this.descuentoxCantidad = descuentoxCantidad;
    actualizarDatos(preciounit, cantidad, cantidadMinima, descuentoPorcentaje);
    }
    int getPrecioFinal (){
        return precioFinal;
    }
    int getCantidadMinima(){
        return cantidadMinima;
    }
    void setCantidadMinima(int cantidadMinima){
        this.cantidadMinima = cantidadMinima;
        actualizarDatos(preciounit, cantidad, cantidadMinima, descuentoPorcentaje);
    }
    int getDescuentoPorcentaje (){
        return descuentoPorcentaje;
    }
    void setDescuentoPorcentaje (int descuentoPorcentaje){
        this.descuentoPorcentaje = descuentoPorcentaje;
        actualizarDatos(preciounit, cantidad, cantidadMinima, descuentoPorcentaje);
      
    }
        
    public void imprimirVenta (){
                        
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<DETALLE DE LA VENTA>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
           
            System.out.println ("///El codigo de venta ingresado es N°" + this.getCodVenta() +"///");
            System.out.println ("///La cantidad de articulos es..." + this.getCantidad() + "///");
            System.out.println ("///La cantidad minima para acceder al descuento es..." + this.getCantidadMinima() + "///");
            System.out.println ("///El porcentaje de descuento por cantidad es..." + this.getDescuentoPorcentaje() + "///");
            System.out.println ("///El monto final es ///$" + this.getPrecioFinal()+ "///");
            System.out.println ("¡¡¡Gracias por su compra!!!");
            
            this.getCliente().imprimirCliente();
            this.getArticulo().imprimirArticulo();
    }
}        
    
    

