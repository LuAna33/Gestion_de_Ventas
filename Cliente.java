public class Cliente{

    int dni = 0;
    String nombre; 
    Cliente cliente1;
    
    public Cliente(){
    }

    int getDni(){
        return dni;
    }
    String getNombre(){
        return nombre;
    }
    void setDni (int dni){
        this.dni = dni;
    }
    void setNombre (String nombre){
        this.nombre = nombre;
    }
}
