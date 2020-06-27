

public class Venta { 
        int codVenta;
        
        
        String continuarComprando;
        Cliente cliente;
        GestionArticulos gestionArticulos;
        
    public Venta (int codVenta,GestionArticulos gestionArticulos){

        this.codVenta = codVenta;
         this.gestionArticulos = gestionArticulos;
        
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
         
           
    public void imprimirVenta (){
        
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<DETALLE DE LA VENTA>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println ("///CODIGO DE VENTA " + getCodVenta() +"///");
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            getGestionArticulos().listarArticuloColeccion();
            getCliente().imprimirCliente();
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            //getGestionArticulos().imprimirGestionArticulos();
    }
}

  
    
    

