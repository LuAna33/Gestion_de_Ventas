
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
        
                
       System.out.println (" Si desea realizar una venta ingrese 1 ");
       continuarComprando= reader.nextInt(); 
      
      while (continuarComprando == 1){
             
        cliente1 = entradaCliente(reader, reader1);
        articulo1 = entradaArticulo(reader, reader1);
        venta1 = entradaVenta(reader);
        procesarVenta(venta1, articulo1, cliente1);
               
        System.out.println (" Si desea realizar otra venta ingrese 1 ");
        continuarComprando= reader.nextInt();   
          
     }  
     
     if  (continuarComprando != 1){
           System.out.println("Fin del Programa");
     }
      
    }
        
    public static Cliente entradaCliente(Scanner reader, Scanner reader1){
        int dni;
        String nombreCliente;
        
        System.out.println("<<<<<<<Ingresar el DNI del cliente>>>>>>>>");
        dni = reader.nextInt();
                      
        System.out.println ("<<<<<<<Ingresar el nombre del cliente>>>>>>");
        nombreCliente = reader1.nextLine();
        return new Cliente (nombreCliente, dni);
    }
    
    public static Articulo entradaArticulo(Scanner reader, Scanner reader1){
       int codArt;
       String nombreArticulo;
       int preciounit;
       
       System.out.println ("<<<<<<Ingresar numero de codigo del articulo>>>>>>");
       codArt= reader.nextInt();
       
       System.out.println ("<<<<<Ingresar el nombre del articulo>>>>>>");
       nombreArticulo = reader1.nextLine();
       
       System.out.println ("<<<<<<Ingrese el precio por unidad del articulo>>>>>>");
       preciounit = reader.nextInt();
       return new Articulo (nombreArticulo,codArt, preciounit);
    }
    
    public static Venta entradaVenta(Scanner reader){   
       int codVenta;
       int cantidad;
       int cantidadMinima;
       int descuentoPorcentaje;
       
       System.out.println("<<<<<<<<< Por favor ingresar el Codigo de venta>>>>>>>>");
       codVenta = reader.nextInt(); 
       
       System.out.println ("<<<<<<<Ingrese la cantidad de articulos>>>>>>");
       cantidad = reader.nextInt(); 
       
       System.out.println("<<<<<<<Ingrese la cantidad minima para aplicar descuento por cantidad de productos comprados>>>>>>");
       cantidadMinima = reader.nextInt();
       
       System.out.println("<<<<<<<Ingrese el Porcentaje a aplicar del descuento por cantidad>>>>>>");
       descuentoPorcentaje = reader.nextInt();
       return new Venta (codVenta, cantidad, cantidadMinima, descuentoPorcentaje);
    } 
    
    public static void procesarVenta (Venta venta1, Articulo articulo1,Cliente cliente1){
        venta1.setCliente(cliente1);
        venta1.setArticulo(articulo1);
        venta1.imprimirVenta();
    }
}  
 
       
    
        
      
    
   
     
        
 


