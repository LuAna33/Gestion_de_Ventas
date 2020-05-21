
import java.util.Scanner;
public class Aplication { 
    public static void main (String [] args) { 
        
        //La Aplicacion gestion la venta, y una venta se relaciona con un cliente y un articulo
        // Completas las relaciones 
        // Traer los datos de las relaciones
        Scanner reader = new Scanner(System.in);
        int codVenta;
        int dni;
        int codArt;
        int preciounit;
        int cantidadMinima;
        int cantidad ;
        int descuentoPorcentaje;
        String nombreArticulo="";
        String nombreCliente="";
        Venta venta1;
        Articulo articulo1;
        Cliente cliente1;
        
        System.out.println("<<<<<<<<<Bienvenido! Por favor ingresar el Codigo de venta>>>>>>>>");
        codVenta = reader.nextInt();
                      
        System.out.println("<<<<<<<Ingresar el DNI del cliente>>>>>>>>");
        dni = reader.nextInt();
                      
        Scanner reader1 = new Scanner(System.in);
        System.out.println ("<<<<<<<Ingresar el nombre del cliente>>>>>>");
        nombreCliente = reader1.nextLine();
                
        System.out.println ("<<<<<Ingresar el nombre del articulo>>>>>>");
        nombreArticulo = reader1.nextLine();
        System.out.println ("<<<<<<Ingresar numero de codigo del articulo>>>>>>");
        codArt= reader.nextInt();
        System.out.println ("<<<<<<Ingrese el precio por unidad del articulo>>>>>>");
        preciounit = reader.nextInt();
        System.out.println ("<<<<<<<Ingrese la cantidad de articulos>>>>>>");
        cantidad = reader.nextInt(); 
        System.out.println("<<<<<<<Ingrese la cantidad minima para aplicar descuento por cantidad de productos comprados>>>>>>");
        cantidadMinima = reader.nextInt();
        System.out.println("<<<<<<<Ingrese el Porcentaje a aplicar del descuento por cantidad>>>>>>");
        descuentoPorcentaje = reader.nextInt();
        
        cliente1 = new Cliente (nombreCliente, dni);                                       
        articulo1 = new Articulo (nombreArticulo, codArt, preciounit);
        venta1 = new Venta (codVenta,preciounit, cantidad, cantidadMinima, descuentoPorcentaje);
        venta1.setCliente(cliente1);
        venta1.setArticulo(articulo1);
        venta1.imprimirVenta();
        
   }
}   
     
        
 


