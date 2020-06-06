
public class Empleado extends Persona{
        
    PuestoEmpleado puestoEmpleado; 
    
    Empleado (String nombre, int dni, PuestoEmpleado puestoEmpleado){
        super(nombre,dni);//Para invocar al contructor de la SuperClase//
        this.puestoEmpleado = puestoEmpleado;
    }
    
    public String toString(){
        return " Nombre = " + nombre + " D.N.I. = " + dni + " Puesto ocupado por el empleado = " + puestoEmpleado; 
    }
    
        PuestoEmpleado getPuestoEmpleado(){
          return puestoEmpleado;
    }
    
        void setPuestoEmpleado (PuestoEmpleado puestoEmpleado){
        this.puestoEmpleado = puestoEmpleado;
    }

    public void imprimirEmpleado (){
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<DETALLE DEL EMPLEADO>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        
        System.out.println ("/// Nombre del Empleado ..." + nombre);
        System.out.println ("/// DNI del Empleado... " + dni);
        System.out.println ("/// Puesto del Empleado..." + puestoEmpleado);
    }


}

