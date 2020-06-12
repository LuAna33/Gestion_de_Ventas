
 import java.util.Scanner;

  public class  UIVentas{
     
       GestionArticulos gestionArticulos;
       Articulo[] articuloColeccion;
      
       
      public UIVentas(GestionArticulos gestionArticulos){
           this.gestionArticulos = gestionArticulos;
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
                                                                                    
                      if (gestionArticulos.espacioDisponible()){
                         Articulo entradaArticulo = entradaArticulo(new Scanner(System.in), new Scanner(System.in));
                        
                         if(gestionArticulos.agregarArticulo (entradaArticulo)){
                        
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
                       
                       if (gestionArticulos.posicionEncontrada(posicion)){
                           
                          if (gestionArticulos.eliminarArticulo(posicion)){
                             System.out.println("Se ha eliminado el articulo");
                          }
                          else{
                             System.out.println ("No se ha podido eliminar el articulo");
                          }
                       }
                       else{
                          System.out.println("POSICION INCORRECTA. Las posiciones existentes van de 0 a " + gestionArticulos.articuloColeccion.length );
                        }
                       break;
                
                case 3:
                       System.out.println ("Actualizar un Articulo, ingrese la posicion del articulo que requiere actualizarse");
                       posicion = reader.nextInt();
                       
                       if (gestionArticulos.posicionEncontrada(posicion)){
                           Articulo entradaArticulo = entradaArticulo(new Scanner(System.in), new Scanner(System.in));
                         
                           if (gestionArticulos.actualizarArticulo(posicion, entradaArticulo)){
                               System.out.println ("El articulo ha sido actualizado");
                           }
                           else{
                               System.out.println("No se ha actualizado el articulo");
                           }
                       }    
                       else{
                          System.out.println("POSICION INCORRECTA. Las posiciones existentes van de 0 a " + articuloColeccion.length );
                       }   
                       break;
                    
                case 4:
                       System.out.println ("Listar Articulos");
                       gestionArticulos.listarArticuloColeccion();
                   
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
    


    