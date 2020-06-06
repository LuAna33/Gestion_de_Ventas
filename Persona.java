// SuperClase Persona

public class Persona{
    
    String nombre;
    int dni;
    
    Persona(String nombre, int dni){
        this.nombre = nombre;
        this.dni = dni;
    }
  
    @Override //Sobreescribe
    public String toString(){
        return "El nombre ingresado es..." + this.nombre + "El DNI ingresado es..." + this.dni;
    }
    
    public void imprimirPersona(){
        System.out.println ("El nombre ingresado es..." + nombre);
        System.out.println ("El DNI ingresado es..." + dni);
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