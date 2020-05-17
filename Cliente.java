public class Cliente{

    int dni = 0;
    String nombrecliente; 
    Cliente cliente1;
    
    public Cliente(){
    }

    int getDni(){
        return dni;
    }
    String getNombreCliente(){
        return nombrecliente;
    }
    void setDni (int dni){
        this.dni = dni;
    }
    void setNombreCliente (String nombrecliente){
        this.nombrecliente = nombrecliente;
    }
    public void imprimirCliente (){
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<DETALLE DEL CLIENTE>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        
        System.out.println ("///El Nombre del Cliente es..." + this.getNombreCliente() +"///");
        System.out.println ("///El DNI ingresado es... ///" + this.getDni() + "///");
    }
}


