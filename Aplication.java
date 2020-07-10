
 import java.util.Scanner;
 public class Aplication { 
     
    
     public static void main (String [] args) { 
                     
        Scanner reader = new Scanner(System.in);
        Scanner reader1 = new Scanner(System.in);
        int continuarComprando;
        
        Venta venta1;       
        Cliente cliente1;
        TipoCliente tipoCliente;

        System.out.println ("  Si desea realizar una venta ingrese 1");
        continuarComprando= reader.nextInt(); 
      
       while (continuarComprando == 1){

          cliente1 = entradaCliente(reader, reader1);
          venta1 = entradaVenta(reader);
          //articuloVenta1 = entradaArticuloVenta(reader);
          
          procesarVenta(venta1, cliente1);
          System.out.println (" Si desea realizar otra venta ingrese 1 ");
          continuarComprando= reader.nextInt();   
       }  
     
       if  (continuarComprando != 1){
           System.out.println("Fin del Programa");
       }
    }    
    
    public static Cliente entradaCliente(Scanner reader, Scanner reader1){
       int dni;
       String nombre;
       TipoCliente tipoCliente= TipoCliente.MAYORISTA;
        
       System.out.println("<<<<Ingresar el DNI del cliente>>>>");
       dni = reader.nextInt();
                      
       System.out.println ("<<<<<Ingresar el nombre del cliente>>>>");
       nombre = reader1.nextLine();
                     
       return new Cliente (nombre,dni, tipoCliente);
    }
    
    public static Empleado entradaEmpleado(Scanner reader, Scanner reader1){
        int dni;
        String nombre;
        PuestoEmpleado puestoEmpleado= PuestoEmpleado.VENDEDOR;
        
        System.out.println("<<<<<<<Ingresar DNI del Empleado >>>>>>>>");
        dni = reader.nextInt();
     
        System.out.println ("<<<<<<<Ingresar nombre del Empleado>>>>>>");
        nombre = reader1.nextLine();
                            
        return new Empleado (nombre,dni, puestoEmpleado);
    }
    
    public static Venta entradaVenta(Scanner reader){   

       int codVenta;
       int cantidadArticulos;
                   
       System.out.println("<<<<<<<<< Por favor ingresar el Codigo de venta>>>>>>>>");
       codVenta = reader.nextInt(); 
       
       System.out.println ("<<<<<<<Ingrese la cantidad de tipo de articulos>>>>>>");
       cantidadArticulos = reader.nextInt(); 
       

       ArticulosRepositorio articulosRepositorio = new ArticulosRepositorio(cantidadArticulos);
       
       return new Venta (codVenta, articulosRepositorio);

    } 
    
    public static void procesarVenta (Venta venta1,Cliente cliente1){
       
       UIVentas ventaUI = new UIVentas(venta1.getArticulosRepositorio());  
       venta1.setCliente(cliente1);
       ventaUI.seleccionarOpcion();
       venta1.imprimirVenta();

       //articuloVenta1.imprimirArticuloVenta();

       //.imprimirArticuloVenta();

    }
}
    
       
    
        
      
    
   
     
        
 


