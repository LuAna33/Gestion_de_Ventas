
public class Articulo{
    String nombrearticulo=""; 
    int codart = 0;
    int preciounit = 0;
    int cantidad = 0;
    int cantidadminima = 0;
    int descuentoporcentaje = 0;
    int precioxcantidad = 0;
    int descuentoxcantidad = 0;    
    int preciofinal= 0;
              
    public Articulo(int codart, int preciounit){
        this.codart = codart;
        this.preciounit = preciounit;
    }
    
    public Articulo(String nombrearticulo, int codart, int preciounit, int cantidad,int cantidadminima,int descuentoporcentaje)
    {
        this.nombrearticulo = nombrearticulo;
        this.codart = codart; 
        actualizarDatos(preciounit, cantidad, cantidadminima, descuentoporcentaje);
    }
        
     public void actualizarDatos(int preciounit, int cantidad,int cantidadminima,int descuentoporcentaje)
    {
        this.preciounit = preciounit;
        this.cantidad = cantidad;
        this.cantidadminima = cantidadminima;
        this.descuentoporcentaje = descuentoporcentaje;
        //Calculables
        this.precioxcantidad = this.preciounit * this.cantidad;
        if (this.cantidad >= this.cantidadminima){
        this.descuentoxcantidad = ((this.precioxcantidad * this.descuentoporcentaje) / 100);
        this.preciofinal = this.precioxcantidad - this.descuentoxcantidad;
        System.out.println ("Dada la cantidad de unidades compradas es beneficiario de un descuento del " + descuentoporcentaje + "%");
        }
        else{
            preciofinal = precioxcantidad;
        }
    }
            
    int getCodArt(){
        return codart;
    }
    void setCodArt (int codart){
        this.codart = codart;
    }
    
    String getNombreArticulo(){
        return nombrearticulo;
    }
    
    void setNombreArticulo (String nombrearticulo){
    this.nombrearticulo = nombrearticulo ;
    }
    
    int getCantidad(){
        return cantidad;
    }
    
    void setCantidad (int cantidad){
        this.cantidad = cantidad;
        actualizarDatos(preciounit, cantidad, cantidadminima, descuentoporcentaje);   
    }
    
    int getPreciounit(){
        return preciounit;
    }
    
    void setPreciounit(int preciounit){
        this.preciounit = preciounit;
        actualizarDatos(preciounit, cantidad, cantidadminima, descuentoporcentaje);
    }
    
    int getPrecioxCantidad(){
        return precioxcantidad;
    }
    
    void setPrecioxCantidad (int precioxcantidad){
       this.precioxcantidad = this.preciounit * this.cantidad;
       actualizarDatos(preciounit, cantidad, cantidadminima, descuentoporcentaje);
    }
        
    int getDescuentoxCantidad(){
        return descuentoxcantidad;
    }
    void setDescuentoxCantidad (int descuentoxcantidad){
    this.descuentoxcantidad = descuentoxcantidad;
    actualizarDatos(preciounit, cantidad, cantidadminima, descuentoporcentaje);
    }
    int getPrecioFinal (){
        return preciofinal;
    }
    int getCantidadMinima(){
        return cantidadminima;
    }
    void setCantidadMinima(int cantidadminima){
        this.cantidadminima = cantidadminima;
        actualizarDatos(preciounit, cantidad, cantidadminima, descuentoporcentaje);
    }
    int getDescuentoPorcentaje (){
        return descuentoporcentaje;
    }
    void setDescuentoPorcentaje (int descuentoporcentaje){
        this.descuentoporcentaje = descuentoporcentaje;
        actualizarDatos(preciounit, cantidad, cantidadminima, descuentoporcentaje);
      
    }
    public void imprimirArticulo (){
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<DETALLE DEL ARTICULO >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        
        System.out.println ("///El N° codigo del Articulo es ///" + this.getCodArt() +"///");
        System.out.println ("///El Articulo ingresado es ///" + this.getNombreArticulo() + "///");
        System.out.println ("///La cantidad de articulos es...///" + this.getCantidad() +"///");
        System.out.println ("///El Precio por unidad es...///" + this.getPreciounit() + "///");
        System.out.println ("///El descuento por Cantidad es...///" + this.getDescuentoxCantidad() +"///");
        System.out.println ("///La Cantidad minima para acceder a un descuento es... ///" + this.getCantidadMinima() + "///");
        System.out.println ("///El porcentaje a descontar por cantidad es..." + this.getDescuentoPorcentaje() +"///");
    }
        
}