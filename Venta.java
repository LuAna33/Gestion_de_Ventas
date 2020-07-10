

public class Venta { 
        int codVenta;

        String continuarComprando;
        Cliente cliente;
        ArticulosRepositorio articulosRepositorio;
        

    public Venta (int codVenta,ArticulosRepositorio articulosRepositorio){

        this.codVenta = codVenta;
        this.articulosRepositorio = articulosRepositorio;

    }  
     
    Cliente getCliente(){
            return cliente;
    }
    
    void setCliente(Cliente cliente){
           this.cliente = cliente;
    }
   
    ArticulosRepositorio getArticulosRepositorio(){
            return articulosRepositorio;
    }
   
    void setArticulosRepositorio (ArticulosRepositorio articulosRepositorio){
            this.articulosRepositorio = articulosRepositorio;
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
            getArticulosRepositorio().listarArticuloColeccion();
            getCliente().imprimirCliente();
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            
    }
}

  
    
    

