
import java.util.Scanner;
public class Aplication { 
    public static void main (String [] args) { 
        
        //La Aplicacion gestion la venta, y una venta se relaciona con un cliente y un articulo
        // Completas las relaciones 
        // Traer los datos de las relaciones
        Scanner reader = new Scanner(System.in);
        int codventa = 0;
        int dni = 0;
        int preciounit = 0;
        int codart = 0;
        String art="";
        String nombre="";
        
        Venta venta1= new Venta();
        System.out.println("Ingrese el Codigo de venta");
        codventa = reader.nextInt();
        venta1.setCodventa(codventa);
        
        
        Cliente cliente1 = new Cliente();
        System.out.println("Bienvenido. Ingrese el DNI del cliente");
        dni = reader.nextInt();
        cliente1.setDni(dni);
        
        
        Scanner reader2 = new Scanner(System.in);
        System.out.println ("Ingrese el nombre del cliente");
        nombre = reader2.nextLine();
        cliente1.setNombre(nombre);
        
        
        Articulo articulo1 = new Articulo();
        Scanner reader3 = new Scanner(System.in);
        System.out.println ("Ingresar numero de codigo del articulo");
        codart= reader3.nextInt();
        articulo1.setCodart(codart);
        
        
        Scanner reader4 = new Scanner(System.in);
        System.out.println ("Ingresar el nombre articulo");
        art = reader4.nextLine();
        articulo1.setArt(art);
        
        
        Scanner reader5 = new Scanner(System.in);
        System.out.println ("Ingrese el monto final de la venta");
        precio = reader5.nextInt();
        venta1.setPrecio(precio);
        
        
        System.out.println("El codigo de venta ingresado es N°" +venta1.getCodventa() +"/");
        System.out.println("El dni ingresado es /" + cliente1.getDni()+"/");
        System.out.println ("El nombre del Cliente ingresado es/" + cliente1.getNombre()+"/");
        System.out.println ("El numero de codigo del articulo ingresado es/" + articulo1.getCodart() + "/");
        System.out.println ("El articulo ingresado es/" + articulo1.getArt() + "/");
        
        System.out.println ("El monto ingresado es $" + venta1.getPrecio());
        
        
    }
}
