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
public class TrabajoPractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona unaPerson = new Persona("Santiago");
        
        Reloj unReloj = new Reloj();
        //le da el relojj a la persona
        unaPerson.setReloj(unReloj);
        
        
        //da la fecha y la hora del momento
        unaPerson.decirHora();
        
        
        //Incrementa la horaque vos quieras
        unReloj.incrementarHora(3);
        unReloj.incrementarDia(1);
        
        //da la hora y fecha incrementada 
        unaPerson.decirHora(unReloj);
    }
    
}
