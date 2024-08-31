/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo.practico.pkg2;

/**
 *
 * @author usuario
 */
public class Persona {
    String nombre;
    Reloj unReloj;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.unReloj = null;
    }

    /*Persona(String santiago) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

  
    
    public void setReloj (Reloj reloj){
        this.unReloj = reloj;
    }
    public void decirHora(){
        if(unReloj != null){
            System.out.println("La hora es: " + unReloj.getHora());
            System.out.println("La fecha del dia es: " + unReloj.getDia());
            
        }else{
            System.out.println("No tengo reloj jeje");
        }
    }
    public void decirHora(Reloj reloj){
        System.out.println("La hora actual es: " + reloj.getHora());
        System.out.println("La fecha de hoy es: " + reloj.getDia());
    }
}
