
import java.util.Scanner;
public class Aplication { 
    public static void main (String [] args) { 
        
        //La Aplicacion gestion la venta, y una venta se relaciona con un cliente y un articulo
        // Completas las relaciones 
        // Traer los datos de las relaciones
        Scanner reader = new Scanner(System.in);
        int codVenta = 0;
        int dni = 0;
        int codArt = 0;
        int preciounit = 0;
        int cantidadMinima = 0;
        int cantidad = 0;
        int precioxCantidad = 0;
        int descuentoPorcentaje = 0;
        int descuentoxCantidad = 0;
        int precioFinal = 0;
        String nombreArticulo="";
        String nombreCliente="";
        Articulo articulo1;
        
        Venta venta1= new Venta();
        System.out.println("<<<<<<<<<Bienvenido! Por favor ingresar el Codigo de venta>>>>>>>>");
        codVenta = reader.nextInt();
        venta1.setCodVenta(codVenta);
                
        Cliente cliente1 = new Cliente();
        System.out.println("<<<<<<<Ingresar el DNI del cliente>>>>>>>>");
        dni = reader.nextInt();
        cliente1.setDni(dni);
              
        Scanner reader1 = new Scanner(System.in);
        System.out.println ("<<<<<<<Ingresar el nombre del cliente>>>>>>");
        nombreCliente = reader1.nextLine();
        cliente1.setNombreCliente(nombreCliente);
        
        System.out.println ("<<<<<Ingresar el nombre del articulo>>>>>>");
        nombreArticulo = reader1.nextLine();
        System.out.println ("<<<<<<Ingresar numero de codigo del articulo>>>>>>");
        codArt= reader.nextInt();
        System.out.println ("<<<<<<Ingrese el precio por unidad del articulo>>>>>>");
        preciounit = reader.nextInt();
        System.out.println("<<<<<<<Ingrese la cantidad minima para aplicar descuento por cantidad de productos comprados>>>>>>");
        cantidadMinima =  reader.nextInt();
        System.out.println("<<<<<<<Ingrese el Porcentaje a aplicar del descuento por cantidad>>>>>>");
        descuentoPorcentaje = reader.nextInt();
        System.out.println ("<<<<<<<Ingrese la cantidad de articulos>>>>>>");
        cantidad = reader.nextInt(); 
                                             
        articulo1 = new Articulo(nombreArticulo, codArt, preciounit, cantidad, cantidadMinima, descuentoPorcentaje);
      
        venta1.setCliente(cliente1);
        venta1.setArticulo(articulo1);
        venta1.imprimirVenta();
        
    }
}   
     
        
 


