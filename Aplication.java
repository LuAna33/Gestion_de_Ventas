
import java.util.Scanner;
public class Aplication { 
    public static void main (String [] args) { 
        
        //La Aplicacion gestion la venta, y una venta se relaciona con un cliente y un articulo
        // Completas las relaciones 
        // Traer los datos de las relaciones
        Scanner reader = new Scanner(System.in);
        int codventa = 0;
        int dni = 0;
        int codart = 0;
        int preciounit = 0;
        int cantidadminima = 0;
        int cantidad = 0;
        int precioxcantidad = 0;
        int descuentoporcentaje = 0;
        int descuentoxcantidad = 0;
        int preciofinal = 0;
        String nombrearticulo="";
        String nombre="";
        Articulo articulo1;
        
        Venta venta1= new Venta();
        System.out.println("<<<<<<<<<Bienvenido! Por favor ingresar el Codigo de venta>>>>>>>>");
        codventa = reader.nextInt();
        venta1.setCodventa(codventa);
                
        Cliente cliente1 = new Cliente();
        System.out.println("<<<<<<<Ingresar el DNI del cliente>>>>>>>>");
        dni = reader.nextInt();
        cliente1.setDni(dni);
              
        Scanner reader1 = new Scanner(System.in);
        System.out.println ("<<<<<<<Ingresar el nombre del cliente>>>>>>");
        nombre = reader1.nextLine();
        cliente1.setNombre(nombre);
        
        System.out.println ("<<<<<Ingresar el nombre articulo>>>>>>");
        nombrearticulo = reader1.nextLine();
        System.out.println ("<<<<<<Ingresar numero de codigo del articulo>>>>>>");
        codart= reader.nextInt();
        System.out.println ("<<<<<<Ingrese el precio por unidad del articulo>>>>>>");
        preciounit = reader.nextInt();
        System.out.println("<<<<<<<Ingrese la cantidad minima para aplicar descuento por cantidad de productos comprados>>>>>>");
        cantidadminima =  reader.nextInt();
        System.out.println("<<<<<<<Ingrese el Porcentaje a aplicar del descuento por cantidad>>>>>>");
        descuentoporcentaje = reader.nextInt();
        System.out.println ("<<<<<<<Ingrese la cantidad de articulos>>>>>>");
        cantidad = reader.nextInt(); 
                                             
        Articulo articulo2 = new Articulo(nombrearticulo, codart, preciounit, cantidad, cantidadminima, descuentoporcentaje);
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<DETALLE DE LA VENTA>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println ("///El codigo de venta ingresado es N°" + venta1.getCodventa() +"///");
        System.out.println ("///El dni ingresado es ///" + cliente1.getDni() + "///");
        System.out.println ("///El nombre del Cliente ingresado es///" + cliente1.getNombre()+ "///");
        System.out.println ("///El articulo ingresado es /// " + articulo2.getNombrearticulo()+ "///"); 
        System.out.println ("///El numero de codigo del articulo ingresado es /// " + articulo2.getCodart() + "///");
        System.out.println ("///El monto final es ///$" + articulo2.getPreciofinal()+ "///");
        System.out.println ("¡¡¡Gracias por su compra!!!");
    }    
}
