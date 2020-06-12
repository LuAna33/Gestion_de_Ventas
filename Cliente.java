public class Cliente extends Persona{
        
    TipoCliente tipoCliente; 
    
    Cliente (String nombre, int dni, TipoCliente tipoCliente){
        super(nombre,dni);//Para invocar al contructor de la SuperClase//
        this.tipoCliente=tipoCliente;
    }
    
    public String toString(){
        return " nombre   " + nombre + " dni " + dni + " tipoCliente " + tipoCliente; 
    }
  
     public void mostrarTipoCliente(){
        System.out.println(" El tipo de cliente ingresado es ..." + tipoCliente);
    }
   
        TipoCliente getTipoCliente(){
          return tipoCliente;
    }
    
        void setTipoCliente (TipoCliente tipoCliente){
        this.tipoCliente = tipoCliente;
    }
    
    public void imprimirCliente (){
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<DETALLE DEL CLIENTE>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        
        System.out.println ("///CLIENTE" + nombre);
        System.out.println ("///DNI " + dni);
        System.out.println ("///TIPO DE CLIENTE"+ tipoCliente);
    }
}


