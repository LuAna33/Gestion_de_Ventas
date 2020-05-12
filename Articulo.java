
public class Articulo{
     
    int codart = 0;
    int cantidad = 0;
    int preciounit = 0;
    int precioxcantidad = 0;
    String art="";
    Cliente cliente1;
    
    public Articulo(int codArt, int precio)
    {
        this.codart = codArt;
        this.preciounit = precio;
    }
    
    public Articulo(int codArt, int precio, int cantidad)
    {
        this.codart = codArt;
        this.preciounit = precio;
        this.cantidad = cantidad;
        this.precioxcantidad = preciounit * cantidad;
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
    String getArt(){
        return art;
    }
    void setCodart (int codart){
        this.codart = codart;
    }
    void setArt (String art){
        this.art = art ;
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
    int getPrecioxcantidad(){
        return precioxcantidad;
    }
}