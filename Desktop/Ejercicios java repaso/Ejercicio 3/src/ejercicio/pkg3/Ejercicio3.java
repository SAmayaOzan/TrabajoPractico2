
package ejercicio.pkg3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collection;


public class Ejercicio3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        
        String respuesta;
        
       
      do{
             //aca le piden los datos de la pelicula
          System.out.println("Ingresar titulo de la pelicula");
          String titulo = scanner.nextLine();
          
          System.out.println("Ingresar director de la pelicula");
          String director = scanner.nextLine();
          
          System.out.println("Ingresar duracion de la pelicula");
          double duracion = scanner.nextDouble();
          scanner.nextLine();
          
          peliculas.add(new Pelicula(titulo,director,duracion));
          
          System.out.println("queres ingresar otra pelicula s/n");
          respuesta = scanner.nextLine();
      } while (respuesta.equalsIgnoreCase("s"));
      

       
    //A. Mostrar en pantalla todas las películas. 
        System.out.println("Aca estan todas la Peliculas");
        mostrarPeliculas(peliculas);
        
        
    //B. Mostrar en pantalla todas las películas
    //con una duración mayor a 1 hora. 
        System.out.println("Aca estan las pelicuas con duracion mayor a 1 hora");
        mostrarMayorDuracion(peliculas);
        
        System.out.println("Peliculas ordenadas de mayor a menor por duracion");
         peliculas.sort(Comparator.comparingDouble(Pelicula::getDuracion).reversed());
         mostrarPeliculas(peliculas);
         
         
        System.out.println("Peliculas ordenadas de menor amayor por duracion");
        peliculas.sort(Comparator.comparingDouble(Pelicula::getDuracion));
        mostrarPeliculas(peliculas);
        
        
        System.out.println("Peliculas ordenadas por Titulos alfabeticamente");
        peliculas.sort(Comparator.comparing(Pelicula::getTitulo));
        mostrarPeliculas(peliculas);
        
        System.out.println("Peliculas Ordenadas por Director Alfabeticamente");
        peliculas.sort(Comparator.comparing(Pelicula::getDirector));
        mostrarPeliculas(peliculas);
        scanner.close();
        }
     
  
   

    private static void mostrarPeliculas(ArrayList<Pelicula> peliculas) {
        for(Pelicula pelicula : peliculas){
            System.out.println("pelicula");
        }
        }

    private static void mostrarMayorDuracion(ArrayList<Pelicula> peliculas) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(Pelicula pelicula : peliculas){
            if(pelicula.getDuracion()>1){
                System.out.println(pelicula);
            }
            
        }
    
    }
        
   
    
    
    
 
    }
    

