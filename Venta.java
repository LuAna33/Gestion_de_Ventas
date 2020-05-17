
public class Venta { 
        int codventa = 0;
        Cliente cliente;
        Articulo articulo;
        
        //Completar los getter y setter
        Cliente getCliente(){
            return cliente;
        }
        void setCliente(Cliente cliente){
             this.cliente = cliente;
        }
        Articulo getArticulo(){
              return articulo;
        }
        void setArticulo (Articulo articulo){
             this.articulo = articulo;
        }
        int getCodVenta(){
            return codventa;
        }
        void setCodVenta(int codventa ){
             this.codventa = codventa;
        }
        
         public void imprimirVenta (){
                        
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<DETALLE DE LA VENTA>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            
            System.out.println ("///El codigo de venta ingresado es N°" + this.getCodVenta() +"///");
            System.out.println ("///El monto final es ///$" + this.getArticulo().getPrecioFinal()+ "///");
            System.out.println ("¡¡¡Gracias por su compra!!!");
            
            this.getCliente().imprimirCliente();
            this.getArticulo().imprimirArticulo();
        }
    
    }        
    
    

