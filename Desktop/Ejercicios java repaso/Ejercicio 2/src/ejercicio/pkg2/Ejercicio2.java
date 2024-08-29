
package ejercicio.pkg2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class Ejercicio2 {

   
    public static void main(String[] args) {
          ArrayList<String>raza = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String guard;
        
        do {
            System.out.println("Ingresar una raza de perro");
            String razas = scanner.nextLine();
            raza.add(razas);
            //.add agreaba un objeto a la lista
            
            
            
            System.out.println("Queres guardar otra raza perro? (si/no):");
            guard = scanner.nextLine();
            
        } while(guard.equalsIgnoreCase("si"));
        
        System.out.println("Estos son los perros que has guardado");
        for(String razas:raza){
            System.out.println(razas);
        }
        
        //uso del iterator hace que puedas eliminar un objeto de la lista
         System.out.println("Que raza queres eliminar?");
        String eliminado = scanner.nextLine();
        
        Iterator<String> iter = raza.iterator();
        boolean encontrar = false;
        
        while(iter.hasNext()){
            String razas = iter.next();
            if(razas.equalsIgnoreCase(eliminado)){
                iter.remove();
                encontrar=true;
                System.out.println("La raza " + eliminado + " fue eliminado");
            break;
            }
                
        }
        if(!encontrar){
            System.out.println("La raza " + eliminado + " no esta");
        } 
        
        
        Collections.sort(raza);
        System.out.println(" La lista de raza de perros Ordenadas ");
        for(String razas : raza){
            System.out.println(razas);
        }
        scanner.close();
       
    }
    
}
