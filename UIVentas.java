
 import java.util.Scanner;

 public class  UIVentas{
     
       ArticulosRepositorio articulosRepositorio;
       Articulo[] articuloColeccion;
      
       
      public UIVentas(ArticulosRepositorio articulosRepositorio){
           this.articulosRepositorio = articulosRepositorio;
      }
               
      public void seleccionarOpcion() { 
           
           System.out.println ("Ingresar 1 para Agregar un articulo");       
           System.out.println ("Ingresar 2 para Eliminar un articulo");
           System.out.println ("Ingresar 3 para Actualizar un articulo");
           System.out.println ("Ingresar 4 para Listar los articulos");
           System.out.println ("Ingresar 5 para Finalizar");
               
           Scanner reader = new Scanner (System.in);
           int opcion = reader.nextInt();

          while (opcion < 5){ 
             switch (opcion){
               
                case 1: 
                      System.out.println ("Agregar un Articulo");
                                                                                    
                      if (articulosRepositorio.espacioDisponible()){
                         ArticuloVenta entradaArticuloVenta = entradaArticuloVenta(new Scanner(System.in), new Scanner(System.in));
                        
                         if(articulosRepositorio.agregarArticulo (entradaArticuloVenta)){
                        
                            System.out.println("Se agrego el articulo");
                         }
                        
                         else{
                            System.out.println("No se agrego el articulo");
                         }
                      }    
                      else{
                         System.out.println ("No se ha podido agregar el articulo por falta de espacio disponible");
                         
                      }
                      break;
                   
                case 2:
                       System.out.println ("Eliminar un Articulo, ingresar posicion del mismo");
                       int posicion = reader.nextInt();                   
                       
                       if (articulosRepositorio.posicionEncontrada(posicion)){
                           
                          if (articulosRepositorio.eliminarArticulo(posicion)){
                             System.out.println("Se ha eliminado el articulo");
                          }
                          else{
                             System.out.println ("No se ha podido eliminar el articulo");
                          }
                       }
                       else{
                          System.out.println("POSICION INCORRECTA. Las posiciones existentes son " +articulosRepositorio.articuloColeccion.length + " iniciando en 0" );
                        }
                       break;
                
                case 3:
                       System.out.println ("Actualizar un Articulo, ingrese la posicion del articulo que requiere actualizarse");
                       posicion = reader.nextInt();
                       
                       if (articulosRepositorio.posicionEncontrada(posicion)){
                           ArticuloVenta entradaArticuloVenta = entradaArticuloVenta(new Scanner(System.in), new Scanner(System.in));
                         
                           if (articulosRepositorio.actualizarArticulo(posicion, entradaArticuloVenta)){
                               System.out.println ("El articulo ha sido actualizado");
                           }
                           else{
                               System.out.println("No se ha actualizado el articulo");
                           }
                       }    
                       else{
                          System.out.println("POSICION INCORRECTA. Las posiciones existentes son " +articulosRepositorio.articuloColeccion.length + " iniciando en 0");
                       }   
                       break;
                    
                case 4:
                       System.out.println ("Listar Articulos");
                       articulosRepositorio.listarArticuloColeccion();
                   
                       break; 
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
       
      public  ArticuloVenta entradaArticuloVenta(Scanner reader, Scanner reader1){
              
              String nombreArticulo;
              int codArt;
              double preciounit;
              int cantidad;
              int cantidadMinima;
              double descuentoPorcentaje;
              
              System.out.println ("<<<<<<Ingresar numero de codigo del articulo>>>>>>");
              codArt= reader.nextInt();
                   
              System.out.println ("<<<<<Ingresar el nombre del articulo>>>>>>");
              nombreArticulo = reader1.nextLine();
                   
              System.out.println ("<<<<<<Ingrese el precio por unidad del articulo>>>>>>");
              preciounit = reader.nextDouble();
              
              System.out.println ("<<<<<<Ingresar cantidad de Unidades por Articulo>>>>>>");
              cantidad= reader.nextInt();
              
              System.out.println("<<<<<<<Ingrese la cantidad minima para aplicar descuento por cantidad de productos comprados>>>>>>");
              cantidadMinima = reader.nextInt();
       
              System.out.println("<<<<<<<Ingrese el Porcentaje a aplicar del descuento por cantidad>>>>>>");
              descuentoPorcentaje = reader.nextDouble();
              return new ArticuloVenta (nombreArticulo,codArt, preciounit, cantidad, cantidadMinima, descuentoPorcentaje);
      }

   }    
   
    