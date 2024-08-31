/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo.practico.pkg2;

import java.time.LocalDate;
import java.time.LocalTime;
public class Reloj {
    LocalTime hora;
    LocalDate dia;

    public Reloj() {
        this.hora = LocalTime.now();
        this.dia = LocalDate.now();
    }

    /*Reloj() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    public LocalTime getHora() {
        return hora;
    }

    public LocalDate getDia() {
        return dia;
    }
    
    
   public void incrementarHora(int horas){
       this.hora = this.hora.plusHours(horas);
       System.out.println("La hora incrementada es : " + this.hora);
       
   }
   public void incrementarDia(int dias){
       this.dia = this.dia.plusDays(dias);
       System.out.println("El dia incrementado es: " + this.dia);
   }
    /*public void traducirFrecuencia(){
        System.out.println("Frecuen");
    }*/
   public void limpiarPantalla(){
       System.out.println("La pantalla esta limpia");
   }
}
