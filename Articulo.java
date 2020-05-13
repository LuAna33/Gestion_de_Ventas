
public class Articulo{
     
    int codart = 0;
    int cantidad = 0;
    int preciounit = 0;
    int precioxcantidad = 0;
    int descuentoxcantidad = 0;
    int preciofinal= 0;
    String art="";
    Cliente cliente1;
    
    
    public Articulo(int codArt, int precio)
    {
        this.codart = codArt;
        this.preciounit = precio;
    }
    
    public Articulo(int codArt, int preciounit, int cantidad, int descuentoxcantidad)
    {
        this.codart = codArt;
        this.preciounit = preciounit;
        this.cantidad = cantidad;
        this.precioxcantidad = preciounit * cantidad;
        this.descuentoxcantidad = ((precioxcantidad * descuentoxcantidad) / 100);
        this.preciofinal = this.precioxcantidad - this.descuentoxcantidad;
        
    }
    
    Cliente getCliente1(){
        return cliente1;
    }
    
    void setCliente1(Cliente cliente1){
        this.cliente1 = cliente1;
    }
    
    int getCodart(){
        return codart;
    }
    void setCodart (int codart){
        this.codart = codart;
    }
    
    String getArt(){
        return art;
    }
    
        void setArt (String art){
        this.art = art ;
    }
    
    int getCantidad(){
        return cantidad;
    }
    void setCantidad (int cantidad){
        this.cantidad = cantidad;
        this.precioxcantidad = cantidad * preciounit;
        this.descuentoxcantidad = ((precioxcantidad * descuentoxcantidad) / 100);
        this.preciofinal = this.precioxcantidad - this.descuentoxcantidad;
    }
    int getPreciounit(){
        return preciounit;
    }
    void setPreciounit(int preciounit){
        this.preciounit = preciounit;
    }
    int getPrecioxcantidad(){
        return precioxcantidad;
    }
    int getDescuentoxcantidad(){
        return descuentoxcantidad;
    }
    int getPreciofinal (){
        return preciofinal;
    }
}