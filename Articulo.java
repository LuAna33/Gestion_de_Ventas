
public class Articulo{
    String nombreArticulo=""; 
    int codArt;
    int preciounit;
                 
    public Articulo(String nombreArticulo, int codArt, int preciounit){
        this.nombreArticulo = nombreArticulo;
        this.codArt = codArt;
        this.preciounit = preciounit;
    }
    
     public String toString(){
        return  "  Nombre  "  + nombreArticulo + "  Codigo  "  +   codArt   + " Precio Unitario "+ preciounit; 
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
    
    int getPreciounit(){
        return preciounit;
    }
    
    void setPreciounit(int preciounit){
        this.preciounit = preciounit;
    }   
           
    public void imprimirArticulo (){
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<DETALLE DEL ARTICULO >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        
        System.out.println ("///El N° codigo del Articulo es ///" + this.getCodArt() +"///");
        System.out.println ("///El Articulo ingresado es ///" + this.getNombreArticulo() + "///");
        System.out.println ("///El Precio por unidad es...///" + this.getPreciounit() + "///");
        
    }
}    
