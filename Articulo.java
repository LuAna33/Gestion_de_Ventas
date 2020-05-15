
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
            
    int getCodart(){
        return codart;
    }
    void setCodart (int codart){
        this.codart = codart;
    }
    
    String getNombrearticulo(){
        return nombrearticulo;
    }
    
    void setNombrearticulo (String nombrearticulo){
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
    
    int getPrecioxcantidad(){
        return precioxcantidad;
    }
    
    void setPrecioxcantidad (int precioxcantidad){
       this.precioxcantidad = this.preciounit * this.cantidad;
       actualizarDatos(preciounit, cantidad, cantidadminima, descuentoporcentaje);
    }
        
    int getDescuentoxcantidad(){
        return descuentoxcantidad;
    }
    void setDescuentoxcantidad (int descuentoxcantidad){
    this.descuentoxcantidad = descuentoxcantidad;
    actualizarDatos(preciounit, cantidad, cantidadminima, descuentoporcentaje);
    }
    int getPreciofinal (){
        return preciofinal;
    }
    int getCantidadminima(){
        return cantidadminima;
    }
    void setcantidadminima(int cantidadminima){
        this.cantidadminima = cantidadminima;
        actualizarDatos(preciounit, cantidad, cantidadminima, descuentoporcentaje);
    }
    int getDescuentoporcentaje (){
        return descuentoporcentaje;
    }
    void setdescuentoporcentaje (int descuentoporcentaje){
        this.descuentoporcentaje = descuentoporcentaje;
        actualizarDatos(preciounit, cantidad, cantidadminima, descuentoporcentaje);
      
    }
}