
public class Articulo{
    String nombreArticulo=""; 
    int codArt;
    double preciounit;
    
    public Articulo(String nombreArticulo){
        this.nombreArticulo=nombreArticulo;
    }
                 
    public Articulo(String nombreArticulo, int codArt, double preciounit){
        this.nombreArticulo = nombreArticulo;
        this.codArt = codArt;
        this.preciounit = preciounit;
    }
    
    @Override
    public boolean equals(Object objeto){
        
            if (this.getNombreArticulo().equals(((Articulo)objeto).getNombreArticulo()))
                return true;
             else return false;
    }
    
     
 
    
     public String toString(){

        return  "NOMBRE  "  + nombreArticulo + "  CODIGO  "  +   codArt   + " PRECIO UNITARIO "+ preciounit; 
    }
    
    int getCodArt(){
        return codArt;
    }
    
    void setCodArt (int codArt){
       this.codArt = codArt;
    }
    
    String getNombreArticulo(){
        return nombreArticulo;
    }
    
    void setNombreArticulo (String nombreArticulo){
    this.nombreArticulo = nombreArticulo;
    }
    
    double getPreciounit(){
        return preciounit;
    }
    
    void setPreciounit(double preciounit){
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
