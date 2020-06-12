

public class Venta { 
        int codVenta;
        int cantidadUnidades;
        int cantidadMinima;
        int descuentoPorcentaje;
        String continuarComprando;
        Cliente cliente;
        GestionArticulos gestionArticulos;
        
public Venta (int codVenta,int cantidadUnidades,int cantidadMinima,int descuentoPorcentaje, GestionArticulos gestionArticulos){

        this.codVenta = codVenta;
        this.cantidadUnidades = cantidadUnidades;
        this.cantidadMinima = cantidadMinima;
        this.descuentoPorcentaje = descuentoPorcentaje;
        this.gestionArticulos = gestionArticulos;
       
    }
                       
    int calcularPrecioCantidad(){
           //return cantidadUnidades * this.getGestionArticulos().getEntradaArticulo().getPreciounit();  
           return 1;
    }
    
    int calcularDescuentoCantidad (){
            return calcularPrecioCantidad() * descuentoPorcentaje / 100;
    }
    
     int calcularPrecioFinal (){
           int precioCantidad = calcularPrecioCantidad();
           int descuentoCantidad = calcularDescuentoCantidad(); 
           
           if (cantidadUnidades >= cantidadMinima){
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
   
    GestionArticulos getGestionArticulos(){
            return gestionArticulos;
    }
   

    void setGestionArticulos (GestionArticulos gestionArticulos){
            this.gestionArticulos = gestionArticulos;
    }
         
    int getCodVenta(){
            return codVenta;
    }
         
    void setCodVenta(int codVenta ){
            this.codVenta = codVenta;
    }
         
    int getCantidadUnidades(){
            return cantidadUnidades;
    }
    
    void setCantidadUnidades (int cantidadUnidades){
            this.cantidadUnidades = cantidadUnidades;  
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

            System.out.println ("///CODIGO DE VENTA " + getCodVenta() +"///");
            System.out.println ("///CANTIDAD DE UNIDADES" + getCantidadUnidades() + "///");
            System.out.println ("///DESCUENTO %" + getDescuentoPorcentaje() + "///");
            System.out.println ("///MONTO FINAL///$" + calcularPrecioFinal()+ "///");
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            getGestionArticulos().listarArticuloColeccion();
            getCliente().imprimirCliente();
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            //getGestionArticulos().imprimirGestionArticulos();
    }

   
}

  
    
    

