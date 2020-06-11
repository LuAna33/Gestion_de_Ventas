
 import java.util.Scanner;
   public class  UIVentas{
     
       GestionArticulos gestorArticulos = new GestionArticulos();
                
       public void seleccionarOpcion() { 
           
           System.out.println ("Ingresar 1 para Agregar un articulo");       
           System.out.println ("Ingresar 2 para Eliminar un articulo");
           System.out.println ("Ingresar 3 para Actualizar un articulo");
           System.out.println ("Ingresar 4 para Listar los articulos");
           System.out.println ("Ingresar 5 para Finalizar");
               
           Scanner reader = new Scanner (System.in);
           int opcion = reader.nextInt();
          
           while ( opcion != 5) {
               
                 boolean a = false;
                
                if (opcion == 1){
                        
                    System.out.println ("Selecciono Agregar un Articulo");
                    
                    int cantidadEspaciosLibres = gestorArticulos.espacioDisponible();
                     
                    if (cantidadEspaciosLibres > 0){
                        Articulo entradaArticulo = entradaArticulo(new Scanner(System.in), new Scanner(System.in));
                        a = gestorArticulos.agregarArticulo (entradaArticulo);
                        
                        if (a = true){
                            System.out.println("Se agrego el articulo");
                        }else{
                        System.out.println ("No se ha podido agregar el articulo por falta de espacios libres");
                         }
                    }                               
                }
                
                if (opcion == 2){
                       System.out.println ("Eliminar un Articulo, ingresar posicion del mismo");
                       int posicion = reader.nextInt();                   
                       a = gestorArticulos.eliminarArticulo(posicion);
                       
                       if (a = true){
                           System.out.println("Se ha eliminado el articulo");
                       }
                        
                    else{
                        System.out.println ("No se ha podido eliminar el articulo");
                         }
                }
            
                if (opcion == 3){
                   System.out.println ("Actualizar un Articulo, ingrese la posicion del articulo que requiere actualizarse");
                   int posicion = reader.nextInt();
                   Articulo entradaArticulo = entradaArticulo(new Scanner(System.in), new Scanner(System.in));
                   a = gestorArticulos.actualizarArticulo(posicion, entradaArticulo);
                   
                   if (a = true){
                       System.out.println ("El articulo ha sido actualizado");
                   }
                   else{
                   System.out.println("No se ha actualizado el articulo");
                    }
                }
                    
                if (opcion == 4){
                   System.out.println ("Listar un Articulo");
                   gestorArticulos.listarArticuloColeccion();
                   
                } 
                
                   System.out.println ("Ingresar 1 para Agregar un articulo");       
                   System.out.println ("Ingresar 2 para Eliminar un articulo");
                   System.out.println ("Ingresar 3 para Actualizar un articulo");
                   System.out.println ("Ingresar 4 para Listar los articulos");
                   System.out.println ("Ingresar 5 para Finalizar");
                       
                   opcion = reader.nextInt();
                           
           }
           System.out.println (" Fin");
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
            
   }    
    


    