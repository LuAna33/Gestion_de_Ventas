
public class Articulo{
    String nombreArticulo=""; 
    int codArt = 0;
    int preciounit = 0;
    int cantidad = 0;
    int cantidadMinima = 0;
    int descuentoPorcentaje = 0;
    int precioxCantidad = 0;
    int descuentoxCantidad = 0;    
    int precioFinal= 0;
              
    public Articulo(int codArt, int preciounit){
        this.codArt = codArt;
        this.preciounit = preciounit;
    }
    
    public Articulo(String nombreArticulo, int codArt, int preciounit, int cantidad,int cantidadMinima,int descuentoPorcentaje)
    {
        this.nombreArticulo = nombreArticulo;
        this.codArt = codArt; 
        actualizarDatos(preciounit, cantidad, cantidadMinima, descuentoPorcentaje);
    }
        
     public void actualizarDatos(int preciounit, int cantidad,int cantidadMinima,int descuentoPorcentaje)
    {
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
            
    int getCodArt(){
        return codArt;
    }
    void setCodArt (int codart){
        this.codArt = codArt;
    }
    
    String getNombreArticulo(){
        return nombreArticulo;
    }
    
    void setNombreArticulo (String nombreArticulo){
    this.nombreArticulo = nombreArticulo ;
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