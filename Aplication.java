
import java.util.Scanner;


 public class Aplication { 
    
     
     public static void main (String [] args) { 
        
        //La Aplicacion gestion la venta, y una venta se relaciona con un cliente y un articulo
        // Completas las relaciones 
        // Traer los datos de las relaciones
        Scanner reader = new Scanner(System.in);
        Scanner reader1 = new Scanner(System.in);
        
        int preciounit;
        int cantidadMinima;
        int cantidad ;
        int descuentoPorcentaje;
        int continuarComprando;
        int codVenta;
        int dni;
        int codArt;
        String nombreArticulo=""; 
        String nombreCliente="";
       
        Articulo articulo1;
        Cliente cliente1;
        Venta venta1;
        Empleado empleado1;
        TipoCliente tipoCliente;
        PuestoEmpleado puestoEmpleado;        
      
        System.out.println (" PARA REALIZAR UNA VENTA INGRESAR 1 ");
       continuarComprando= reader.nextInt(); 
      
      while (continuarComprando == 1){
             
        cliente1 = entradaCliente(reader, reader1);
        articulo1 = entradaArticulo(reader, reader1);
        empleado1= entradaEmpleado (reader, reader1);
        venta1 = entradaVenta(reader, articulo1);
        procesarVenta(venta1, articulo1,empleado1, cliente1);
               
        System.out.println (" PARA REALIZAR OTRA VENTA INGRESE 1 ");
        continuarComprando= reader.nextInt();   
          
     }  
     
     if  (continuarComprando != 1){
           System.out.println("FIN DE LA OPERACION");
     }
      
    }
        
    public static Cliente entradaCliente(Scanner reader, Scanner reader1){
        int dni;
        String nombre;
        TipoCliente tipoCliente= TipoCliente.MAYORISTA;
        
        System.out.println("<<<<<<<Ingresar el DNI del cliente>>>>>>>>");
        dni = reader.nextInt();
                      
        System.out.println ("<<<<<<<Ingresar el nombre del cliente>>>>>>");
        nombre = reader1.nextLine();
                     
        return new Cliente (nombre,dni, tipoCliente);
        
    }
    
    public static Articulo entradaArticulo(Scanner reader, Scanner reader1){
       int codArt;
       String nombreArticulo;
       int preciounit;
       
       System.out.println ("<<<<<<Ingresar numero de codigo del articulo>>>>>>");
       codArt= reader.nextInt();
       
       System.out.println ("<<<<<Ingresar nombre del articulo>>>>>>");
       nombreArticulo = reader1.nextLine();
       
       System.out.println ("<<<<<<Ingresar precio por unidad del articulo>>>>>>");
       preciounit = reader.nextInt();
       return new Articulo (nombreArticulo,codArt, preciounit);
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
    
    public static Venta entradaVenta(Scanner reader,Articulo articulo1){   
        int codVenta;
        int cantidad;
        int cantidadMinima;
        int descuentoPorcentaje;
       
        System.out.println("<<<<<<<<< Ingresar Codigo de venta>>>>>>>>");
         codVenta = reader.nextInt(); 
       
        System.out.println ("<<<<<<<Ingresar cantidad de articulos>>>>>>");
         cantidad = reader.nextInt(); 
       
        System.out.println("<<<<<<<Ingresar cantidad minima para aplicar descuento por cantidad de productos comprados>>>>>>");
         cantidadMinima = reader.nextInt();
       
        System.out.println("<<<<<<<Ingresar Porcentaje a aplicar del descuento por cantidad>>>>>>");
         descuentoPorcentaje = reader.nextInt();
         return new Venta (codVenta, cantidad, cantidadMinima, descuentoPorcentaje, articulo1);
    } 
    
    public static void procesarVenta (Venta venta1, Articulo articulo1, Empleado empleado1,Cliente cliente1 ){
        venta1.setCliente(cliente1);
        venta1.setArticulo(articulo1);
        venta1.setEmpleado(empleado1);
        venta1.imprimirVenta();
    }
}  
 
       
    
        
      
    
   
     
        
 


