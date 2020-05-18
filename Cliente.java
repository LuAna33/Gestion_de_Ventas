public class Cliente{
    
    String nombreCliente;
    int dni = 0;
            
    public Cliente(String nombreCliente, int dni){
        this.nombreCliente = nombreCliente;
        this.dni = dni;
    }

    int getDni(){
        return dni;
    }
    String getNombreCliente(){
        return nombreCliente;
    }
    void setDni (int dni){
        this.dni = dni;
    }
    void setNombreCliente (String nombreCliente){
        this.nombreCliente = nombreCliente;
    }
    
    public void imprimirCliente (){
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<DETALLE DEL CLIENTE>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        
        System.out.println ("///El Nombre del Cliente es..." + this.getNombreCliente() +"///");
        System.out.println ("///El DNI ingresado es... ///" + this.getDni() + "///");
    }
}


